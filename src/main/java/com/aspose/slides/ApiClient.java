/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides;

import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.squareup.okhttp.logging.HttpLoggingInterceptor.Level;
import okio.BufferedSink;
import okio.Okio;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import javax.net.ssl.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.aspose.slides.auth.*;
import com.google.gson.reflect.TypeToken;

public class ApiClient {

    private String baseUrl;
    private boolean debugging = false;
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
    private String tempFolderPath = null;

    private Authentication authentication;

    private DateFormat dateFormat;
    private DateFormat datetimeFormat;
    private boolean lenientDatetimeFormat;
    private int dateLength;

    private InputStream sslCaCert;
    private boolean verifyingSsl;
    private KeyManager[] keyManagers;

    private OkHttpClient httpClient;
    private JSON json;
    private String version;

    private HttpLoggingInterceptor loggingInterceptor;

    /*
     * Constructor for ApiClient
     */
    public ApiClient(Configuration configuration) {
        this(
            configuration.getUrl(),
            new JWTAuth(configuration),
            configuration.getDebug(),
            configuration.getTimeout(),
            configuration.getAllowInsecureRequests(),
            configuration.getCustomHeaders());
    }

    /*
     * Constructor for ApiClient
     */
    public ApiClient(String baseUrl, Authentication authentication) {
        this(baseUrl, authentication, false, 0, false, null);
    }

    /*
     * Constructor for ApiClient
     */
    private ApiClient(String baseUrl, Authentication authentication, Boolean debugging, Integer timeout, Boolean allowInsecureRequests, Map<String, String> customHeaders) {
        this.baseUrl = baseUrl;
        this.authentication = authentication;
        httpClient = new OkHttpClient();
        List<Protocol> protocols = new ArrayList<Protocol>();
        protocols.add(Protocol.HTTP_1_1);
        httpClient.setProtocols(protocols);
        httpClient.setConnectTimeout(1, TimeUnit.MINUTES);
        httpClient.setReadTimeout(1, TimeUnit.MINUTES);
        httpClient.setWriteTimeout(1, TimeUnit.MINUTES);
        setDebugging(debugging);
        setVerifyingSsl(!allowInsecureRequests);
        json = new JSON();

        addDefaultHeader("x-aspose-client", "java sdk v" + getVersion());
        if (timeout > 0) {
            addDefaultHeader("x-aspose-timeout", timeout.toString());
        }
        if (customHeaders != null) {
            for (String key : customHeaders.keySet()) {
                addDefaultHeader(key, customHeaders.get(key));
            }
        }
    }

    /**
     * Get base url
     *
     * @return Base url
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Set base url
     *
     * @param baseUrl Base url of the URL (e.g https://api-dev.aspose.cloud/v1.1
     * @return An instance of OkHttpClient
     */
    public ApiClient setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Get HTTP client
     *
     * @return An instance of OkHttpClient
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Set HTTP client
     *
     * @param httpClient An instance of OkHttpClient
     * @return Api Client
     */
    public ApiClient setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Get JSON
     *
     * @return JSON object
     */
    public JSON getJSON() {
        return json;
    }

    /**
     * Set JSON
     *
     * @param json JSON object
     * @return Api client
     */
    public ApiClient setJSON(JSON json) {
        this.json = json;
        return this;
    }

    /**
     * True if isVerifyingSsl flag is on
     *
     * @return True if isVerifySsl flag is on
     */
    public boolean isVerifyingSsl() {
        return verifyingSsl;
    }

    /**
     * Configure whether to verify certificate and hostname when making https requests.
     * Default to true.
     * NOTE: Do NOT set to false in production code, otherwise you would face multiple types of cryptographic attacks.
     *
     * @param verifyingSsl True to verify TLS/SSL connection
     * @return ApiClient
     */
    public ApiClient setVerifyingSsl(boolean verifyingSsl) {
        this.verifyingSsl = verifyingSsl;
        applySslSettings();
        return this;
    }

    /**
     * Get SSL CA cert.
     *
     * @return Input stream to the SSL CA cert
     */
    public InputStream getSslCaCert() {
        return sslCaCert;
    }

    /**
     * Configure the CA certificate to be trusted when making https requests.
     * Use null to reset to default.
     *
     * @param sslCaCert input stream for SSL CA cert
     * @return ApiClient
     */
    public ApiClient setSslCaCert(InputStream sslCaCert) {
        this.sslCaCert = sslCaCert;
        applySslSettings();
        return this;
    }

    public KeyManager[] getKeyManagers() {
        return keyManagers;
    }

    /**
     * Configure client keys to use for authorization in an SSL session.
     * Use null to reset to default.
     *
     * @param managers The KeyManagers to use
     * @return ApiClient
     */
    public ApiClient setKeyManagers(KeyManager[] managers) {
        this.keyManagers = managers;
        applySslSettings();
        return this;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public ApiClient setDateFormat(DateFormat dateFormat) {
        this.json.setDateFormat(dateFormat);
        return this;
    }

    public ApiClient setSqlDateFormat(DateFormat dateFormat) {
        this.json.setSqlDateFormat(dateFormat);
        return this;
    }

    public ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        this.json.setOffsetDateTimeFormat(dateFormat);
        return this;
    }

    public ApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
        this.json.setLocalDateFormat(dateFormat);
        return this;
    }

    public ApiClient setLenientOnJson(boolean lenientOnJson) {
        this.json.setLenientOnJson(lenientOnJson);
        return this;
    }

    /**
     * Add a default header.
     *
     * @param key The header's key
     * @param value The header's value
     * @return ApiClient
     */
    private ApiClient addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
        return this;
    }

    /**
     * Check that whether debugging is enabled for this API client.
     *
     * @return True if debugging is enabled, false otherwise.
     */
    public boolean isDebugging() {
        return debugging;
    }

    /**
     * Enable/disable debugging for this API client.
     *
     * @param debugging To enable (true) or disable (false) debugging
     * @return ApiClient
     */
    public ApiClient setDebugging(boolean debugging) {
        if (debugging != this.debugging) {
            if (debugging) {
                loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(Level.BODY);
                httpClient.interceptors().add(loggingInterceptor);
            } else {
                httpClient.interceptors().remove(loggingInterceptor);
                loggingInterceptor = null;
            }
        }
        this.debugging = debugging;
        return this;
    }

    /**
     * The path of temporary folder used to store downloaded files from endpoints
     * with file response. The default value is <code>null</code>, i.e. using
     * the system's default tempopary folder.
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile">createTempFile</a>
     * @return Temporary folder path
     */
    public String getTempFolderPath() {
        return tempFolderPath;
    }

    /**
     * Set the temporary folder path (for downloading files)
     *
     * @param tempFolderPath Temporary folder path
     * @return ApiClient
     */
    public ApiClient setTempFolderPath(String tempFolderPath) {
        this.tempFolderPath = tempFolderPath;
        return this;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getConnectTimeout() {
        return httpClient.getConnectTimeout();
    }

    /**
     * Sets the connect timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     *
     * @param connectionTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setConnectTimeout(int connectionTimeout) {
        httpClient.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get read timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getReadTimeout() {
        return httpClient.getReadTimeout();
    }

    /**
     * Sets the read timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     *
     * @param readTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setReadTimeout(int readTimeout) {
        httpClient.setReadTimeout(readTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get write timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getWriteTimeout() {
        return httpClient.getWriteTimeout();
    }

    /**
     * Sets the write timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     *
     * @param writeTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setWriteTimeout(int writeTimeout) {
        httpClient.setWriteTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Parameter
     * @return String representation of the parameter
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date || param instanceof OffsetDateTime || param instanceof LocalDate) {
            //Serialize to json string and remove the " enclosing characters
            String jsonStr = json.serialize(param);
            return jsonStr.substring(1, jsonStr.length() - 1);
        } else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Collection)param) {
                if (b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else if (param.getClass().isEnum()) {
            return param.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /**
     * Adds the specified query parameter to a list.
     *
     * Note that {@code value} must not be a collection.
     *
     * @param parameters PArameter list.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     */
    public void addQueryParameter(List<Pair> parameters, String name, Object value) {
        if (name != null && !name.isEmpty() && value != null) {
            parameters.add(new Pair(name, parameterToString(value)));
        }
    }

    /**
     * Formats the specified collection query parameters to a list of {@code Pair} objects.
     *
     * Note that the values of each of the returned Pair objects are percent-encoded.
     *
     * @param collectionFormat The collection format of the parameter.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list of {@code Pair} objects.
     */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
            return params;
        }

        // create the params based on the collection format
        if ("multi".equals(collectionFormat)) {
            for (Object item : value) {
                params.add(new Pair(name, escapeString(parameterToString(item))));
            }
            return params;
        }

        // collectionFormat is assumed to be "csv" by default
        String delimiter = ",";

        // escape all delimiters except commas, which are URI reserved
        // characters
        if ("ssv".equals(collectionFormat)) {
            delimiter = escapeString(" ");
        } else if ("tsv".equals(collectionFormat)) {
            delimiter = escapeString("\t");
        } else if ("pipes".equals(collectionFormat)) {
            delimiter = escapeString("|");
        }

        StringBuilder sb = new StringBuilder() ;
        for (Object item : value) {
            sb.append(delimiter);
            sb.append(escapeString(parameterToString(item)));
        }

        params.add(new Pair(name, sb.substring(delimiter.length())));

        return params;
    }

    /**
     * Sanitize filename by removing path.
     * e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    public String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "").replaceAll(";", "");
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     *   application/vnd.company+json
     * "* / *" is also default to JSON
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
      String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
      return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *   if JSON exists in the given array, use it;
     *   otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     *   null will be returned (not to set the Accept header explicitly).
     */
    public String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return StringUtil.join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     *   if JSON exists in the given array, use it;
     *   otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     *   or matches "any", JSON will be used.
     */
    public String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
             return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Deserialize response body to Java object, according to the return type and
     * the Content-Type response header.
     *
     * @param <T> Type
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response body, i.e. cannot read response body
     *   or the Content-Type of the response is not supported.
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(Response response, Type returnType) throws ApiException {
        if (response == null || returnType == null) {
            return null;
        }

        if ("byte[]".equals(returnType.toString())) {
            // Handle binary response (byte array).
            try {
                return (T) response.body().bytes();
            } catch (IOException e) {
                throw new ApiException(e);
            }
        } else if (returnType.equals(File.class)) {
            // Handle file downloading.
            return (T) downloadFileFromResponse(response);
        }

        String respBody;
        try {
            if (response.body() != null)
                respBody = response.body().string();
            else
                respBody = null;
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || "".equals(respBody)) {
            return null;
        }

        String contentType = response.headers().get("Content-Type");
        if (contentType == null) {
            // ensuring a default content type
            contentType = "application/json";
        }
        if (isJsonMime(contentType)) {
            return json.deserialize(respBody, returnType);
        } else if (returnType.equals(String.class)) {
            // Expecting string, return the raw response body.
            return (T) respBody;
        } else {
            throw new ApiException(
                    "Content type \"" + contentType + "\" is not supported for type: " + returnType,
                    response.code(),
                    response.headers().toMultimap(),
                    respBody);
        }
    }

    /**
     * Serialize the given Java object into request body according to the object's
     * class and the request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws ApiException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType, List<FileInfo> files) throws ApiException {
        if ((files != null && files.size() > 0) || obj instanceof byte[] || obj instanceof File) {
            Map<String, Object> parts = new LinkedHashMap<String, Object>();
            if (obj != null) {
                parts.put("data", obj);
            }
            if (files != null) {
                int i = 0;
                for (FileInfo file : files) {
                    String name = file.getName();
                    if (name == null) {
                        name = "file" + (++i);
                    }
                    parts.put(name, file);
                }
            }
            return buildRequestBodyMultipart(parts);
        } else if (obj instanceof String) {
            // Binary (byte array) body parameter support.
            return RequestBody.create(MediaType.parse("application/json"), (String) obj);
        } else {
            String content = "";
            if (obj != null) {
                content = json.serialize(obj);
            }
            return RequestBody.create(MediaType.parse("application/json"), content);
        }
    }

    /**
     * Download file from the given response.
     *
     * @param response An instance of the Response object
     * @throws ApiException If fail to read file content from response and write to disk
     * @return Downloaded file
     */
    public File downloadFileFromResponse(Response response) throws ApiException {
        try {
            File file = prepareDownloadFile(response);
            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
            return file;
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Prepare file for download
     *
     * @param response An instance of the Response object
     * @throws IOException If fail to prepare file for download
     * @return Prepared file for the download
     */
    public File prepareDownloadFile(Response response) throws IOException {
        String filename = null;
        String contentDisposition = response.header("Content-Disposition");
        if (contentDisposition != null && !"".equals(contentDisposition)) {
            // Get filename from the Content-Disposition header.
            Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
            Matcher matcher = pattern.matcher(contentDisposition);
            if (matcher.find()) {
                filename = sanitizeFilename(matcher.group(1));
            }
        }

        String prefix = null;
        String suffix = null;
        if (filename == null) {
            prefix = "download-";
            suffix = "";
        } else {
            int pos = filename.lastIndexOf(".");
            if (pos == -1) {
                prefix = filename + "-";
            } else {
                prefix = filename.substring(0, pos) + "-";
                suffix = filename.substring(pos);
            }
            // File.createTempFile requires the prefix to be at least three characters long
            if (prefix.length() < 3)
                prefix = "download-";
        }

        if (tempFolderPath == null)
            return File.createTempFile(prefix, suffix);
        else
            return File.createTempFile(prefix, suffix, new File(tempFolderPath));
    }

    /**
     * {@link #execute(Call, Type)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @throws ApiException If fail to execute the call
     * @return ApiResponse&lt;T&gt;
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T> The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     *   data, which is a Java object deserialized from response body and would be null
     *   when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * {@link #executeAsync(Call, Type, ApiCallback)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * Execute HTTP call asynchronously.
     *
     * @see #execute(Call, Type)
     * @param <T> Type
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     */

    @SuppressWarnings("unchecked")
    public <T> void executeAsync(final Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } catch (NeedRepeatRequestException e) {
                    repeatExecuteAsync(call, returnType, callback);
                    return;
                } catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    private <T> void repeatExecuteAsync(final Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param <T> Type
     * @param response Response
     * @param returnType Return type
     * @throws ApiException If the response has a unsuccessful status code or
     *   fail to deserialize the response body
     * @return Type
     */
    public <T> T handleResponse(Response response, Type returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null || response.code() == 204) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } catch (IOException e) {
                        throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                    }
                }
                return null;
            } else {
                return deserialize(response, returnType);
            }
        } else {
            try {
                authentication.handleBadResponse(response);
            } catch (IOException ex) {
                throw new ApiException(response.message(), ex, response.code(), response.headers().toMultimap());
            }
            if (response.body() != null) {
                String respBody;
                try {
                    respBody = response.body().string();
                } catch (IOException ex) {
                    throw new ApiException(response.message(), ex, response.code(), response.headers().toMultimap());
                }
                ErrorMessage message;
                try {
                    message = json.deserialize(respBody, new TypeToken<ErrorMessage>(){}.getType());
                } catch (Exception e) {
                    throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
                }
                String errorMessage = message.getMessage();
                if (errorMessage == null && message.getError() != null) {
                    errorMessage = message.getError().getMessage();
                }
                throw new ApiException(errorMessage, response.code(), response.headers().toMultimap(), null);
            }
            throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), null);
        }
    }

    /**
     * Build HTTP call with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param progressRequestListener Progress request listener
     * @return The HTTP call
     * @throws ApiException If fail to serialize the request body object
     */
    public Call buildCall(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Request request = buildRequest(path, method, queryParams, body, headerParams, formParams, progressRequestListener);
        return httpClient.newCall(request);
    }

    /**
     * Build an HTTP request with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param progressRequestListener Progress request listener
     * @return The HTTP request 
     * @throws ApiException If fail to serialize the request body object
     */
    public Request buildRequest(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (headerParams == null) {
            headerParams = new HashMap<String, String>();
        }
        authentication.updateHeaderParams(headerParams);
        final Request.Builder reqBuilder = new Request.Builder().url(buildUrl(path, queryParams));
        processHeaderParams(headerParams, reqBuilder);

        String contentType = (String) headerParams.get("Content-Type");
        // ensuring a default content type
        if (contentType == null) {
            contentType = "application/json";
        }
        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } else if ("application/x-www-form-urlencoded".equals(contentType)) {
            reqBody = buildRequestBodyFormEncoding(formParams);
        } else if (formParams.size() > 0) {
            List<FileInfo> files = null;
            Object[] bodyParts = null;
            if (List.class.isAssignableFrom(formParams.values().toArray()[0].getClass())) {
                files = (List<FileInfo>)formParams.values().toArray()[0];
            } else {
                bodyParts = formParams.values().toArray();
            }
            int partCount = (body != null ? 1 : 0) + (files != null ? files.size() : 0) + (bodyParts != null ? bodyParts.length : 0);
            if (partCount > 1) {
                Map<String, Object> parts = new LinkedHashMap<String, Object>();
                if (body != null) {
                    parts.put("body", body);
                }
                int fileIndex = 0;
                if (files != null) {
                    for (FileInfo file : files) {
                        fileIndex++;
                        parts.put("file" + fileIndex, file);
                    }
                }
                if (bodyParts != null) {
                    for (Object part : bodyParts) {
                        fileIndex++;
                        parts.put("file" + fileIndex, part);
                    }
                }
                reqBody = buildRequestBodyMultipart(parts);
            } else {
                if (files != null) {
                    reqBody = serialize(files.toArray()[0], contentType, null);
                } else {
                    reqBody = serialize(bodyParts[0], contentType, null);
                }
            }
        } else if (formParams.size() > 1) {
            reqBody = buildRequestBodyMultipart(formParams);
        } else if (formParams.size() == 1) {
            reqBody = serialize(formParams.values().toArray()[0], contentType, null);
        } else {
            reqBody = serialize(body, contentType, null);
        }
        Request request = null;
        if(progressRequestListener != null && reqBody != null) {
            ProgressRequestBody progressRequestBody = new ProgressRequestBody(reqBody, progressRequestListener);
            request = reqBuilder.method(method, progressRequestBody).build();
        } else {
            request = reqBuilder.method(method, reqBody).build();
        }
        return request;
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @return The full URL
     */
    public String buildUrl(String path, List<Pair> queryParams) {
        final StringBuilder url = new StringBuilder();
        url.append(baseUrl).append(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Pair param : queryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getName())).append("=").append(escapeString(value));
                }
            }
        }
        return url.toString();
    }

    /**
     * Set header parameters to the request builder, including default headers.
     *
     * @param headerParams Header parameters in the ofrm of Map
     * @param reqBuilder Reqeust.Builder
     */
    public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder) {
        for (Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
        }
        for (Entry<String, String> header : defaultHeaderMap.entrySet()) {
            if (!headerParams.containsKey(header.getKey())) {
                reqBuilder.header(header.getKey(), parameterToString(header.getValue()));
            }
        }
    }

    /**
     * Build a form-encoding request body with the given form parameters.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams) {
        FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
        for (Entry<String, Object> param : formParams.entrySet()) {
            formBuilder.add(param.getKey(), parameterToString(param.getValue()));
        }
        return formBuilder.build();
    }

    /**
     * Build a multipart (file uploading) request body with the given form parameters,
     * which could contain text fields and file fields.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
        MultipartBuilder mpBuilder = new MultipartBuilder().type(MultipartBuilder.FORM);
        int partIndex = 1;
        for (Entry<String, Object> param : formParams.entrySet()) {
            String fileName = "file" + partIndex;
            if (param.getValue() instanceof File) {
                File file = (File) param.getValue();
                if (file.getName() != null && file.getName() != "") {
                    fileName = file.getName();
                }
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"; filename=\"" + fileName + "\"");
                MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
                mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file));
            } else if (param.getValue() instanceof byte[]) {
                byte[] bytes = (byte[]) param.getValue();
                if (param.getKey() != null && param.getKey() != "") {
                    fileName = param.getKey();
                }
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"; filename=\"" + fileName + "\"");
                MediaType mediaType = MediaType.parse("application/octet-stream");
                mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, bytes));
            } else if (param.getValue() instanceof FileInfo) {
                FileInfo file = (FileInfo) param.getValue();
                if (file.getName() != null && file.getName() != "") {
                    fileName = file.getName();
                }
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"; filename=\"" + fileName + "\"");
                MediaType mediaType = MediaType.parse(file.getMimeType() == null ? "application/octet-stream" : file.getMimeType());
                mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file.getData()));
            } else {
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"");
                mpBuilder.addPart(partHeaders, RequestBody.create(null, json.serialize(param.getValue())));
            }
            partIndex++;
        }
        return mpBuilder.build();
    }

    /**
     * Guess Content-Type header from the given file (defaults to "application/octet-stream").
     *
     * @param file The given file
     * @return The guessed Content-Type
     */
    public String guessContentTypeFromFile(File file) {
        String contentType = URLConnection.guessContentTypeFromName(file.getName());
        if (contentType == null) {
            return "application/octet-stream";
        } else {
            return contentType;
        }
    }

    public String objectToString(Object object) {
        if (object == null) {
            return "";
        }
        return object.toString();
    }
    
    private String getVersion() {
        if (version == null) {
            InputStream propertiesStream = getClass().getResourceAsStream("/project.properties");
            Properties properties = new Properties();
            try
            {
                properties.load(propertiesStream);
            } catch (IOException ex) {
                //allow to return null if the properties are not available
            }
            version = properties.getProperty("version");
        }
        return version;
    }

    /**
     * Apply SSL related settings to httpClient according to the current values of
     * verifyingSsl and sslCaCert.
     */
    private void applySslSettings() {
        try {
            TrustManager[] trustManagers = null;
            HostnameVerifier hostnameVerifier = null;
            if (!verifyingSsl) {
                TrustManager trustAll = new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
                    @Override
                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
                    @Override
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                };
                SSLContext sslContext = SSLContext.getInstance("TLS");
                trustManagers = new TrustManager[]{ trustAll };
                hostnameVerifier = new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) { return true; }
                };
            } else if (sslCaCert != null) {
                char[] password = null; // Any password will work.
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(sslCaCert);
                if (certificates.isEmpty()) {
                    throw new IllegalArgumentException("expected non-empty set of trusted certificates");
                }
                KeyStore caKeyStore = newEmptyKeyStore(password);
                int index = 0;
                for (Certificate certificate : certificates) {
                    String certificateAlias = "ca" + Integer.toString(index++);
                    caKeyStore.setCertificateEntry(certificateAlias, certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(caKeyStore);
                trustManagers = trustManagerFactory.getTrustManagers();
            }

            if (keyManagers != null || trustManagers != null) {
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(keyManagers, trustManagers, new SecureRandom());
                httpClient.setSslSocketFactory(sslContext.getSocketFactory());
            } else {
                httpClient.setSslSocketFactory(null);
            }
            httpClient.setHostnameVerifier(hostnameVerifier);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    private KeyStore newEmptyKeyStore(char[] password) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, password);
            return keyStore;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
