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

package com.aspose.slides.api;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aspose.slides.ApiException;
import com.aspose.slides.FileInfo;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;

import com.aspose.slides.model.ApiInfo;
import com.aspose.slides.model.ColorScheme;
import com.aspose.slides.model.DiscUsage;
import com.aspose.slides.model.Document;
import com.aspose.slides.model.DocumentProperties;
import com.aspose.slides.model.DocumentProperty;
import com.aspose.slides.model.DocumentReplaceResult;
import com.aspose.slides.model.Effect;
import com.aspose.slides.model.ExportOptions;
import java.io.File;
import com.aspose.slides.model.FileVersions;
import com.aspose.slides.model.FilesList;
import com.aspose.slides.model.FilesUploadResult;
import com.aspose.slides.model.FontScheme;
import com.aspose.slides.model.FormatScheme;
import com.aspose.slides.model.IShapeExportOptions;
import com.aspose.slides.model.Images;
import com.aspose.slides.model.InteractiveSequence;
import com.aspose.slides.model.LayoutSlide;
import com.aspose.slides.model.LayoutSlides;
import com.aspose.slides.model.MasterSlide;
import com.aspose.slides.model.MasterSlides;
import com.aspose.slides.model.NotesSlide;
import com.aspose.slides.model.ObjectExist;
import com.aspose.slides.model.OrderedMergeRequest;
import com.aspose.slides.model.Paragraph;
import com.aspose.slides.model.Paragraphs;
import com.aspose.slides.model.Pipeline;
import com.aspose.slides.model.Placeholder;
import com.aspose.slides.model.Placeholders;
import com.aspose.slides.model.Portion;
import com.aspose.slides.model.Portions;
import com.aspose.slides.model.PresentationsMergeRequest;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.Shapes;
import com.aspose.slides.model.Slide;
import com.aspose.slides.model.SlideAnimation;
import com.aspose.slides.model.SlideBackground;
import com.aspose.slides.model.SlideComments;
import com.aspose.slides.model.SlideReplaceResult;
import com.aspose.slides.model.Slides;
import com.aspose.slides.model.SplitDocumentResult;
import com.aspose.slides.model.StorageExist;
import com.aspose.slides.model.TextItems;
import com.aspose.slides.model.Theme;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.CopyFileRequest;
import com.aspose.slides.model.request.CopyFolderRequest;
import com.aspose.slides.model.request.CreateFolderRequest;
import com.aspose.slides.model.request.DeleteFileRequest;
import com.aspose.slides.model.request.DeleteFolderRequest;
import com.aspose.slides.model.request.DeleteNotesSlideRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphsRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionsRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapeRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapesRequest;
import com.aspose.slides.model.request.DeleteParagraphRequest;
import com.aspose.slides.model.request.DeleteParagraphsRequest;
import com.aspose.slides.model.request.DeletePortionRequest;
import com.aspose.slides.model.request.DeletePortionsRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationEffectRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequenceRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationInteractiveSequencesRequest;
import com.aspose.slides.model.request.DeleteSlideAnimationMainSequenceRequest;
import com.aspose.slides.model.request.DeleteSlideByIndexRequest;
import com.aspose.slides.model.request.DeleteSlideShapeRequest;
import com.aspose.slides.model.request.DeleteSlideShapesRequest;
import com.aspose.slides.model.request.DeleteSlidesCleanSlidesListRequest;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.DeleteSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.DownloadFileRequest;
import com.aspose.slides.model.request.GetDiscUsageRequest;
import com.aspose.slides.model.request.GetFileVersionsRequest;
import com.aspose.slides.model.request.GetFilesListRequest;
import com.aspose.slides.model.request.GetLayoutSlideRequest;
import com.aspose.slides.model.request.GetLayoutSlidesListRequest;
import com.aspose.slides.model.request.GetMasterSlideRequest;
import com.aspose.slides.model.request.GetMasterSlidesListRequest;
import com.aspose.slides.model.request.GetNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapesRequest;
import com.aspose.slides.model.request.GetNotesSlideWithFormatRequest;
import com.aspose.slides.model.request.GetParagraphPortionRequest;
import com.aspose.slides.model.request.GetParagraphPortionsRequest;
import com.aspose.slides.model.request.GetSlideAnimationRequest;
import com.aspose.slides.model.request.GetSlideShapeRequest;
import com.aspose.slides.model.request.GetSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetSlideShapesRequest;
import com.aspose.slides.model.request.GetSlidesApiInfoRequest;
import com.aspose.slides.model.request.GetSlidesDocumentRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.GetSlidesImageWithDefaultFormatRequest;
import com.aspose.slides.model.request.GetSlidesImageWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesImagesRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholderRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholdersRequest;
import com.aspose.slides.model.request.GetSlidesPresentationTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlideRequest;
import com.aspose.slides.model.request.GetSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.GetSlidesSlideCommentsRequest;
import com.aspose.slides.model.request.GetSlidesSlideImagesRequest;
import com.aspose.slides.model.request.GetSlidesSlideTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlidesListRequest;
import com.aspose.slides.model.request.GetSlidesThemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeColorSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFontSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFormatSchemeRequest;
import com.aspose.slides.model.request.MoveFileRequest;
import com.aspose.slides.model.request.MoveFolderRequest;
import com.aspose.slides.model.request.ObjectExistsRequest;
import com.aspose.slides.model.request.PostAddNewParagraphRequest;
import com.aspose.slides.model.request.PostAddNewPortionRequest;
import com.aspose.slides.model.request.PostAddNewShapeRequest;
import com.aspose.slides.model.request.PostAddNotesSlideRequest;
import com.aspose.slides.model.request.PostCopyLayoutSlideFromSourcePresentationRequest;
import com.aspose.slides.model.request.PostCopyMasterSlideFromSourcePresentationRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewParagraphRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewPortionRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewShapeRequest;
import com.aspose.slides.model.request.PostNotesSlideShapeSaveAsRequest;
import com.aspose.slides.model.request.PostPresentationMergeRequest;
import com.aspose.slides.model.request.PostShapeSaveAsRequest;
import com.aspose.slides.model.request.PostSlideAnimationEffectRequest;
import com.aspose.slides.model.request.PostSlideAnimationInteractiveSequenceRequest;
import com.aspose.slides.model.request.PostSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.PostSlideSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesAddRequest;
import com.aspose.slides.model.request.PostSlidesConvertRequest;
import com.aspose.slides.model.request.PostSlidesCopyRequest;
import com.aspose.slides.model.request.PostSlidesDocumentRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromHtmlRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromSourceRequest;
import com.aspose.slides.model.request.PostSlidesDocumentFromTemplateRequest;
import com.aspose.slides.model.request.PostSlidesPipelineRequest;
import com.aspose.slides.model.request.PostSlidesPresentationReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesReorderRequest;
import com.aspose.slides.model.request.PostSlidesReorderManyRequest;
import com.aspose.slides.model.request.PostSlidesSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesSetDocumentPropertiesRequest;
import com.aspose.slides.model.request.PostSlidesSlideReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesSplitRequest;
import com.aspose.slides.model.request.PutLayoutSlideRequest;
import com.aspose.slides.model.request.PutNotesSlideShapeSaveAsRequest;
import com.aspose.slides.model.request.PutPresentationMergeRequest;
import com.aspose.slides.model.request.PutSetParagraphPortionPropertiesRequest;
import com.aspose.slides.model.request.PutSetParagraphPropertiesRequest;
import com.aspose.slides.model.request.PutShapeSaveAsRequest;
import com.aspose.slides.model.request.PutSlideAnimationRequest;
import com.aspose.slides.model.request.PutSlideAnimationEffectRequest;
import com.aspose.slides.model.request.PutSlideAnimationInteractiveSequenceEffectRequest;
import com.aspose.slides.model.request.PutSlideSaveAsRequest;
import com.aspose.slides.model.request.PutSlideShapeInfoRequest;
import com.aspose.slides.model.request.PutSlidesConvertRequest;
import com.aspose.slides.model.request.PutSlidesDocumentFromHtmlRequest;
import com.aspose.slides.model.request.PutSlidesSaveAsRequest;
import com.aspose.slides.model.request.PutSlidesSetDocumentPropertyRequest;
import com.aspose.slides.model.request.PutSlidesSlideRequest;
import com.aspose.slides.model.request.PutSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.PutSlidesSlideBackgroundColorRequest;
import com.aspose.slides.model.request.PutSlidesSlideSizeRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.StorageExistsRequest;
import com.aspose.slides.model.request.UploadFileRequest;

/**
 * API tests for SlidesApi
 */
public class SlidesApiTest extends ApiTest {

    private final SlidesApi api = new SlidesApi(getConfiguration());

    
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileTest() throws ApiException, Exception {
        initialize("copyFile", null, null);
        ;
        CopyFileRequest request = createCopyFileRequest();
        api.copyFile(request);
    }

    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileInvalidSrcPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFileRequest request = createCopyFileRequest();
        try {
            request.setSrcPath((String)invalidizeTestValue("String", request.getSrcPath(), "copyFile", "srcPath"));
            initialize("copyFile", "srcPath", request.getSrcPath());
            api.copyFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcPath", "copyFile", request.getSrcPath());
        }
        if (needAssertResponse) {
            assertResponse("srcPath", "copyFile");
        }
    }
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileInvalidDestPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFileRequest request = createCopyFileRequest();
        try {
            request.setDestPath((String)invalidizeTestValue("String", request.getDestPath(), "copyFile", "destPath"));
            initialize("copyFile", "destPath", request.getDestPath());
            api.copyFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destPath", "copyFile", request.getDestPath());
        }
        if (needAssertResponse) {
            assertResponse("destPath", "copyFile");
        }
    }
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileInvalidSrcStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFileRequest request = createCopyFileRequest();
        try {
            request.setSrcStorageName((String)invalidizeTestValue("String", request.getSrcStorageName(), "copyFile", "srcStorageName"));
            initialize("copyFile", "srcStorageName", request.getSrcStorageName());
            api.copyFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcStorageName", "copyFile", request.getSrcStorageName());
        }
        if (needAssertResponse) {
            assertResponse("srcStorageName", "copyFile");
        }
    }
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileInvalidDestStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFileRequest request = createCopyFileRequest();
        try {
            request.setDestStorageName((String)invalidizeTestValue("String", request.getDestStorageName(), "copyFile", "destStorageName"));
            initialize("copyFile", "destStorageName", request.getDestStorageName());
            api.copyFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destStorageName", "copyFile", request.getDestStorageName());
        }
        if (needAssertResponse) {
            assertResponse("destStorageName", "copyFile");
        }
    }
    /**
     * Copy file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFileInvalidVersionIdTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFileRequest request = createCopyFileRequest();
        try {
            request.setVersionId((String)invalidizeTestValue("String", request.getVersionId(), "copyFile", "versionId"));
            initialize("copyFile", "versionId", request.getVersionId());
            api.copyFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "versionId", "copyFile", request.getVersionId());
        }
        if (needAssertResponse) {
            assertResponse("versionId", "copyFile");
        }
    }

    private CopyFileRequest createCopyFileRequest() {
        CopyFileRequest request = new CopyFileRequest();
        request.setSrcPath((String)getTestValue("String", "copyFile", "srcPath"));
        request.setDestPath((String)getTestValue("String", "copyFile", "destPath"));
        request.setSrcStorageName((String)getTestValue("String", "copyFile", "srcStorageName"));
        request.setDestStorageName((String)getTestValue("String", "copyFile", "destStorageName"));
        request.setVersionId((String)getTestValue("String", "copyFile", "versionId"));
        return request;
    }
    
    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderTest() throws ApiException, Exception {
        initialize("copyFolder", null, null);
        ;
        CopyFolderRequest request = createCopyFolderRequest();
        api.copyFolder(request);
    }

    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderInvalidSrcPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFolderRequest request = createCopyFolderRequest();
        try {
            request.setSrcPath((String)invalidizeTestValue("String", request.getSrcPath(), "copyFolder", "srcPath"));
            initialize("copyFolder", "srcPath", request.getSrcPath());
            api.copyFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcPath", "copyFolder", request.getSrcPath());
        }
        if (needAssertResponse) {
            assertResponse("srcPath", "copyFolder");
        }
    }
    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderInvalidDestPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFolderRequest request = createCopyFolderRequest();
        try {
            request.setDestPath((String)invalidizeTestValue("String", request.getDestPath(), "copyFolder", "destPath"));
            initialize("copyFolder", "destPath", request.getDestPath());
            api.copyFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destPath", "copyFolder", request.getDestPath());
        }
        if (needAssertResponse) {
            assertResponse("destPath", "copyFolder");
        }
    }
    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderInvalidSrcStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFolderRequest request = createCopyFolderRequest();
        try {
            request.setSrcStorageName((String)invalidizeTestValue("String", request.getSrcStorageName(), "copyFolder", "srcStorageName"));
            initialize("copyFolder", "srcStorageName", request.getSrcStorageName());
            api.copyFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcStorageName", "copyFolder", request.getSrcStorageName());
        }
        if (needAssertResponse) {
            assertResponse("srcStorageName", "copyFolder");
        }
    }
    /**
     * Copy folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyFolderInvalidDestStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        CopyFolderRequest request = createCopyFolderRequest();
        try {
            request.setDestStorageName((String)invalidizeTestValue("String", request.getDestStorageName(), "copyFolder", "destStorageName"));
            initialize("copyFolder", "destStorageName", request.getDestStorageName());
            api.copyFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destStorageName", "copyFolder", request.getDestStorageName());
        }
        if (needAssertResponse) {
            assertResponse("destStorageName", "copyFolder");
        }
    }

    private CopyFolderRequest createCopyFolderRequest() {
        CopyFolderRequest request = new CopyFolderRequest();
        request.setSrcPath((String)getTestValue("String", "copyFolder", "srcPath"));
        request.setDestPath((String)getTestValue("String", "copyFolder", "destPath"));
        request.setSrcStorageName((String)getTestValue("String", "copyFolder", "srcStorageName"));
        request.setDestStorageName((String)getTestValue("String", "copyFolder", "destStorageName"));
        return request;
    }
    
    /**
     * Create the folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderTest() throws ApiException, Exception {
        initialize("createFolder", null, null);
        ;
        CreateFolderRequest request = createCreateFolderRequest();
        api.createFolder(request);
    }

    /**
     * Create the folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        CreateFolderRequest request = createCreateFolderRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "createFolder", "path"));
            initialize("createFolder", "path", request.getPath());
            api.createFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "createFolder", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "createFolder");
        }
    }
    /**
     * Create the folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFolderInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        CreateFolderRequest request = createCreateFolderRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "createFolder", "storageName"));
            initialize("createFolder", "storageName", request.getStorageName());
            api.createFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "createFolder", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "createFolder");
        }
    }

    private CreateFolderRequest createCreateFolderRequest() {
        CreateFolderRequest request = new CreateFolderRequest();
        request.setPath((String)getTestValue("String", "createFolder", "path"));
        request.setStorageName((String)getTestValue("String", "createFolder", "storageName"));
        return request;
    }
    
    /**
     * Delete file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException, Exception {
        initialize("deleteFile", null, null);
        ;
        DeleteFileRequest request = createDeleteFileRequest();
        api.deleteFile(request);
    }

    /**
     * Delete file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFileRequest request = createDeleteFileRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteFile", "path"));
            initialize("deleteFile", "path", request.getPath());
            api.deleteFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteFile", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteFile");
        }
    }
    /**
     * Delete file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFileRequest request = createDeleteFileRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "deleteFile", "storageName"));
            initialize("deleteFile", "storageName", request.getStorageName());
            api.deleteFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "deleteFile", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "deleteFile");
        }
    }
    /**
     * Delete file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileInvalidVersionIdTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFileRequest request = createDeleteFileRequest();
        try {
            request.setVersionId((String)invalidizeTestValue("String", request.getVersionId(), "deleteFile", "versionId"));
            initialize("deleteFile", "versionId", request.getVersionId());
            api.deleteFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "versionId", "deleteFile", request.getVersionId());
        }
        if (needAssertResponse) {
            assertResponse("versionId", "deleteFile");
        }
    }

    private DeleteFileRequest createDeleteFileRequest() {
        DeleteFileRequest request = new DeleteFileRequest();
        request.setPath((String)getTestValue("String", "deleteFile", "path"));
        request.setStorageName((String)getTestValue("String", "deleteFile", "storageName"));
        request.setVersionId((String)getTestValue("String", "deleteFile", "versionId"));
        return request;
    }
    
    /**
     * Delete folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException, Exception {
        initialize("deleteFolder", null, null);
        ;
        DeleteFolderRequest request = createDeleteFolderRequest();
        api.deleteFolder(request);
    }

    /**
     * Delete folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFolderRequest request = createDeleteFolderRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteFolder", "path"));
            initialize("deleteFolder", "path", request.getPath());
            api.deleteFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteFolder", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteFolder");
        }
    }
    /**
     * Delete folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFolderRequest request = createDeleteFolderRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "deleteFolder", "storageName"));
            initialize("deleteFolder", "storageName", request.getStorageName());
            api.deleteFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "deleteFolder", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "deleteFolder");
        }
    }
    /**
     * Delete folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderInvalidRecursiveTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteFolderRequest request = createDeleteFolderRequest();
        try {
            request.setRecursive((Boolean)invalidizeTestValue("Boolean", request.getRecursive(), "deleteFolder", "recursive"));
            initialize("deleteFolder", "recursive", request.getRecursive());
            api.deleteFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "recursive", "deleteFolder", request.getRecursive());
        }
        if (needAssertResponse) {
            assertResponse("recursive", "deleteFolder");
        }
    }

    private DeleteFolderRequest createDeleteFolderRequest() {
        DeleteFolderRequest request = new DeleteFolderRequest();
        request.setPath((String)getTestValue("String", "deleteFolder", "path"));
        request.setStorageName((String)getTestValue("String", "deleteFolder", "storageName"));
        request.setRecursive((Boolean)getTestValue("Boolean", "deleteFolder", "recursive"));
        return request;
    }
    
    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideTest() throws ApiException, Exception {
        initialize("deleteNotesSlide", null, null);
        Slide response = null;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        response = api.deleteNotesSlide(request);
        assertNotNull(response);
    }

    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlide", "name"));
            initialize("deleteNotesSlide", "name", request.getName());
            Slide response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlide");
        }
    }
    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlide", "slideIndex"));
            initialize("deleteNotesSlide", "slideIndex", request.getSlideIndex());
            Slide response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlide");
        }
    }
    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlide", "password"));
            initialize("deleteNotesSlide", "password", request.getPassword());
            Slide response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlide");
        }
    }
    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlide", "folder"));
            initialize("deleteNotesSlide", "folder", request.getFolder());
            Slide response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlide");
        }
    }
    /**
     * Remove notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlide", "storage"));
            initialize("deleteNotesSlide", "storage", request.getStorage());
            Slide response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlide");
        }
    }

    private DeleteNotesSlideRequest createDeleteNotesSlideRequest() {
        DeleteNotesSlideRequest request = new DeleteNotesSlideRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlide", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlide", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlide", "storage"));
        return request;
    }
    
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphTest() throws ApiException, Exception {
        initialize("deleteNotesSlideParagraph", null, null);
        Paragraphs response = null;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        response = api.deleteNotesSlideParagraph(request);
        assertNotNull(response);
    }

    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlideParagraph", "name"));
            initialize("deleteNotesSlideParagraph", "name", request.getName());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlideParagraph", "slideIndex"));
            initialize("deleteNotesSlideParagraph", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlideParagraph", "path"));
            initialize("deleteNotesSlideParagraph", "path", request.getPath());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteNotesSlideParagraph", "shapeIndex"));
            initialize("deleteNotesSlideParagraph", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deleteNotesSlideParagraph", "paragraphIndex"));
            initialize("deleteNotesSlideParagraph", "paragraphIndex", request.getParagraphIndex());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlideParagraph", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlideParagraph", "password"));
            initialize("deleteNotesSlideParagraph", "password", request.getPassword());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlideParagraph", "folder"));
            initialize("deleteNotesSlideParagraph", "folder", request.getFolder());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlideParagraph", "storage"));
            initialize("deleteNotesSlideParagraph", "storage", request.getStorage());
            Paragraphs response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideParagraph");
        }
    }

    private DeleteNotesSlideParagraphRequest createDeleteNotesSlideParagraphRequest() {
        DeleteNotesSlideParagraphRequest request = new DeleteNotesSlideParagraphRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlideParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlideParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlideParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteNotesSlideParagraph", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deleteNotesSlideParagraph", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlideParagraph", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlideParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlideParagraph", "storage"));
        return request;
    }
    
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsTest() throws ApiException, Exception {
        initialize("deleteNotesSlideParagraphs", null, null);
        Paragraphs response = null;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        response = api.deleteNotesSlideParagraphs(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlideParagraphs", "name"));
            initialize("deleteNotesSlideParagraphs", "name", request.getName());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideParagraphs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlideParagraphs", "slideIndex"));
            initialize("deleteNotesSlideParagraphs", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideParagraphs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlideParagraphs", "path"));
            initialize("deleteNotesSlideParagraphs", "path", request.getPath());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideParagraphs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteNotesSlideParagraphs", "shapeIndex"));
            initialize("deleteNotesSlideParagraphs", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideParagraphs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidParagraphsTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setParagraphs((List<Integer>)invalidizeTestValue("List<Integer>", request.getParagraphs(), "deleteNotesSlideParagraphs", "paragraphs"));
            initialize("deleteNotesSlideParagraphs", "paragraphs", request.getParagraphs());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphs", "deleteNotesSlideParagraphs", request.getParagraphs());
        }
        if (needAssertResponse) {
            assertResponse("paragraphs", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlideParagraphs", "password"));
            initialize("deleteNotesSlideParagraphs", "password", request.getPassword());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideParagraphs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlideParagraphs", "folder"));
            initialize("deleteNotesSlideParagraphs", "folder", request.getFolder());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideParagraphs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlideParagraphs", "storage"));
            initialize("deleteNotesSlideParagraphs", "storage", request.getStorage());
            Paragraphs response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideParagraphs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideParagraphs");
        }
    }

    private DeleteNotesSlideParagraphsRequest createDeleteNotesSlideParagraphsRequest() {
        DeleteNotesSlideParagraphsRequest request = new DeleteNotesSlideParagraphsRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlideParagraphs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlideParagraphs", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlideParagraphs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteNotesSlideParagraphs", "shapeIndex"));
        request.setParagraphs((List<Integer>)getTestValue("List<Integer>", "deleteNotesSlideParagraphs", "paragraphs"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlideParagraphs", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlideParagraphs", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlideParagraphs", "storage"));
        return request;
    }
    
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionTest() throws ApiException, Exception {
        initialize("deleteNotesSlidePortion", null, null);
        Portions response = null;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        response = api.deleteNotesSlidePortion(request);
        assertNotNull(response);
    }

    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlidePortion", "name"));
            initialize("deleteNotesSlidePortion", "name", request.getName());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlidePortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlidePortion", "slideIndex"));
            initialize("deleteNotesSlidePortion", "slideIndex", request.getSlideIndex());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlidePortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlidePortion", "path"));
            initialize("deleteNotesSlidePortion", "path", request.getPath());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlidePortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteNotesSlidePortion", "shapeIndex"));
            initialize("deleteNotesSlidePortion", "shapeIndex", request.getShapeIndex());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlidePortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deleteNotesSlidePortion", "paragraphIndex"));
            initialize("deleteNotesSlidePortion", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlidePortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "deleteNotesSlidePortion", "portionIndex"));
            initialize("deleteNotesSlidePortion", "portionIndex", request.getPortionIndex());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "deleteNotesSlidePortion", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlidePortion", "password"));
            initialize("deleteNotesSlidePortion", "password", request.getPassword());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlidePortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlidePortion", "folder"));
            initialize("deleteNotesSlidePortion", "folder", request.getFolder());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlidePortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlidePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlidePortion", "storage"));
            initialize("deleteNotesSlidePortion", "storage", request.getStorage());
            Portions response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlidePortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlidePortion");
        }
    }

    private DeleteNotesSlidePortionRequest createDeleteNotesSlidePortionRequest() {
        DeleteNotesSlidePortionRequest request = new DeleteNotesSlidePortionRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlidePortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlidePortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortion", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortion", "portionIndex"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlidePortion", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlidePortion", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlidePortion", "storage"));
        return request;
    }
    
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsTest() throws ApiException, Exception {
        initialize("deleteNotesSlidePortions", null, null);
        Portions response = null;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        response = api.deleteNotesSlidePortions(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlidePortions", "name"));
            initialize("deleteNotesSlidePortions", "name", request.getName());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlidePortions", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlidePortions", "slideIndex"));
            initialize("deleteNotesSlidePortions", "slideIndex", request.getSlideIndex());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlidePortions", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlidePortions", "path"));
            initialize("deleteNotesSlidePortions", "path", request.getPath());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlidePortions", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteNotesSlidePortions", "shapeIndex"));
            initialize("deleteNotesSlidePortions", "shapeIndex", request.getShapeIndex());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlidePortions", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deleteNotesSlidePortions", "paragraphIndex"));
            initialize("deleteNotesSlidePortions", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlidePortions", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidPortionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setPortions((List<Integer>)invalidizeTestValue("List<Integer>", request.getPortions(), "deleteNotesSlidePortions", "portions"));
            initialize("deleteNotesSlidePortions", "portions", request.getPortions());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portions", "deleteNotesSlidePortions", request.getPortions());
        }
        if (needAssertResponse) {
            assertResponse("portions", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlidePortions", "password"));
            initialize("deleteNotesSlidePortions", "password", request.getPassword());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlidePortions", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlidePortions", "folder"));
            initialize("deleteNotesSlidePortions", "folder", request.getFolder());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlidePortions", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlidePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlidePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlidePortions", "storage"));
            initialize("deleteNotesSlidePortions", "storage", request.getStorage());
            Portions response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlidePortions", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlidePortions");
        }
    }

    private DeleteNotesSlidePortionsRequest createDeleteNotesSlidePortionsRequest() {
        DeleteNotesSlidePortionsRequest request = new DeleteNotesSlidePortionsRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlidePortions", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortions", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlidePortions", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortions", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deleteNotesSlidePortions", "paragraphIndex"));
        request.setPortions((List<Integer>)getTestValue("List<Integer>", "deleteNotesSlidePortions", "portions"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlidePortions", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlidePortions", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlidePortions", "storage"));
        return request;
    }
    
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeTest() throws ApiException, Exception {
        initialize("deleteNotesSlideShape", null, null);
        Shapes response = null;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        response = api.deleteNotesSlideShape(request);
        assertNotNull(response);
    }

    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlideShape", "name"));
            initialize("deleteNotesSlideShape", "name", request.getName());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlideShape", "slideIndex"));
            initialize("deleteNotesSlideShape", "slideIndex", request.getSlideIndex());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlideShape", "path"));
            initialize("deleteNotesSlideShape", "path", request.getPath());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteNotesSlideShape", "shapeIndex"));
            initialize("deleteNotesSlideShape", "shapeIndex", request.getShapeIndex());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideShape", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlideShape", "password"));
            initialize("deleteNotesSlideShape", "password", request.getPassword());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlideShape", "folder"));
            initialize("deleteNotesSlideShape", "folder", request.getFolder());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlideShape", "storage"));
            initialize("deleteNotesSlideShape", "storage", request.getStorage());
            Shapes response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideShape");
        }
    }

    private DeleteNotesSlideShapeRequest createDeleteNotesSlideShapeRequest() {
        DeleteNotesSlideShapeRequest request = new DeleteNotesSlideShapeRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlideShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlideShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlideShape", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteNotesSlideShape", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlideShape", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlideShape", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlideShape", "storage"));
        return request;
    }
    
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesTest() throws ApiException, Exception {
        initialize("deleteNotesSlideShapes", null, null);
        Shapes response = null;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        response = api.deleteNotesSlideShapes(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteNotesSlideShapes", "name"));
            initialize("deleteNotesSlideShapes", "name", request.getName());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideShapes", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteNotesSlideShapes", "slideIndex"));
            initialize("deleteNotesSlideShapes", "slideIndex", request.getSlideIndex());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideShapes", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteNotesSlideShapes", "path"));
            initialize("deleteNotesSlideShapes", "path", request.getPath());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideShapes", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidShapesTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setShapes((List<Integer>)invalidizeTestValue("List<Integer>", request.getShapes(), "deleteNotesSlideShapes", "shapes"));
            initialize("deleteNotesSlideShapes", "shapes", request.getShapes());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapes", "deleteNotesSlideShapes", request.getShapes());
        }
        if (needAssertResponse) {
            assertResponse("shapes", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteNotesSlideShapes", "password"));
            initialize("deleteNotesSlideShapes", "password", request.getPassword());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideShapes", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteNotesSlideShapes", "folder"));
            initialize("deleteNotesSlideShapes", "folder", request.getFolder());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideShapes", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteNotesSlideShapes", "storage"));
            initialize("deleteNotesSlideShapes", "storage", request.getStorage());
            Shapes response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideShapes", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideShapes");
        }
    }

    private DeleteNotesSlideShapesRequest createDeleteNotesSlideShapesRequest() {
        DeleteNotesSlideShapesRequest request = new DeleteNotesSlideShapesRequest();
        request.setName((String)getTestValue("String", "deleteNotesSlideShapes", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteNotesSlideShapes", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteNotesSlideShapes", "path"));
        request.setShapes((List<Integer>)getTestValue("List<Integer>", "deleteNotesSlideShapes", "shapes"));
        request.setPassword((String)getTestValue("String", "deleteNotesSlideShapes", "password"));
        request.setFolder((String)getTestValue("String", "deleteNotesSlideShapes", "folder"));
        request.setStorage((String)getTestValue("String", "deleteNotesSlideShapes", "storage"));
        return request;
    }
    
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphTest() throws ApiException, Exception {
        initialize("deleteParagraph", null, null);
        Paragraphs response = null;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        response = api.deleteParagraph(request);
        assertNotNull(response);
    }

    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteParagraph", "name"));
            initialize("deleteParagraph", "name", request.getName());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteParagraph", "slideIndex"));
            initialize("deleteParagraph", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteParagraph", "path"));
            initialize("deleteParagraph", "path", request.getPath());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteParagraph", "shapeIndex"));
            initialize("deleteParagraph", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deleteParagraph", "paragraphIndex"));
            initialize("deleteParagraph", "paragraphIndex", request.getParagraphIndex());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteParagraph", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteParagraph", "password"));
            initialize("deleteParagraph", "password", request.getPassword());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteParagraph", "folder"));
            initialize("deleteParagraph", "folder", request.getFolder());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteParagraph");
        }
    }
    /**
     * Remove a paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphRequest request = createDeleteParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteParagraph", "storage"));
            initialize("deleteParagraph", "storage", request.getStorage());
            Paragraphs response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteParagraph");
        }
    }

    private DeleteParagraphRequest createDeleteParagraphRequest() {
        DeleteParagraphRequest request = new DeleteParagraphRequest();
        request.setName((String)getTestValue("String", "deleteParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteParagraph", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deleteParagraph", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "deleteParagraph", "password"));
        request.setFolder((String)getTestValue("String", "deleteParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "deleteParagraph", "storage"));
        return request;
    }
    
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsTest() throws ApiException, Exception {
        initialize("deleteParagraphs", null, null);
        Paragraphs response = null;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        response = api.deleteParagraphs(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteParagraphs", "name"));
            initialize("deleteParagraphs", "name", request.getName());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteParagraphs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteParagraphs", "slideIndex"));
            initialize("deleteParagraphs", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteParagraphs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteParagraphs", "path"));
            initialize("deleteParagraphs", "path", request.getPath());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteParagraphs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteParagraphs", "shapeIndex"));
            initialize("deleteParagraphs", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteParagraphs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidParagraphsTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setParagraphs((List<Integer>)invalidizeTestValue("List<Integer>", request.getParagraphs(), "deleteParagraphs", "paragraphs"));
            initialize("deleteParagraphs", "paragraphs", request.getParagraphs());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphs", "deleteParagraphs", request.getParagraphs());
        }
        if (needAssertResponse) {
            assertResponse("paragraphs", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteParagraphs", "password"));
            initialize("deleteParagraphs", "password", request.getPassword());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteParagraphs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteParagraphs", "folder"));
            initialize("deleteParagraphs", "folder", request.getFolder());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteParagraphs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteParagraphs");
        }
    }
    /**
     * Remove a range of paragraphs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteParagraphsRequest request = createDeleteParagraphsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteParagraphs", "storage"));
            initialize("deleteParagraphs", "storage", request.getStorage());
            Paragraphs response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteParagraphs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteParagraphs");
        }
    }

    private DeleteParagraphsRequest createDeleteParagraphsRequest() {
        DeleteParagraphsRequest request = new DeleteParagraphsRequest();
        request.setName((String)getTestValue("String", "deleteParagraphs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteParagraphs", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteParagraphs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteParagraphs", "shapeIndex"));
        request.setParagraphs((List<Integer>)getTestValue("List<Integer>", "deleteParagraphs", "paragraphs"));
        request.setPassword((String)getTestValue("String", "deleteParagraphs", "password"));
        request.setFolder((String)getTestValue("String", "deleteParagraphs", "folder"));
        request.setStorage((String)getTestValue("String", "deleteParagraphs", "storage"));
        return request;
    }
    
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionTest() throws ApiException, Exception {
        initialize("deletePortion", null, null);
        Portions response = null;
        DeletePortionRequest request = createDeletePortionRequest();
        response = api.deletePortion(request);
        assertNotNull(response);
    }

    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deletePortion", "name"));
            initialize("deletePortion", "name", request.getName());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deletePortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deletePortion", "slideIndex"));
            initialize("deletePortion", "slideIndex", request.getSlideIndex());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deletePortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deletePortion", "path"));
            initialize("deletePortion", "path", request.getPath());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deletePortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deletePortion", "shapeIndex"));
            initialize("deletePortion", "shapeIndex", request.getShapeIndex());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deletePortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deletePortion", "paragraphIndex"));
            initialize("deletePortion", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deletePortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "deletePortion", "portionIndex"));
            initialize("deletePortion", "portionIndex", request.getPortionIndex());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "deletePortion", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deletePortion", "password"));
            initialize("deletePortion", "password", request.getPassword());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deletePortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deletePortion", "folder"));
            initialize("deletePortion", "folder", request.getFolder());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deletePortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deletePortion");
        }
    }
    /**
     * Remove a portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionRequest request = createDeletePortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deletePortion", "storage"));
            initialize("deletePortion", "storage", request.getStorage());
            Portions response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deletePortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deletePortion");
        }
    }

    private DeletePortionRequest createDeletePortionRequest() {
        DeletePortionRequest request = new DeletePortionRequest();
        request.setName((String)getTestValue("String", "deletePortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deletePortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "deletePortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deletePortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deletePortion", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "deletePortion", "portionIndex"));
        request.setPassword((String)getTestValue("String", "deletePortion", "password"));
        request.setFolder((String)getTestValue("String", "deletePortion", "folder"));
        request.setStorage((String)getTestValue("String", "deletePortion", "storage"));
        return request;
    }
    
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsTest() throws ApiException, Exception {
        initialize("deletePortions", null, null);
        Portions response = null;
        DeletePortionsRequest request = createDeletePortionsRequest();
        response = api.deletePortions(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deletePortions", "name"));
            initialize("deletePortions", "name", request.getName());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deletePortions", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deletePortions", "slideIndex"));
            initialize("deletePortions", "slideIndex", request.getSlideIndex());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deletePortions", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deletePortions", "path"));
            initialize("deletePortions", "path", request.getPath());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deletePortions", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deletePortions", "shapeIndex"));
            initialize("deletePortions", "shapeIndex", request.getShapeIndex());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deletePortions", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "deletePortions", "paragraphIndex"));
            initialize("deletePortions", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deletePortions", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPortionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setPortions((List<Integer>)invalidizeTestValue("List<Integer>", request.getPortions(), "deletePortions", "portions"));
            initialize("deletePortions", "portions", request.getPortions());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portions", "deletePortions", request.getPortions());
        }
        if (needAssertResponse) {
            assertResponse("portions", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deletePortions", "password"));
            initialize("deletePortions", "password", request.getPassword());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deletePortions", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deletePortions", "folder"));
            initialize("deletePortions", "folder", request.getFolder());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deletePortions", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deletePortions");
        }
    }
    /**
     * Remove a range of portions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeletePortionsRequest request = createDeletePortionsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deletePortions", "storage"));
            initialize("deletePortions", "storage", request.getStorage());
            Portions response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deletePortions", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deletePortions");
        }
    }

    private DeletePortionsRequest createDeletePortionsRequest() {
        DeletePortionsRequest request = new DeletePortionsRequest();
        request.setName((String)getTestValue("String", "deletePortions", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deletePortions", "slideIndex"));
        request.setPath((String)getTestValue("String", "deletePortions", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deletePortions", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "deletePortions", "paragraphIndex"));
        request.setPortions((List<Integer>)getTestValue("List<Integer>", "deletePortions", "portions"));
        request.setPassword((String)getTestValue("String", "deletePortions", "password"));
        request.setFolder((String)getTestValue("String", "deletePortions", "folder"));
        request.setStorage((String)getTestValue("String", "deletePortions", "storage"));
        return request;
    }
    
    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationTest() throws ApiException, Exception {
        initialize("deleteSlideAnimation", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        response = api.deleteSlideAnimation(request);
        assertNotNull(response);
    }

    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimation", "name"));
            initialize("deleteSlideAnimation", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimation", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimation");
        }
    }
    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimation", "slideIndex"));
            initialize("deleteSlideAnimation", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimation", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimation");
        }
    }
    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimation", "password"));
            initialize("deleteSlideAnimation", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimation", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimation");
        }
    }
    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimation", "folder"));
            initialize("deleteSlideAnimation", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimation", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimation");
        }
    }
    /**
     * Remove animation from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationRequest request = createDeleteSlideAnimationRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimation", "storage"));
            initialize("deleteSlideAnimation", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimation", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimation");
        }
    }

    private DeleteSlideAnimationRequest createDeleteSlideAnimationRequest() {
        DeleteSlideAnimationRequest request = new DeleteSlideAnimationRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimation", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimation", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimation", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimation", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimation", "storage"));
        return request;
    }
    
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectTest() throws ApiException, Exception {
        initialize("deleteSlideAnimationEffect", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        response = api.deleteSlideAnimationEffect(request);
        assertNotNull(response);
    }

    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimationEffect", "name"));
            initialize("deleteSlideAnimationEffect", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimationEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimationEffect");
        }
    }
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimationEffect", "slideIndex"));
            initialize("deleteSlideAnimationEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimationEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimationEffect");
        }
    }
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidEffectIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setEffectIndex((Integer)invalidizeTestValue("Integer", request.getEffectIndex(), "deleteSlideAnimationEffect", "effectIndex"));
            initialize("deleteSlideAnimationEffect", "effectIndex", request.getEffectIndex());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effectIndex", "deleteSlideAnimationEffect", request.getEffectIndex());
        }
        if (needAssertResponse) {
            assertResponse("effectIndex", "deleteSlideAnimationEffect");
        }
    }
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimationEffect", "password"));
            initialize("deleteSlideAnimationEffect", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimationEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimationEffect");
        }
    }
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimationEffect", "folder"));
            initialize("deleteSlideAnimationEffect", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimationEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimationEffect");
        }
    }
    /**
     * Remove an effect from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationEffectRequest request = createDeleteSlideAnimationEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimationEffect", "storage"));
            initialize("deleteSlideAnimationEffect", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimationEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimationEffect");
        }
    }

    private DeleteSlideAnimationEffectRequest createDeleteSlideAnimationEffectRequest() {
        DeleteSlideAnimationEffectRequest request = new DeleteSlideAnimationEffectRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimationEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimationEffect", "slideIndex"));
        request.setEffectIndex((Integer)getTestValue("Integer", "deleteSlideAnimationEffect", "effectIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimationEffect", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimationEffect", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimationEffect", "storage"));
        return request;
    }
    
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceTest() throws ApiException, Exception {
        initialize("deleteSlideAnimationInteractiveSequence", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        response = api.deleteSlideAnimationInteractiveSequence(request);
        assertNotNull(response);
    }

    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimationInteractiveSequence", "name"));
            initialize("deleteSlideAnimationInteractiveSequence", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimationInteractiveSequence", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimationInteractiveSequence", "slideIndex"));
            initialize("deleteSlideAnimationInteractiveSequence", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimationInteractiveSequence", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidSequenceIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setSequenceIndex((Integer)invalidizeTestValue("Integer", request.getSequenceIndex(), "deleteSlideAnimationInteractiveSequence", "sequenceIndex"));
            initialize("deleteSlideAnimationInteractiveSequence", "sequenceIndex", request.getSequenceIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sequenceIndex", "deleteSlideAnimationInteractiveSequence", request.getSequenceIndex());
        }
        if (needAssertResponse) {
            assertResponse("sequenceIndex", "deleteSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimationInteractiveSequence", "password"));
            initialize("deleteSlideAnimationInteractiveSequence", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimationInteractiveSequence", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimationInteractiveSequence", "folder"));
            initialize("deleteSlideAnimationInteractiveSequence", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimationInteractiveSequence", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Remove an interactive sequence from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceRequest request = createDeleteSlideAnimationInteractiveSequenceRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimationInteractiveSequence", "storage"));
            initialize("deleteSlideAnimationInteractiveSequence", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimationInteractiveSequence", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimationInteractiveSequence");
        }
    }

    private DeleteSlideAnimationInteractiveSequenceRequest createDeleteSlideAnimationInteractiveSequenceRequest() {
        DeleteSlideAnimationInteractiveSequenceRequest request = new DeleteSlideAnimationInteractiveSequenceRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimationInteractiveSequence", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequence", "slideIndex"));
        request.setSequenceIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequence", "sequenceIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimationInteractiveSequence", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimationInteractiveSequence", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimationInteractiveSequence", "storage"));
        return request;
    }
    
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectTest() throws ApiException, Exception {
        initialize("deleteSlideAnimationInteractiveSequenceEffect", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
        assertNotNull(response);
    }

    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimationInteractiveSequenceEffect", "name"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimationInteractiveSequenceEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimationInteractiveSequenceEffect", "slideIndex"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimationInteractiveSequenceEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidSequenceIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSequenceIndex((Integer)invalidizeTestValue("Integer", request.getSequenceIndex(), "deleteSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "sequenceIndex", request.getSequenceIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sequenceIndex", "deleteSlideAnimationInteractiveSequenceEffect", request.getSequenceIndex());
        }
        if (needAssertResponse) {
            assertResponse("sequenceIndex", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidEffectIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setEffectIndex((Integer)invalidizeTestValue("Integer", request.getEffectIndex(), "deleteSlideAnimationInteractiveSequenceEffect", "effectIndex"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "effectIndex", request.getEffectIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effectIndex", "deleteSlideAnimationInteractiveSequenceEffect", request.getEffectIndex());
        }
        if (needAssertResponse) {
            assertResponse("effectIndex", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimationInteractiveSequenceEffect", "password"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimationInteractiveSequenceEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimationInteractiveSequenceEffect", "folder"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimationInteractiveSequenceEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Remove an effect from slide animation interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequenceEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = createDeleteSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimationInteractiveSequenceEffect", "storage"));
            initialize("deleteSlideAnimationInteractiveSequenceEffect", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimationInteractiveSequenceEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimationInteractiveSequenceEffect");
        }
    }

    private DeleteSlideAnimationInteractiveSequenceEffectRequest createDeleteSlideAnimationInteractiveSequenceEffectRequest() {
        DeleteSlideAnimationInteractiveSequenceEffectRequest request = new DeleteSlideAnimationInteractiveSequenceEffectRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimationInteractiveSequenceEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequenceEffect", "slideIndex"));
        request.setSequenceIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
        request.setEffectIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequenceEffect", "effectIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimationInteractiveSequenceEffect", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimationInteractiveSequenceEffect", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimationInteractiveSequenceEffect", "storage"));
        return request;
    }
    
    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesTest() throws ApiException, Exception {
        initialize("deleteSlideAnimationInteractiveSequences", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        response = api.deleteSlideAnimationInteractiveSequences(request);
        assertNotNull(response);
    }

    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimationInteractiveSequences", "name"));
            initialize("deleteSlideAnimationInteractiveSequences", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequences(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimationInteractiveSequences", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimationInteractiveSequences");
        }
    }
    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimationInteractiveSequences", "slideIndex"));
            initialize("deleteSlideAnimationInteractiveSequences", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequences(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimationInteractiveSequences", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimationInteractiveSequences");
        }
    }
    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimationInteractiveSequences", "password"));
            initialize("deleteSlideAnimationInteractiveSequences", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequences(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimationInteractiveSequences", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimationInteractiveSequences");
        }
    }
    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimationInteractiveSequences", "folder"));
            initialize("deleteSlideAnimationInteractiveSequences", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequences(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimationInteractiveSequences", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimationInteractiveSequences");
        }
    }
    /**
     * Clear all interactive sequences from slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationInteractiveSequencesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationInteractiveSequencesRequest request = createDeleteSlideAnimationInteractiveSequencesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimationInteractiveSequences", "storage"));
            initialize("deleteSlideAnimationInteractiveSequences", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimationInteractiveSequences(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimationInteractiveSequences", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimationInteractiveSequences");
        }
    }

    private DeleteSlideAnimationInteractiveSequencesRequest createDeleteSlideAnimationInteractiveSequencesRequest() {
        DeleteSlideAnimationInteractiveSequencesRequest request = new DeleteSlideAnimationInteractiveSequencesRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimationInteractiveSequences", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimationInteractiveSequences", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimationInteractiveSequences", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimationInteractiveSequences", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimationInteractiveSequences", "storage"));
        return request;
    }
    
    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceTest() throws ApiException, Exception {
        initialize("deleteSlideAnimationMainSequence", null, null);
        SlideAnimation response = null;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        response = api.deleteSlideAnimationMainSequence(request);
        assertNotNull(response);
    }

    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideAnimationMainSequence", "name"));
            initialize("deleteSlideAnimationMainSequence", "name", request.getName());
            SlideAnimation response = api.deleteSlideAnimationMainSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideAnimationMainSequence", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideAnimationMainSequence");
        }
    }
    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideAnimationMainSequence", "slideIndex"));
            initialize("deleteSlideAnimationMainSequence", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.deleteSlideAnimationMainSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideAnimationMainSequence", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideAnimationMainSequence");
        }
    }
    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideAnimationMainSequence", "password"));
            initialize("deleteSlideAnimationMainSequence", "password", request.getPassword());
            SlideAnimation response = api.deleteSlideAnimationMainSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideAnimationMainSequence", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideAnimationMainSequence");
        }
    }
    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideAnimationMainSequence", "folder"));
            initialize("deleteSlideAnimationMainSequence", "folder", request.getFolder());
            SlideAnimation response = api.deleteSlideAnimationMainSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideAnimationMainSequence", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideAnimationMainSequence");
        }
    }
    /**
     * Clear main sequence in slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideAnimationMainSequenceInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideAnimationMainSequenceRequest request = createDeleteSlideAnimationMainSequenceRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideAnimationMainSequence", "storage"));
            initialize("deleteSlideAnimationMainSequence", "storage", request.getStorage());
            SlideAnimation response = api.deleteSlideAnimationMainSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideAnimationMainSequence", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideAnimationMainSequence");
        }
    }

    private DeleteSlideAnimationMainSequenceRequest createDeleteSlideAnimationMainSequenceRequest() {
        DeleteSlideAnimationMainSequenceRequest request = new DeleteSlideAnimationMainSequenceRequest();
        request.setName((String)getTestValue("String", "deleteSlideAnimationMainSequence", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideAnimationMainSequence", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideAnimationMainSequence", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideAnimationMainSequence", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideAnimationMainSequence", "storage"));
        return request;
    }
    
    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexTest() throws ApiException, Exception {
        initialize("deleteSlideByIndex", null, null);
        Slides response = null;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        response = api.deleteSlideByIndex(request);
        assertNotNull(response);
    }

    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideByIndex", "name"));
            initialize("deleteSlideByIndex", "name", request.getName());
            Slides response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideByIndex", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideByIndex", "slideIndex"));
            initialize("deleteSlideByIndex", "slideIndex", request.getSlideIndex());
            Slides response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideByIndex", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideByIndex", "password"));
            initialize("deleteSlideByIndex", "password", request.getPassword());
            Slides response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideByIndex", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideByIndex", "folder"));
            initialize("deleteSlideByIndex", "folder", request.getFolder());
            Slides response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideByIndex", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideByIndex", "storage"));
            initialize("deleteSlideByIndex", "storage", request.getStorage());
            Slides response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideByIndex", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideByIndex");
        }
    }

    private DeleteSlideByIndexRequest createDeleteSlideByIndexRequest() {
        DeleteSlideByIndexRequest request = new DeleteSlideByIndexRequest();
        request.setName((String)getTestValue("String", "deleteSlideByIndex", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideByIndex", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideByIndex", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideByIndex", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideByIndex", "storage"));
        return request;
    }
    
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeTest() throws ApiException, Exception {
        initialize("deleteSlideShape", null, null);
        Shapes response = null;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        response = api.deleteSlideShape(request);
        assertNotNull(response);
    }

    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideShape", "name"));
            initialize("deleteSlideShape", "name", request.getName());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideShape", "slideIndex"));
            initialize("deleteSlideShape", "slideIndex", request.getSlideIndex());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteSlideShape", "path"));
            initialize("deleteSlideShape", "path", request.getPath());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteSlideShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "deleteSlideShape", "shapeIndex"));
            initialize("deleteSlideShape", "shapeIndex", request.getShapeIndex());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteSlideShape", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideShape", "password"));
            initialize("deleteSlideShape", "password", request.getPassword());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideShape", "folder"));
            initialize("deleteSlideShape", "folder", request.getFolder());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideShape");
        }
    }
    /**
     * Remove a shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideShape", "storage"));
            initialize("deleteSlideShape", "storage", request.getStorage());
            Shapes response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideShape");
        }
    }

    private DeleteSlideShapeRequest createDeleteSlideShapeRequest() {
        DeleteSlideShapeRequest request = new DeleteSlideShapeRequest();
        request.setName((String)getTestValue("String", "deleteSlideShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteSlideShape", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "deleteSlideShape", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlideShape", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideShape", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideShape", "storage"));
        return request;
    }
    
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesTest() throws ApiException, Exception {
        initialize("deleteSlideShapes", null, null);
        Shapes response = null;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        response = api.deleteSlideShapes(request);
        assertNotNull(response);
    }

    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlideShapes", "name"));
            initialize("deleteSlideShapes", "name", request.getName());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideShapes", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlideShapes", "slideIndex"));
            initialize("deleteSlideShapes", "slideIndex", request.getSlideIndex());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideShapes", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "deleteSlideShapes", "path"));
            initialize("deleteSlideShapes", "path", request.getPath());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteSlideShapes", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidShapesTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setShapes((List<Integer>)invalidizeTestValue("List<Integer>", request.getShapes(), "deleteSlideShapes", "shapes"));
            initialize("deleteSlideShapes", "shapes", request.getShapes());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapes", "deleteSlideShapes", request.getShapes());
        }
        if (needAssertResponse) {
            assertResponse("shapes", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlideShapes", "password"));
            initialize("deleteSlideShapes", "password", request.getPassword());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideShapes", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlideShapes", "folder"));
            initialize("deleteSlideShapes", "folder", request.getFolder());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideShapes", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideShapes");
        }
    }
    /**
     * Remove a range of shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlideShapes", "storage"));
            initialize("deleteSlideShapes", "storage", request.getStorage());
            Shapes response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideShapes", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideShapes");
        }
    }

    private DeleteSlideShapesRequest createDeleteSlideShapesRequest() {
        DeleteSlideShapesRequest request = new DeleteSlideShapesRequest();
        request.setName((String)getTestValue("String", "deleteSlideShapes", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlideShapes", "slideIndex"));
        request.setPath((String)getTestValue("String", "deleteSlideShapes", "path"));
        request.setShapes((List<Integer>)getTestValue("List<Integer>", "deleteSlideShapes", "shapes"));
        request.setPassword((String)getTestValue("String", "deleteSlideShapes", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlideShapes", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlideShapes", "storage"));
        return request;
    }
    
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListTest() throws ApiException, Exception {
        initialize("deleteSlidesCleanSlidesList", null, null);
        Slides response = null;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        response = api.deleteSlidesCleanSlidesList(request);
        assertNotNull(response);
    }

    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlidesCleanSlidesList", "name"));
            initialize("deleteSlidesCleanSlidesList", "name", request.getName());
            Slides response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesCleanSlidesList", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidSlidesTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        try {
            request.setSlides((List<Integer>)invalidizeTestValue("List<Integer>", request.getSlides(), "deleteSlidesCleanSlidesList", "slides"));
            initialize("deleteSlidesCleanSlidesList", "slides", request.getSlides());
            Slides response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slides", "deleteSlidesCleanSlidesList", request.getSlides());
        }
        if (needAssertResponse) {
            assertResponse("slides", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlidesCleanSlidesList", "password"));
            initialize("deleteSlidesCleanSlidesList", "password", request.getPassword());
            Slides response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesCleanSlidesList", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlidesCleanSlidesList", "folder"));
            initialize("deleteSlidesCleanSlidesList", "folder", request.getFolder());
            Slides response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesCleanSlidesList", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlidesCleanSlidesList", "storage"));
            initialize("deleteSlidesCleanSlidesList", "storage", request.getStorage());
            Slides response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesCleanSlidesList", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesCleanSlidesList");
        }
    }

    private DeleteSlidesCleanSlidesListRequest createDeleteSlidesCleanSlidesListRequest() {
        DeleteSlidesCleanSlidesListRequest request = new DeleteSlidesCleanSlidesListRequest();
        request.setName((String)getTestValue("String", "deleteSlidesCleanSlidesList", "name"));
        request.setSlides((List<Integer>)getTestValue("List<Integer>", "deleteSlidesCleanSlidesList", "slides"));
        request.setPassword((String)getTestValue("String", "deleteSlidesCleanSlidesList", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlidesCleanSlidesList", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlidesCleanSlidesList", "storage"));
        return request;
    }
    
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesTest() throws ApiException, Exception {
        initialize("deleteSlidesDocumentProperties", null, null);
        DocumentProperties response = null;
        DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
        response = api.deleteSlidesDocumentProperties(request);
        assertNotNull(response);
    }

    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlidesDocumentProperties", "name"));
            initialize("deleteSlidesDocumentProperties", "name", request.getName());
            DocumentProperties response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesDocumentProperties", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlidesDocumentProperties", "password"));
            initialize("deleteSlidesDocumentProperties", "password", request.getPassword());
            DocumentProperties response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesDocumentProperties", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlidesDocumentProperties", "folder"));
            initialize("deleteSlidesDocumentProperties", "folder", request.getFolder());
            DocumentProperties response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesDocumentProperties", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlidesDocumentProperties", "storage"));
            initialize("deleteSlidesDocumentProperties", "storage", request.getStorage());
            DocumentProperties response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesDocumentProperties", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesDocumentProperties");
        }
    }

    private DeleteSlidesDocumentPropertiesRequest createDeleteSlidesDocumentPropertiesRequest() {
        DeleteSlidesDocumentPropertiesRequest request = new DeleteSlidesDocumentPropertiesRequest();
        request.setName((String)getTestValue("String", "deleteSlidesDocumentProperties", "name"));
        request.setPassword((String)getTestValue("String", "deleteSlidesDocumentProperties", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlidesDocumentProperties", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlidesDocumentProperties", "storage"));
        return request;
    }
    
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyTest() throws ApiException, Exception {
        initialize("deleteSlidesDocumentProperty", null, null);
        DocumentProperties response = null;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        response = api.deleteSlidesDocumentProperty(request);
        assertNotNull(response);
    }

    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlidesDocumentProperty", "name"));
            initialize("deleteSlidesDocumentProperty", "name", request.getName());
            DocumentProperties response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesDocumentProperty", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        try {
            request.setPropertyName((String)invalidizeTestValue("String", request.getPropertyName(), "deleteSlidesDocumentProperty", "propertyName"));
            initialize("deleteSlidesDocumentProperty", "propertyName", request.getPropertyName());
            DocumentProperties response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "deleteSlidesDocumentProperty", request.getPropertyName());
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlidesDocumentProperty", "password"));
            initialize("deleteSlidesDocumentProperty", "password", request.getPassword());
            DocumentProperties response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesDocumentProperty", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlidesDocumentProperty", "folder"));
            initialize("deleteSlidesDocumentProperty", "folder", request.getFolder());
            DocumentProperties response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesDocumentProperty", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlidesDocumentProperty", "storage"));
            initialize("deleteSlidesDocumentProperty", "storage", request.getStorage());
            DocumentProperties response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesDocumentProperty", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesDocumentProperty");
        }
    }

    private DeleteSlidesDocumentPropertyRequest createDeleteSlidesDocumentPropertyRequest() {
        DeleteSlidesDocumentPropertyRequest request = new DeleteSlidesDocumentPropertyRequest();
        request.setName((String)getTestValue("String", "deleteSlidesDocumentProperty", "name"));
        request.setPropertyName((String)getTestValue("String", "deleteSlidesDocumentProperty", "propertyName"));
        request.setPassword((String)getTestValue("String", "deleteSlidesDocumentProperty", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlidesDocumentProperty", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlidesDocumentProperty", "storage"));
        return request;
    }
    
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("deleteSlidesSlideBackground", null, null);
        SlideBackground response = null;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        response = api.deleteSlidesSlideBackground(request);
        assertNotNull(response);
    }

    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "deleteSlidesSlideBackground", "name"));
            initialize("deleteSlidesSlideBackground", "name", request.getName());
            SlideBackground response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesSlideBackground", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "deleteSlidesSlideBackground", "slideIndex"));
            initialize("deleteSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackground response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlidesSlideBackground", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "deleteSlidesSlideBackground", "password"));
            initialize("deleteSlidesSlideBackground", "password", request.getPassword());
            SlideBackground response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesSlideBackground", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "deleteSlidesSlideBackground", "folder"));
            initialize("deleteSlidesSlideBackground", "folder", request.getFolder());
            SlideBackground response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesSlideBackground", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "deleteSlidesSlideBackground", "storage"));
            initialize("deleteSlidesSlideBackground", "storage", request.getStorage());
            SlideBackground response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesSlideBackground", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesSlideBackground");
        }
    }

    private DeleteSlidesSlideBackgroundRequest createDeleteSlidesSlideBackgroundRequest() {
        DeleteSlidesSlideBackgroundRequest request = new DeleteSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("String", "deleteSlidesSlideBackground", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "deleteSlidesSlideBackground", "slideIndex"));
        request.setPassword((String)getTestValue("String", "deleteSlidesSlideBackground", "password"));
        request.setFolder((String)getTestValue("String", "deleteSlidesSlideBackground", "folder"));
        request.setStorage((String)getTestValue("String", "deleteSlidesSlideBackground", "storage"));
        return request;
    }
    
    /**
     * Download file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException, Exception {
        initialize("downloadFile", null, null);
        File response = null;
        DownloadFileRequest request = createDownloadFileRequest();
        response = api.downloadFile(request);
        assertTrue(response.isFile());
    }

    /**
     * Download file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        DownloadFileRequest request = createDownloadFileRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "downloadFile", "path"));
            initialize("downloadFile", "path", request.getPath());
            File response = api.downloadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "downloadFile", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "downloadFile");
        }
    }
    /**
     * Download file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        DownloadFileRequest request = createDownloadFileRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "downloadFile", "storageName"));
            initialize("downloadFile", "storageName", request.getStorageName());
            File response = api.downloadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "downloadFile", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "downloadFile");
        }
    }
    /**
     * Download file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileInvalidVersionIdTest() throws ApiException {
        Boolean needAssertResponse = false;
        DownloadFileRequest request = createDownloadFileRequest();
        try {
            request.setVersionId((String)invalidizeTestValue("String", request.getVersionId(), "downloadFile", "versionId"));
            initialize("downloadFile", "versionId", request.getVersionId());
            File response = api.downloadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "versionId", "downloadFile", request.getVersionId());
        }
        if (needAssertResponse) {
            assertResponse("versionId", "downloadFile");
        }
    }

    private DownloadFileRequest createDownloadFileRequest() {
        DownloadFileRequest request = new DownloadFileRequest();
        request.setPath((String)getTestValue("String", "downloadFile", "path"));
        request.setStorageName((String)getTestValue("String", "downloadFile", "storageName"));
        request.setVersionId((String)getTestValue("String", "downloadFile", "versionId"));
        return request;
    }
    
    /**
     * Get disc usage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscUsageTest() throws ApiException, Exception {
        initialize("getDiscUsage", null, null);
        DiscUsage response = null;
        GetDiscUsageRequest request = createGetDiscUsageRequest();
        response = api.getDiscUsage(request);
        assertNotNull(response);
    }

    /**
     * Get disc usage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscUsageInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetDiscUsageRequest request = createGetDiscUsageRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "getDiscUsage", "storageName"));
            initialize("getDiscUsage", "storageName", request.getStorageName());
            DiscUsage response = api.getDiscUsage(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "getDiscUsage", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "getDiscUsage");
        }
    }

    private GetDiscUsageRequest createGetDiscUsageRequest() {
        GetDiscUsageRequest request = new GetDiscUsageRequest();
        request.setStorageName((String)getTestValue("String", "getDiscUsage", "storageName"));
        return request;
    }
    
    /**
     * Get file versions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileVersionsTest() throws ApiException, Exception {
        initialize("getFileVersions", null, null);
        FileVersions response = null;
        GetFileVersionsRequest request = createGetFileVersionsRequest();
        response = api.getFileVersions(request);
        assertNotNull(response);
    }

    /**
     * Get file versions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileVersionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetFileVersionsRequest request = createGetFileVersionsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getFileVersions", "path"));
            initialize("getFileVersions", "path", request.getPath());
            FileVersions response = api.getFileVersions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getFileVersions", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getFileVersions");
        }
    }
    /**
     * Get file versions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileVersionsInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetFileVersionsRequest request = createGetFileVersionsRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "getFileVersions", "storageName"));
            initialize("getFileVersions", "storageName", request.getStorageName());
            FileVersions response = api.getFileVersions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "getFileVersions", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "getFileVersions");
        }
    }

    private GetFileVersionsRequest createGetFileVersionsRequest() {
        GetFileVersionsRequest request = new GetFileVersionsRequest();
        request.setPath((String)getTestValue("String", "getFileVersions", "path"));
        request.setStorageName((String)getTestValue("String", "getFileVersions", "storageName"));
        return request;
    }
    
    /**
     * Get all files and folders within a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesListTest() throws ApiException, Exception {
        initialize("getFilesList", null, null);
        FilesList response = null;
        GetFilesListRequest request = createGetFilesListRequest();
        response = api.getFilesList(request);
        assertNotNull(response);
    }

    /**
     * Get all files and folders within a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesListInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetFilesListRequest request = createGetFilesListRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getFilesList", "path"));
            initialize("getFilesList", "path", request.getPath());
            FilesList response = api.getFilesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getFilesList", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getFilesList");
        }
    }
    /**
     * Get all files and folders within a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesListInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetFilesListRequest request = createGetFilesListRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "getFilesList", "storageName"));
            initialize("getFilesList", "storageName", request.getStorageName());
            FilesList response = api.getFilesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "getFilesList", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "getFilesList");
        }
    }

    private GetFilesListRequest createGetFilesListRequest() {
        GetFilesListRequest request = new GetFilesListRequest();
        request.setPath((String)getTestValue("String", "getFilesList", "path"));
        request.setStorageName((String)getTestValue("String", "getFilesList", "storageName"));
        return request;
    }
    
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideTest() throws ApiException, Exception {
        initialize("getLayoutSlide", null, null);
        LayoutSlide response = null;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        response = api.getLayoutSlide(request);
        assertNotNull(response);
    }

    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getLayoutSlide", "name"));
            initialize("getLayoutSlide", "name", request.getName());
            LayoutSlide response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getLayoutSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getLayoutSlide", "slideIndex"));
            initialize("getLayoutSlide", "slideIndex", request.getSlideIndex());
            LayoutSlide response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getLayoutSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getLayoutSlide", "password"));
            initialize("getLayoutSlide", "password", request.getPassword());
            LayoutSlide response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getLayoutSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getLayoutSlide", "folder"));
            initialize("getLayoutSlide", "folder", request.getFolder());
            LayoutSlide response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getLayoutSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlideRequest request = createGetLayoutSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getLayoutSlide", "storage"));
            initialize("getLayoutSlide", "storage", request.getStorage());
            LayoutSlide response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getLayoutSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getLayoutSlide");
        }
    }

    private GetLayoutSlideRequest createGetLayoutSlideRequest() {
        GetLayoutSlideRequest request = new GetLayoutSlideRequest();
        request.setName((String)getTestValue("String", "getLayoutSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getLayoutSlide", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getLayoutSlide", "password"));
        request.setFolder((String)getTestValue("String", "getLayoutSlide", "folder"));
        request.setStorage((String)getTestValue("String", "getLayoutSlide", "storage"));
        return request;
    }
    
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListTest() throws ApiException, Exception {
        initialize("getLayoutSlidesList", null, null);
        LayoutSlides response = null;
        GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
        response = api.getLayoutSlidesList(request);
        assertNotNull(response);
    }

    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getLayoutSlidesList", "name"));
            initialize("getLayoutSlidesList", "name", request.getName());
            LayoutSlides response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getLayoutSlidesList", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getLayoutSlidesList", "password"));
            initialize("getLayoutSlidesList", "password", request.getPassword());
            LayoutSlides response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getLayoutSlidesList", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getLayoutSlidesList", "folder"));
            initialize("getLayoutSlidesList", "folder", request.getFolder());
            LayoutSlides response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getLayoutSlidesList", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getLayoutSlidesList", "storage"));
            initialize("getLayoutSlidesList", "storage", request.getStorage());
            LayoutSlides response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getLayoutSlidesList", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getLayoutSlidesList");
        }
    }

    private GetLayoutSlidesListRequest createGetLayoutSlidesListRequest() {
        GetLayoutSlidesListRequest request = new GetLayoutSlidesListRequest();
        request.setName((String)getTestValue("String", "getLayoutSlidesList", "name"));
        request.setPassword((String)getTestValue("String", "getLayoutSlidesList", "password"));
        request.setFolder((String)getTestValue("String", "getLayoutSlidesList", "folder"));
        request.setStorage((String)getTestValue("String", "getLayoutSlidesList", "storage"));
        return request;
    }
    
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideTest() throws ApiException, Exception {
        initialize("getMasterSlide", null, null);
        MasterSlide response = null;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        response = api.getMasterSlide(request);
        assertNotNull(response);
    }

    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getMasterSlide", "name"));
            initialize("getMasterSlide", "name", request.getName());
            MasterSlide response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getMasterSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getMasterSlide", "slideIndex"));
            initialize("getMasterSlide", "slideIndex", request.getSlideIndex());
            MasterSlide response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getMasterSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getMasterSlide", "password"));
            initialize("getMasterSlide", "password", request.getPassword());
            MasterSlide response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getMasterSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getMasterSlide", "folder"));
            initialize("getMasterSlide", "folder", request.getFolder());
            MasterSlide response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getMasterSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlideRequest request = createGetMasterSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getMasterSlide", "storage"));
            initialize("getMasterSlide", "storage", request.getStorage());
            MasterSlide response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getMasterSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getMasterSlide");
        }
    }

    private GetMasterSlideRequest createGetMasterSlideRequest() {
        GetMasterSlideRequest request = new GetMasterSlideRequest();
        request.setName((String)getTestValue("String", "getMasterSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getMasterSlide", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getMasterSlide", "password"));
        request.setFolder((String)getTestValue("String", "getMasterSlide", "folder"));
        request.setStorage((String)getTestValue("String", "getMasterSlide", "storage"));
        return request;
    }
    
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListTest() throws ApiException, Exception {
        initialize("getMasterSlidesList", null, null);
        MasterSlides response = null;
        GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
        response = api.getMasterSlidesList(request);
        assertNotNull(response);
    }

    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getMasterSlidesList", "name"));
            initialize("getMasterSlidesList", "name", request.getName());
            MasterSlides response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getMasterSlidesList", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getMasterSlidesList", "password"));
            initialize("getMasterSlidesList", "password", request.getPassword());
            MasterSlides response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getMasterSlidesList", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getMasterSlidesList", "folder"));
            initialize("getMasterSlidesList", "folder", request.getFolder());
            MasterSlides response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getMasterSlidesList", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getMasterSlidesList", "storage"));
            initialize("getMasterSlidesList", "storage", request.getStorage());
            MasterSlides response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getMasterSlidesList", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getMasterSlidesList");
        }
    }

    private GetMasterSlidesListRequest createGetMasterSlidesListRequest() {
        GetMasterSlidesListRequest request = new GetMasterSlidesListRequest();
        request.setName((String)getTestValue("String", "getMasterSlidesList", "name"));
        request.setPassword((String)getTestValue("String", "getMasterSlidesList", "password"));
        request.setFolder((String)getTestValue("String", "getMasterSlidesList", "folder"));
        request.setStorage((String)getTestValue("String", "getMasterSlidesList", "storage"));
        return request;
    }
    
    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideTest() throws ApiException, Exception {
        initialize("getNotesSlide", null, null);
        NotesSlide response = null;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        response = api.getNotesSlide(request);
        assertNotNull(response);
    }

    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlide", "name"));
            initialize("getNotesSlide", "name", request.getName());
            NotesSlide response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlide");
        }
    }
    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlide", "slideIndex"));
            initialize("getNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlide response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlide");
        }
    }
    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlide", "password"));
            initialize("getNotesSlide", "password", request.getPassword());
            NotesSlide response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlide");
        }
    }
    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlide", "folder"));
            initialize("getNotesSlide", "folder", request.getFolder());
            NotesSlide response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlide");
        }
    }
    /**
     * Read notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideRequest request = createGetNotesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlide", "storage"));
            initialize("getNotesSlide", "storage", request.getStorage());
            NotesSlide response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlide");
        }
    }

    private GetNotesSlideRequest createGetNotesSlideRequest() {
        GetNotesSlideRequest request = new GetNotesSlideRequest();
        request.setName((String)getTestValue("String", "getNotesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlide", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlide", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlide", "storage"));
        return request;
    }
    
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeTest() throws ApiException, Exception {
        initialize("getNotesSlideShape", null, null);
        ShapeBase response = null;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        response = api.getNotesSlideShape(request);
        assertNotNull(response);
    }

    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShape", "name"));
            initialize("getNotesSlideShape", "name", request.getName());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShape", "slideIndex"));
            initialize("getNotesSlideShape", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShape", "path"));
            initialize("getNotesSlideShape", "path", request.getPath());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getNotesSlideShape", "shapeIndex"));
            initialize("getNotesSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShape", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShape", "password"));
            initialize("getNotesSlideShape", "password", request.getPassword());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShape", "folder"));
            initialize("getNotesSlideShape", "folder", request.getFolder());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShape", "storage"));
            initialize("getNotesSlideShape", "storage", request.getStorage());
            ShapeBase response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShape");
        }
    }

    private GetNotesSlideShapeRequest createGetNotesSlideShapeRequest() {
        GetNotesSlideShapeRequest request = new GetNotesSlideShapeRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShape", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getNotesSlideShape", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShape", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShape", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShape", "storage"));
        return request;
    }
    
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphTest() throws ApiException, Exception {
        initialize("getNotesSlideShapeParagraph", null, null);
        Paragraph response = null;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        response = api.getNotesSlideShapeParagraph(request);
        assertNotNull(response);
    }

    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShapeParagraph", "name"));
            initialize("getNotesSlideShapeParagraph", "name", request.getName());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapeParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShapeParagraph", "slideIndex"));
            initialize("getNotesSlideShapeParagraph", "slideIndex", request.getSlideIndex());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapeParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShapeParagraph", "path"));
            initialize("getNotesSlideShapeParagraph", "path", request.getPath());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapeParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getNotesSlideShapeParagraph", "shapeIndex"));
            initialize("getNotesSlideShapeParagraph", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapeParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getNotesSlideShapeParagraph", "paragraphIndex"));
            initialize("getNotesSlideShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapeParagraph", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShapeParagraph", "password"));
            initialize("getNotesSlideShapeParagraph", "password", request.getPassword());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapeParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShapeParagraph", "folder"));
            initialize("getNotesSlideShapeParagraph", "folder", request.getFolder());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapeParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShapeParagraph", "storage"));
            initialize("getNotesSlideShapeParagraph", "storage", request.getStorage());
            Paragraph response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapeParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapeParagraph");
        }
    }

    private GetNotesSlideShapeParagraphRequest createGetNotesSlideShapeParagraphRequest() {
        GetNotesSlideShapeParagraphRequest request = new GetNotesSlideShapeParagraphRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShapeParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShapeParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShapeParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getNotesSlideShapeParagraph", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getNotesSlideShapeParagraph", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShapeParagraph", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShapeParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShapeParagraph", "storage"));
        return request;
    }
    
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsTest() throws ApiException, Exception {
        initialize("getNotesSlideShapeParagraphs", null, null);
        Paragraphs response = null;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        response = api.getNotesSlideShapeParagraphs(request);
        assertNotNull(response);
    }

    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShapeParagraphs", "name"));
            initialize("getNotesSlideShapeParagraphs", "name", request.getName());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapeParagraphs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShapeParagraphs", "slideIndex"));
            initialize("getNotesSlideShapeParagraphs", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapeParagraphs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShapeParagraphs", "path"));
            initialize("getNotesSlideShapeParagraphs", "path", request.getPath());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapeParagraphs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getNotesSlideShapeParagraphs", "shapeIndex"));
            initialize("getNotesSlideShapeParagraphs", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapeParagraphs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShapeParagraphs", "password"));
            initialize("getNotesSlideShapeParagraphs", "password", request.getPassword());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapeParagraphs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShapeParagraphs", "folder"));
            initialize("getNotesSlideShapeParagraphs", "folder", request.getFolder());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapeParagraphs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapeParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShapeParagraphs", "storage"));
            initialize("getNotesSlideShapeParagraphs", "storage", request.getStorage());
            Paragraphs response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapeParagraphs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapeParagraphs");
        }
    }

    private GetNotesSlideShapeParagraphsRequest createGetNotesSlideShapeParagraphsRequest() {
        GetNotesSlideShapeParagraphsRequest request = new GetNotesSlideShapeParagraphsRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShapeParagraphs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShapeParagraphs", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShapeParagraphs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getNotesSlideShapeParagraphs", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShapeParagraphs", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShapeParagraphs", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShapeParagraphs", "storage"));
        return request;
    }
    
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionTest() throws ApiException, Exception {
        initialize("getNotesSlideShapePortion", null, null);
        Portion response = null;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        response = api.getNotesSlideShapePortion(request);
        assertNotNull(response);
    }

    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShapePortion", "name"));
            initialize("getNotesSlideShapePortion", "name", request.getName());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapePortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShapePortion", "slideIndex"));
            initialize("getNotesSlideShapePortion", "slideIndex", request.getSlideIndex());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapePortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShapePortion", "path"));
            initialize("getNotesSlideShapePortion", "path", request.getPath());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapePortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getNotesSlideShapePortion", "shapeIndex"));
            initialize("getNotesSlideShapePortion", "shapeIndex", request.getShapeIndex());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapePortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getNotesSlideShapePortion", "paragraphIndex"));
            initialize("getNotesSlideShapePortion", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapePortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "getNotesSlideShapePortion", "portionIndex"));
            initialize("getNotesSlideShapePortion", "portionIndex", request.getPortionIndex());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "getNotesSlideShapePortion", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShapePortion", "password"));
            initialize("getNotesSlideShapePortion", "password", request.getPassword());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapePortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShapePortion", "folder"));
            initialize("getNotesSlideShapePortion", "folder", request.getFolder());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapePortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapePortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShapePortion", "storage"));
            initialize("getNotesSlideShapePortion", "storage", request.getStorage());
            Portion response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapePortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapePortion");
        }
    }

    private GetNotesSlideShapePortionRequest createGetNotesSlideShapePortionRequest() {
        GetNotesSlideShapePortionRequest request = new GetNotesSlideShapePortionRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShapePortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShapePortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortion", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortion", "portionIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShapePortion", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShapePortion", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShapePortion", "storage"));
        return request;
    }
    
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsTest() throws ApiException, Exception {
        initialize("getNotesSlideShapePortions", null, null);
        Portions response = null;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        response = api.getNotesSlideShapePortions(request);
        assertNotNull(response);
    }

    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShapePortions", "name"));
            initialize("getNotesSlideShapePortions", "name", request.getName());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapePortions", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShapePortions", "slideIndex"));
            initialize("getNotesSlideShapePortions", "slideIndex", request.getSlideIndex());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapePortions", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShapePortions", "path"));
            initialize("getNotesSlideShapePortions", "path", request.getPath());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapePortions", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getNotesSlideShapePortions", "shapeIndex"));
            initialize("getNotesSlideShapePortions", "shapeIndex", request.getShapeIndex());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapePortions", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getNotesSlideShapePortions", "paragraphIndex"));
            initialize("getNotesSlideShapePortions", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapePortions", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShapePortions", "password"));
            initialize("getNotesSlideShapePortions", "password", request.getPassword());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapePortions", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShapePortions", "folder"));
            initialize("getNotesSlideShapePortions", "folder", request.getFolder());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapePortions", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapePortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShapePortions", "storage"));
            initialize("getNotesSlideShapePortions", "storage", request.getStorage());
            Portions response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapePortions", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapePortions");
        }
    }

    private GetNotesSlideShapePortionsRequest createGetNotesSlideShapePortionsRequest() {
        GetNotesSlideShapePortionsRequest request = new GetNotesSlideShapePortionsRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShapePortions", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortions", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShapePortions", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortions", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getNotesSlideShapePortions", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShapePortions", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShapePortions", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShapePortions", "storage"));
        return request;
    }
    
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesTest() throws ApiException, Exception {
        initialize("getNotesSlideShapes", null, null);
        Shapes response = null;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        response = api.getNotesSlideShapes(request);
        assertNotNull(response);
    }

    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideShapes", "name"));
            initialize("getNotesSlideShapes", "name", request.getName());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapes", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideShapes", "slideIndex"));
            initialize("getNotesSlideShapes", "slideIndex", request.getSlideIndex());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapes", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getNotesSlideShapes", "path"));
            initialize("getNotesSlideShapes", "path", request.getPath());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapes", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideShapes", "password"));
            initialize("getNotesSlideShapes", "password", request.getPassword());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapes", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideShapes", "folder"));
            initialize("getNotesSlideShapes", "folder", request.getFolder());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapes", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideShapes", "storage"));
            initialize("getNotesSlideShapes", "storage", request.getStorage());
            Shapes response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapes", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapes");
        }
    }

    private GetNotesSlideShapesRequest createGetNotesSlideShapesRequest() {
        GetNotesSlideShapesRequest request = new GetNotesSlideShapesRequest();
        request.setName((String)getTestValue("String", "getNotesSlideShapes", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideShapes", "slideIndex"));
        request.setPath((String)getTestValue("String", "getNotesSlideShapes", "path"));
        request.setPassword((String)getTestValue("String", "getNotesSlideShapes", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideShapes", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideShapes", "storage"));
        return request;
    }
    
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatTest() throws ApiException, Exception {
        initialize("getNotesSlideWithFormat", null, null);
        File response = null;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        response = api.getNotesSlideWithFormat(request);
        assertTrue(response.isFile());
    }

    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getNotesSlideWithFormat", "name"));
            initialize("getNotesSlideWithFormat", "name", request.getName());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideWithFormat", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getNotesSlideWithFormat", "slideIndex"));
            initialize("getNotesSlideWithFormat", "slideIndex", request.getSlideIndex());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideWithFormat", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setFormat((NotesSlideExportFormat)invalidizeTestValue("NotesSlideExportFormat", request.getFormat(), "getNotesSlideWithFormat", "format"));
            initialize("getNotesSlideWithFormat", "format", request.getFormat());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getNotesSlideWithFormat", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setWidth((Integer)invalidizeTestValue("Integer", request.getWidth(), "getNotesSlideWithFormat", "width"));
            initialize("getNotesSlideWithFormat", "width", request.getWidth());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "getNotesSlideWithFormat", request.getWidth());
        }
        if (needAssertResponse) {
            assertResponse("width", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setHeight((Integer)invalidizeTestValue("Integer", request.getHeight(), "getNotesSlideWithFormat", "height"));
            initialize("getNotesSlideWithFormat", "height", request.getHeight());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "getNotesSlideWithFormat", request.getHeight());
        }
        if (needAssertResponse) {
            assertResponse("height", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getNotesSlideWithFormat", "password"));
            initialize("getNotesSlideWithFormat", "password", request.getPassword());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideWithFormat", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getNotesSlideWithFormat", "folder"));
            initialize("getNotesSlideWithFormat", "folder", request.getFolder());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideWithFormat", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getNotesSlideWithFormat", "storage"));
            initialize("getNotesSlideWithFormat", "storage", request.getStorage());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideWithFormat", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert notes slide to the specified image format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "getNotesSlideWithFormat", "fontsFolder"));
            initialize("getNotesSlideWithFormat", "fontsFolder", request.getFontsFolder());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "getNotesSlideWithFormat", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "getNotesSlideWithFormat");
        }
    }

    private GetNotesSlideWithFormatRequest createGetNotesSlideWithFormatRequest() {
        GetNotesSlideWithFormatRequest request = new GetNotesSlideWithFormatRequest();
        request.setName((String)getTestValue("String", "getNotesSlideWithFormat", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getNotesSlideWithFormat", "slideIndex"));
        request.setFormat((NotesSlideExportFormat)getTestValue("NotesSlideExportFormat", "getNotesSlideWithFormat", "format"));
        request.setWidth((Integer)getTestValue("Integer", "getNotesSlideWithFormat", "width"));
        request.setHeight((Integer)getTestValue("Integer", "getNotesSlideWithFormat", "height"));
        request.setPassword((String)getTestValue("String", "getNotesSlideWithFormat", "password"));
        request.setFolder((String)getTestValue("String", "getNotesSlideWithFormat", "folder"));
        request.setStorage((String)getTestValue("String", "getNotesSlideWithFormat", "storage"));
        request.setFontsFolder((String)getTestValue("String", "getNotesSlideWithFormat", "fontsFolder"));
        return request;
    }
    
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionTest() throws ApiException, Exception {
        initialize("getParagraphPortion", null, null);
        Portion response = null;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        response = api.getParagraphPortion(request);
        assertNotNull(response);
    }

    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getParagraphPortion", "name"));
            initialize("getParagraphPortion", "name", request.getName());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getParagraphPortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getParagraphPortion", "slideIndex"));
            initialize("getParagraphPortion", "slideIndex", request.getSlideIndex());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getParagraphPortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getParagraphPortion", "path"));
            initialize("getParagraphPortion", "path", request.getPath());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getParagraphPortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getParagraphPortion", "shapeIndex"));
            initialize("getParagraphPortion", "shapeIndex", request.getShapeIndex());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getParagraphPortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getParagraphPortion", "paragraphIndex"));
            initialize("getParagraphPortion", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getParagraphPortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "getParagraphPortion", "portionIndex"));
            initialize("getParagraphPortion", "portionIndex", request.getPortionIndex());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "getParagraphPortion", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getParagraphPortion", "password"));
            initialize("getParagraphPortion", "password", request.getPassword());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getParagraphPortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getParagraphPortion", "folder"));
            initialize("getParagraphPortion", "folder", request.getFolder());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getParagraphPortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getParagraphPortion");
        }
    }
    /**
     * Read paragraph portion info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionRequest request = createGetParagraphPortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getParagraphPortion", "storage"));
            initialize("getParagraphPortion", "storage", request.getStorage());
            Portion response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getParagraphPortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getParagraphPortion");
        }
    }

    private GetParagraphPortionRequest createGetParagraphPortionRequest() {
        GetParagraphPortionRequest request = new GetParagraphPortionRequest();
        request.setName((String)getTestValue("String", "getParagraphPortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getParagraphPortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "getParagraphPortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getParagraphPortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getParagraphPortion", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "getParagraphPortion", "portionIndex"));
        request.setPassword((String)getTestValue("String", "getParagraphPortion", "password"));
        request.setFolder((String)getTestValue("String", "getParagraphPortion", "folder"));
        request.setStorage((String)getTestValue("String", "getParagraphPortion", "storage"));
        return request;
    }
    
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsTest() throws ApiException, Exception {
        initialize("getParagraphPortions", null, null);
        Portions response = null;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        response = api.getParagraphPortions(request);
        assertNotNull(response);
    }

    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getParagraphPortions", "name"));
            initialize("getParagraphPortions", "name", request.getName());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getParagraphPortions", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getParagraphPortions", "slideIndex"));
            initialize("getParagraphPortions", "slideIndex", request.getSlideIndex());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getParagraphPortions", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getParagraphPortions", "path"));
            initialize("getParagraphPortions", "path", request.getPath());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getParagraphPortions", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getParagraphPortions", "shapeIndex"));
            initialize("getParagraphPortions", "shapeIndex", request.getShapeIndex());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getParagraphPortions", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getParagraphPortions", "paragraphIndex"));
            initialize("getParagraphPortions", "paragraphIndex", request.getParagraphIndex());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getParagraphPortions", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getParagraphPortions", "password"));
            initialize("getParagraphPortions", "password", request.getPassword());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getParagraphPortions", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getParagraphPortions", "folder"));
            initialize("getParagraphPortions", "folder", request.getFolder());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getParagraphPortions", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getParagraphPortions");
        }
    }
    /**
     * Read paragraph portions info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getParagraphPortions", "storage"));
            initialize("getParagraphPortions", "storage", request.getStorage());
            Portions response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getParagraphPortions", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getParagraphPortions");
        }
    }

    private GetParagraphPortionsRequest createGetParagraphPortionsRequest() {
        GetParagraphPortionsRequest request = new GetParagraphPortionsRequest();
        request.setName((String)getTestValue("String", "getParagraphPortions", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getParagraphPortions", "slideIndex"));
        request.setPath((String)getTestValue("String", "getParagraphPortions", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getParagraphPortions", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getParagraphPortions", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "getParagraphPortions", "password"));
        request.setFolder((String)getTestValue("String", "getParagraphPortions", "folder"));
        request.setStorage((String)getTestValue("String", "getParagraphPortions", "storage"));
        return request;
    }
    
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationTest() throws ApiException, Exception {
        initialize("getSlideAnimation", null, null);
        SlideAnimation response = null;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        response = api.getSlideAnimation(request);
        assertNotNull(response);
    }

    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlideAnimation", "name"));
            initialize("getSlideAnimation", "name", request.getName());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideAnimation", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideAnimation");
        }
    }
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlideAnimation", "slideIndex"));
            initialize("getSlideAnimation", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideAnimation", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideAnimation");
        }
    }
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getSlideAnimation", "shapeIndex"));
            initialize("getSlideAnimation", "shapeIndex", request.getShapeIndex());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideAnimation", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideAnimation");
        }
    }
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlideAnimation", "password"));
            initialize("getSlideAnimation", "password", request.getPassword());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideAnimation", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideAnimation");
        }
    }
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlideAnimation", "folder"));
            initialize("getSlideAnimation", "folder", request.getFolder());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideAnimation", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideAnimation");
        }
    }
    /**
     * Read slide animation effects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideAnimationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideAnimationRequest request = createGetSlideAnimationRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlideAnimation", "storage"));
            initialize("getSlideAnimation", "storage", request.getStorage());
            SlideAnimation response = api.getSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideAnimation", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideAnimation");
        }
    }

    private GetSlideAnimationRequest createGetSlideAnimationRequest() {
        GetSlideAnimationRequest request = new GetSlideAnimationRequest();
        request.setName((String)getTestValue("String", "getSlideAnimation", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlideAnimation", "slideIndex"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getSlideAnimation", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "getSlideAnimation", "password"));
        request.setFolder((String)getTestValue("String", "getSlideAnimation", "folder"));
        request.setStorage((String)getTestValue("String", "getSlideAnimation", "storage"));
        return request;
    }
    
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeTest() throws ApiException, Exception {
        initialize("getSlideShape", null, null);
        ShapeBase response = null;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        response = api.getSlideShape(request);
        assertNotNull(response);
    }

    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlideShape", "name"));
            initialize("getSlideShape", "name", request.getName());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlideShape", "slideIndex"));
            initialize("getSlideShape", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getSlideShape", "path"));
            initialize("getSlideShape", "path", request.getPath());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getSlideShape", "shapeIndex"));
            initialize("getSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideShape", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlideShape", "password"));
            initialize("getSlideShape", "password", request.getPassword());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlideShape", "folder"));
            initialize("getSlideShape", "folder", request.getFolder());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShape");
        }
    }
    /**
     * Read slide shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeRequest request = createGetSlideShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlideShape", "storage"));
            initialize("getSlideShape", "storage", request.getStorage());
            ShapeBase response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShape");
        }
    }

    private GetSlideShapeRequest createGetSlideShapeRequest() {
        GetSlideShapeRequest request = new GetSlideShapeRequest();
        request.setName((String)getTestValue("String", "getSlideShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlideShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "getSlideShape", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getSlideShape", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "getSlideShape", "password"));
        request.setFolder((String)getTestValue("String", "getSlideShape", "folder"));
        request.setStorage((String)getTestValue("String", "getSlideShape", "storage"));
        return request;
    }
    
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphTest() throws ApiException, Exception {
        initialize("getSlideShapeParagraph", null, null);
        Paragraph response = null;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        response = api.getSlideShapeParagraph(request);
        assertNotNull(response);
    }

    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlideShapeParagraph", "name"));
            initialize("getSlideShapeParagraph", "name", request.getName());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShapeParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlideShapeParagraph", "slideIndex"));
            initialize("getSlideShapeParagraph", "slideIndex", request.getSlideIndex());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShapeParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getSlideShapeParagraph", "path"));
            initialize("getSlideShapeParagraph", "path", request.getPath());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShapeParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getSlideShapeParagraph", "shapeIndex"));
            initialize("getSlideShapeParagraph", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideShapeParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "getSlideShapeParagraph", "paragraphIndex"));
            initialize("getSlideShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getSlideShapeParagraph", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlideShapeParagraph", "password"));
            initialize("getSlideShapeParagraph", "password", request.getPassword());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShapeParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlideShapeParagraph", "folder"));
            initialize("getSlideShapeParagraph", "folder", request.getFolder());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShapeParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShapeParagraph");
        }
    }
    /**
     * Read shape paragraph info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphRequest request = createGetSlideShapeParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlideShapeParagraph", "storage"));
            initialize("getSlideShapeParagraph", "storage", request.getStorage());
            Paragraph response = api.getSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShapeParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShapeParagraph");
        }
    }

    private GetSlideShapeParagraphRequest createGetSlideShapeParagraphRequest() {
        GetSlideShapeParagraphRequest request = new GetSlideShapeParagraphRequest();
        request.setName((String)getTestValue("String", "getSlideShapeParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlideShapeParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "getSlideShapeParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getSlideShapeParagraph", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "getSlideShapeParagraph", "paragraphIndex"));
        request.setPassword((String)getTestValue("String", "getSlideShapeParagraph", "password"));
        request.setFolder((String)getTestValue("String", "getSlideShapeParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "getSlideShapeParagraph", "storage"));
        return request;
    }
    
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsTest() throws ApiException, Exception {
        initialize("getSlideShapeParagraphs", null, null);
        Paragraphs response = null;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        response = api.getSlideShapeParagraphs(request);
        assertNotNull(response);
    }

    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlideShapeParagraphs", "name"));
            initialize("getSlideShapeParagraphs", "name", request.getName());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShapeParagraphs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlideShapeParagraphs", "slideIndex"));
            initialize("getSlideShapeParagraphs", "slideIndex", request.getSlideIndex());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShapeParagraphs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getSlideShapeParagraphs", "path"));
            initialize("getSlideShapeParagraphs", "path", request.getPath());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShapeParagraphs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "getSlideShapeParagraphs", "shapeIndex"));
            initialize("getSlideShapeParagraphs", "shapeIndex", request.getShapeIndex());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideShapeParagraphs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlideShapeParagraphs", "password"));
            initialize("getSlideShapeParagraphs", "password", request.getPassword());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShapeParagraphs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlideShapeParagraphs", "folder"));
            initialize("getSlideShapeParagraphs", "folder", request.getFolder());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShapeParagraphs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read shape paragraphs info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlideShapeParagraphs", "storage"));
            initialize("getSlideShapeParagraphs", "storage", request.getStorage());
            Paragraphs response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShapeParagraphs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShapeParagraphs");
        }
    }

    private GetSlideShapeParagraphsRequest createGetSlideShapeParagraphsRequest() {
        GetSlideShapeParagraphsRequest request = new GetSlideShapeParagraphsRequest();
        request.setName((String)getTestValue("String", "getSlideShapeParagraphs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlideShapeParagraphs", "slideIndex"));
        request.setPath((String)getTestValue("String", "getSlideShapeParagraphs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "getSlideShapeParagraphs", "shapeIndex"));
        request.setPassword((String)getTestValue("String", "getSlideShapeParagraphs", "password"));
        request.setFolder((String)getTestValue("String", "getSlideShapeParagraphs", "folder"));
        request.setStorage((String)getTestValue("String", "getSlideShapeParagraphs", "storage"));
        return request;
    }
    
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesTest() throws ApiException, Exception {
        initialize("getSlideShapes", null, null);
        Shapes response = null;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        response = api.getSlideShapes(request);
        assertNotNull(response);
    }

    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlideShapes", "name"));
            initialize("getSlideShapes", "name", request.getName());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShapes", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlideShapes", "slideIndex"));
            initialize("getSlideShapes", "slideIndex", request.getSlideIndex());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShapes", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "getSlideShapes", "path"));
            initialize("getSlideShapes", "path", request.getPath());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShapes", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlideShapes", "password"));
            initialize("getSlideShapes", "password", request.getPassword());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShapes", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlideShapes", "folder"));
            initialize("getSlideShapes", "folder", request.getFolder());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShapes", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlideShapesRequest request = createGetSlideShapesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlideShapes", "storage"));
            initialize("getSlideShapes", "storage", request.getStorage());
            Shapes response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShapes", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShapes");
        }
    }

    private GetSlideShapesRequest createGetSlideShapesRequest() {
        GetSlideShapesRequest request = new GetSlideShapesRequest();
        request.setName((String)getTestValue("String", "getSlideShapes", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlideShapes", "slideIndex"));
        request.setPath((String)getTestValue("String", "getSlideShapes", "path"));
        request.setPassword((String)getTestValue("String", "getSlideShapes", "password"));
        request.setFolder((String)getTestValue("String", "getSlideShapes", "folder"));
        request.setStorage((String)getTestValue("String", "getSlideShapes", "storage"));
        return request;
    }
    
    /**
     * Get API info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesApiInfoTest() throws ApiException, Exception {
        initialize("getSlidesApiInfo", null, null);
        ApiInfo response = null;
        GetSlidesApiInfoRequest request = createGetSlidesApiInfoRequest();
        response = api.getSlidesApiInfo(request);
        assertNotNull(response);
    }


    private GetSlidesApiInfoRequest createGetSlidesApiInfoRequest() {
        GetSlidesApiInfoRequest request = new GetSlidesApiInfoRequest();
        return request;
    }
    
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentTest() throws ApiException, Exception {
        initialize("getSlidesDocument", null, null);
        Document response = null;
        GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
        response = api.getSlidesDocument(request);
        assertNotNull(response);
    }

    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesDocument", "name"));
            initialize("getSlidesDocument", "name", request.getName());
            Document response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocument", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesDocument", "password"));
            initialize("getSlidesDocument", "password", request.getPassword());
            Document response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocument", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesDocument", "storage"));
            initialize("getSlidesDocument", "storage", request.getStorage());
            Document response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocument", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesDocument", "folder"));
            initialize("getSlidesDocument", "folder", request.getFolder());
            Document response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocument", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocument");
        }
    }

    private GetSlidesDocumentRequest createGetSlidesDocumentRequest() {
        GetSlidesDocumentRequest request = new GetSlidesDocumentRequest();
        request.setName((String)getTestValue("String", "getSlidesDocument", "name"));
        request.setPassword((String)getTestValue("String", "getSlidesDocument", "password"));
        request.setStorage((String)getTestValue("String", "getSlidesDocument", "storage"));
        request.setFolder((String)getTestValue("String", "getSlidesDocument", "folder"));
        return request;
    }
    
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesTest() throws ApiException, Exception {
        initialize("getSlidesDocumentProperties", null, null);
        DocumentProperties response = null;
        GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
        response = api.getSlidesDocumentProperties(request);
        assertNotNull(response);
    }

    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesDocumentProperties", "name"));
            initialize("getSlidesDocumentProperties", "name", request.getName());
            DocumentProperties response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocumentProperties", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesDocumentProperties", "password"));
            initialize("getSlidesDocumentProperties", "password", request.getPassword());
            DocumentProperties response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocumentProperties", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesDocumentProperties", "folder"));
            initialize("getSlidesDocumentProperties", "folder", request.getFolder());
            DocumentProperties response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocumentProperties", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesDocumentProperties", "storage"));
            initialize("getSlidesDocumentProperties", "storage", request.getStorage());
            DocumentProperties response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocumentProperties", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocumentProperties");
        }
    }

    private GetSlidesDocumentPropertiesRequest createGetSlidesDocumentPropertiesRequest() {
        GetSlidesDocumentPropertiesRequest request = new GetSlidesDocumentPropertiesRequest();
        request.setName((String)getTestValue("String", "getSlidesDocumentProperties", "name"));
        request.setPassword((String)getTestValue("String", "getSlidesDocumentProperties", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesDocumentProperties", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesDocumentProperties", "storage"));
        return request;
    }
    
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyTest() throws ApiException, Exception {
        initialize("getSlidesDocumentProperty", null, null);
        DocumentProperty response = null;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        response = api.getSlidesDocumentProperty(request);
        assertNotNull(response);
    }

    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesDocumentProperty", "name"));
            initialize("getSlidesDocumentProperty", "name", request.getName());
            DocumentProperty response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocumentProperty", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        try {
            request.setPropertyName((String)invalidizeTestValue("String", request.getPropertyName(), "getSlidesDocumentProperty", "propertyName"));
            initialize("getSlidesDocumentProperty", "propertyName", request.getPropertyName());
            DocumentProperty response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "getSlidesDocumentProperty", request.getPropertyName());
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesDocumentProperty", "password"));
            initialize("getSlidesDocumentProperty", "password", request.getPassword());
            DocumentProperty response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocumentProperty", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesDocumentProperty", "folder"));
            initialize("getSlidesDocumentProperty", "folder", request.getFolder());
            DocumentProperty response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocumentProperty", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesDocumentProperty", "storage"));
            initialize("getSlidesDocumentProperty", "storage", request.getStorage());
            DocumentProperty response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocumentProperty", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocumentProperty");
        }
    }

    private GetSlidesDocumentPropertyRequest createGetSlidesDocumentPropertyRequest() {
        GetSlidesDocumentPropertyRequest request = new GetSlidesDocumentPropertyRequest();
        request.setName((String)getTestValue("String", "getSlidesDocumentProperty", "name"));
        request.setPropertyName((String)getTestValue("String", "getSlidesDocumentProperty", "propertyName"));
        request.setPassword((String)getTestValue("String", "getSlidesDocumentProperty", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesDocumentProperty", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesDocumentProperty", "storage"));
        return request;
    }
    
    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatTest() throws ApiException, Exception {
        initialize("getSlidesImageWithDefaultFormat", null, null);
        File response = null;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        response = api.getSlidesImageWithDefaultFormat(request);
        assertTrue(response.isFile());
    }

    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesImageWithDefaultFormat", "name"));
            initialize("getSlidesImageWithDefaultFormat", "name", request.getName());
            File response = api.getSlidesImageWithDefaultFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesImageWithDefaultFormat", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesImageWithDefaultFormat");
        }
    }
    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatInvalidIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        try {
            request.setIndex((Integer)invalidizeTestValue("Integer", request.getIndex(), "getSlidesImageWithDefaultFormat", "index"));
            initialize("getSlidesImageWithDefaultFormat", "index", request.getIndex());
            File response = api.getSlidesImageWithDefaultFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "index", "getSlidesImageWithDefaultFormat", request.getIndex());
        }
        if (needAssertResponse) {
            assertResponse("index", "getSlidesImageWithDefaultFormat");
        }
    }
    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesImageWithDefaultFormat", "password"));
            initialize("getSlidesImageWithDefaultFormat", "password", request.getPassword());
            File response = api.getSlidesImageWithDefaultFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesImageWithDefaultFormat", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesImageWithDefaultFormat");
        }
    }
    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesImageWithDefaultFormat", "folder"));
            initialize("getSlidesImageWithDefaultFormat", "folder", request.getFolder());
            File response = api.getSlidesImageWithDefaultFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesImageWithDefaultFormat", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesImageWithDefaultFormat");
        }
    }
    /**
     * Get image binary data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithDefaultFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithDefaultFormatRequest request = createGetSlidesImageWithDefaultFormatRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesImageWithDefaultFormat", "storage"));
            initialize("getSlidesImageWithDefaultFormat", "storage", request.getStorage());
            File response = api.getSlidesImageWithDefaultFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesImageWithDefaultFormat", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesImageWithDefaultFormat");
        }
    }

    private GetSlidesImageWithDefaultFormatRequest createGetSlidesImageWithDefaultFormatRequest() {
        GetSlidesImageWithDefaultFormatRequest request = new GetSlidesImageWithDefaultFormatRequest();
        request.setName((String)getTestValue("String", "getSlidesImageWithDefaultFormat", "name"));
        request.setIndex((Integer)getTestValue("Integer", "getSlidesImageWithDefaultFormat", "index"));
        request.setPassword((String)getTestValue("String", "getSlidesImageWithDefaultFormat", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesImageWithDefaultFormat", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesImageWithDefaultFormat", "storage"));
        return request;
    }
    
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatTest() throws ApiException, Exception {
        initialize("getSlidesImageWithFormat", null, null);
        File response = null;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        response = api.getSlidesImageWithFormat(request);
        assertTrue(response.isFile());
    }

    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesImageWithFormat", "name"));
            initialize("getSlidesImageWithFormat", "name", request.getName());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesImageWithFormat", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setIndex((Integer)invalidizeTestValue("Integer", request.getIndex(), "getSlidesImageWithFormat", "index"));
            initialize("getSlidesImageWithFormat", "index", request.getIndex());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "index", "getSlidesImageWithFormat", request.getIndex());
        }
        if (needAssertResponse) {
            assertResponse("index", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setFormat((ImageExportFormat)invalidizeTestValue("ImageExportFormat", request.getFormat(), "getSlidesImageWithFormat", "format"));
            initialize("getSlidesImageWithFormat", "format", request.getFormat());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getSlidesImageWithFormat", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesImageWithFormat", "password"));
            initialize("getSlidesImageWithFormat", "password", request.getPassword());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesImageWithFormat", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesImageWithFormat", "folder"));
            initialize("getSlidesImageWithFormat", "folder", request.getFolder());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesImageWithFormat", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesImageWithFormat", "storage"));
            initialize("getSlidesImageWithFormat", "storage", request.getStorage());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesImageWithFormat", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesImageWithFormat");
        }
    }

    private GetSlidesImageWithFormatRequest createGetSlidesImageWithFormatRequest() {
        GetSlidesImageWithFormatRequest request = new GetSlidesImageWithFormatRequest();
        request.setName((String)getTestValue("String", "getSlidesImageWithFormat", "name"));
        request.setIndex((Integer)getTestValue("Integer", "getSlidesImageWithFormat", "index"));
        request.setFormat((ImageExportFormat)getTestValue("ImageExportFormat", "getSlidesImageWithFormat", "format"));
        request.setPassword((String)getTestValue("String", "getSlidesImageWithFormat", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesImageWithFormat", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesImageWithFormat", "storage"));
        return request;
    }
    
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesTest() throws ApiException, Exception {
        initialize("getSlidesImages", null, null);
        Images response = null;
        GetSlidesImagesRequest request = createGetSlidesImagesRequest();
        response = api.getSlidesImages(request);
        assertNotNull(response);
    }

    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImagesRequest request = createGetSlidesImagesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesImages", "name"));
            initialize("getSlidesImages", "name", request.getName());
            Images response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesImages", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImagesRequest request = createGetSlidesImagesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesImages", "password"));
            initialize("getSlidesImages", "password", request.getPassword());
            Images response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesImages", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImagesRequest request = createGetSlidesImagesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesImages", "folder"));
            initialize("getSlidesImages", "folder", request.getFolder());
            Images response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesImages", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesImagesRequest request = createGetSlidesImagesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesImages", "storage"));
            initialize("getSlidesImages", "storage", request.getStorage());
            Images response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesImages", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesImages");
        }
    }

    private GetSlidesImagesRequest createGetSlidesImagesRequest() {
        GetSlidesImagesRequest request = new GetSlidesImagesRequest();
        request.setName((String)getTestValue("String", "getSlidesImages", "name"));
        request.setPassword((String)getTestValue("String", "getSlidesImages", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesImages", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesImages", "storage"));
        return request;
    }
    
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderTest() throws ApiException, Exception {
        initialize("getSlidesPlaceholder", null, null);
        Placeholder response = null;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        response = api.getSlidesPlaceholder(request);
        assertNotNull(response);
    }

    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesPlaceholder", "name"));
            initialize("getSlidesPlaceholder", "name", request.getName());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPlaceholder", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesPlaceholder", "slideIndex"));
            initialize("getSlidesPlaceholder", "slideIndex", request.getSlideIndex());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesPlaceholder", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidPlaceholderIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setPlaceholderIndex((Integer)invalidizeTestValue("Integer", request.getPlaceholderIndex(), "getSlidesPlaceholder", "placeholderIndex"));
            initialize("getSlidesPlaceholder", "placeholderIndex", request.getPlaceholderIndex());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "placeholderIndex", "getSlidesPlaceholder", request.getPlaceholderIndex());
        }
        if (needAssertResponse) {
            assertResponse("placeholderIndex", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesPlaceholder", "password"));
            initialize("getSlidesPlaceholder", "password", request.getPassword());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPlaceholder", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesPlaceholder", "folder"));
            initialize("getSlidesPlaceholder", "folder", request.getFolder());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPlaceholder", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesPlaceholder", "storage"));
            initialize("getSlidesPlaceholder", "storage", request.getStorage());
            Placeholder response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPlaceholder", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPlaceholder");
        }
    }

    private GetSlidesPlaceholderRequest createGetSlidesPlaceholderRequest() {
        GetSlidesPlaceholderRequest request = new GetSlidesPlaceholderRequest();
        request.setName((String)getTestValue("String", "getSlidesPlaceholder", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesPlaceholder", "slideIndex"));
        request.setPlaceholderIndex((Integer)getTestValue("Integer", "getSlidesPlaceholder", "placeholderIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesPlaceholder", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesPlaceholder", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesPlaceholder", "storage"));
        return request;
    }
    
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersTest() throws ApiException, Exception {
        initialize("getSlidesPlaceholders", null, null);
        Placeholders response = null;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        response = api.getSlidesPlaceholders(request);
        assertNotNull(response);
    }

    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesPlaceholders", "name"));
            initialize("getSlidesPlaceholders", "name", request.getName());
            Placeholders response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPlaceholders", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesPlaceholders", "slideIndex"));
            initialize("getSlidesPlaceholders", "slideIndex", request.getSlideIndex());
            Placeholders response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesPlaceholders", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesPlaceholders", "password"));
            initialize("getSlidesPlaceholders", "password", request.getPassword());
            Placeholders response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPlaceholders", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesPlaceholders", "folder"));
            initialize("getSlidesPlaceholders", "folder", request.getFolder());
            Placeholders response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPlaceholders", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesPlaceholders", "storage"));
            initialize("getSlidesPlaceholders", "storage", request.getStorage());
            Placeholders response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPlaceholders", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPlaceholders");
        }
    }

    private GetSlidesPlaceholdersRequest createGetSlidesPlaceholdersRequest() {
        GetSlidesPlaceholdersRequest request = new GetSlidesPlaceholdersRequest();
        request.setName((String)getTestValue("String", "getSlidesPlaceholders", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesPlaceholders", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesPlaceholders", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesPlaceholders", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesPlaceholders", "storage"));
        return request;
    }
    
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsTest() throws ApiException, Exception {
        initialize("getSlidesPresentationTextItems", null, null);
        TextItems response = null;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        response = api.getSlidesPresentationTextItems(request);
        assertNotNull(response);
    }

    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesPresentationTextItems", "name"));
            initialize("getSlidesPresentationTextItems", "name", request.getName());
            TextItems response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPresentationTextItems", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidWithEmptyTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        try {
            request.setWithEmpty((Boolean)invalidizeTestValue("Boolean", request.getWithEmpty(), "getSlidesPresentationTextItems", "withEmpty"));
            initialize("getSlidesPresentationTextItems", "withEmpty", request.getWithEmpty());
            TextItems response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "withEmpty", "getSlidesPresentationTextItems", request.getWithEmpty());
        }
        if (needAssertResponse) {
            assertResponse("withEmpty", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesPresentationTextItems", "password"));
            initialize("getSlidesPresentationTextItems", "password", request.getPassword());
            TextItems response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPresentationTextItems", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesPresentationTextItems", "folder"));
            initialize("getSlidesPresentationTextItems", "folder", request.getFolder());
            TextItems response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPresentationTextItems", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesPresentationTextItems", "storage"));
            initialize("getSlidesPresentationTextItems", "storage", request.getStorage());
            TextItems response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPresentationTextItems", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPresentationTextItems");
        }
    }

    private GetSlidesPresentationTextItemsRequest createGetSlidesPresentationTextItemsRequest() {
        GetSlidesPresentationTextItemsRequest request = new GetSlidesPresentationTextItemsRequest();
        request.setName((String)getTestValue("String", "getSlidesPresentationTextItems", "name"));
        request.setWithEmpty((Boolean)getTestValue("Boolean", "getSlidesPresentationTextItems", "withEmpty"));
        request.setPassword((String)getTestValue("String", "getSlidesPresentationTextItems", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesPresentationTextItems", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesPresentationTextItems", "storage"));
        return request;
    }
    
    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTest() throws ApiException, Exception {
        initialize("getSlidesSlide", null, null);
        Slide response = null;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        response = api.getSlidesSlide(request);
        assertNotNull(response);
    }

    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlide", "name"));
            initialize("getSlidesSlide", "name", request.getName());
            Slide response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlide");
        }
    }
    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesSlide", "slideIndex"));
            initialize("getSlidesSlide", "slideIndex", request.getSlideIndex());
            Slide response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlide");
        }
    }
    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlide", "password"));
            initialize("getSlidesSlide", "password", request.getPassword());
            Slide response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlide");
        }
    }
    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlide", "folder"));
            initialize("getSlidesSlide", "folder", request.getFolder());
            Slide response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlide");
        }
    }
    /**
     * Read presentation slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideRequest request = createGetSlidesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlide", "storage"));
            initialize("getSlidesSlide", "storage", request.getStorage());
            Slide response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlide");
        }
    }

    private GetSlidesSlideRequest createGetSlidesSlideRequest() {
        GetSlidesSlideRequest request = new GetSlidesSlideRequest();
        request.setName((String)getTestValue("String", "getSlidesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesSlide", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesSlide", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlide", "storage"));
        return request;
    }
    
    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("getSlidesSlideBackground", null, null);
        SlideBackground response = null;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        response = api.getSlidesSlideBackground(request);
        assertNotNull(response);
    }

    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlideBackground", "name"));
            initialize("getSlidesSlideBackground", "name", request.getName());
            SlideBackground response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideBackground", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideBackground");
        }
    }
    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesSlideBackground", "slideIndex"));
            initialize("getSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackground response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideBackground", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideBackground");
        }
    }
    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlideBackground", "password"));
            initialize("getSlidesSlideBackground", "password", request.getPassword());
            SlideBackground response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideBackground", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideBackground");
        }
    }
    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlideBackground", "folder"));
            initialize("getSlidesSlideBackground", "folder", request.getFolder());
            SlideBackground response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideBackground", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideBackground");
        }
    }
    /**
     * Read slide background info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlideBackground", "storage"));
            initialize("getSlidesSlideBackground", "storage", request.getStorage());
            SlideBackground response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideBackground", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideBackground");
        }
    }

    private GetSlidesSlideBackgroundRequest createGetSlidesSlideBackgroundRequest() {
        GetSlidesSlideBackgroundRequest request = new GetSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("String", "getSlidesSlideBackground", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesSlideBackground", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesSlideBackground", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlideBackground", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlideBackground", "storage"));
        return request;
    }
    
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsTest() throws ApiException, Exception {
        initialize("getSlidesSlideComments", null, null);
        SlideComments response = null;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        response = api.getSlidesSlideComments(request);
        assertNotNull(response);
    }

    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlideComments", "name"));
            initialize("getSlidesSlideComments", "name", request.getName());
            SlideComments response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideComments", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesSlideComments", "slideIndex"));
            initialize("getSlidesSlideComments", "slideIndex", request.getSlideIndex());
            SlideComments response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideComments", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlideComments", "password"));
            initialize("getSlidesSlideComments", "password", request.getPassword());
            SlideComments response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideComments", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlideComments", "folder"));
            initialize("getSlidesSlideComments", "folder", request.getFolder());
            SlideComments response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideComments", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlideComments", "storage"));
            initialize("getSlidesSlideComments", "storage", request.getStorage());
            SlideComments response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideComments", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideComments");
        }
    }

    private GetSlidesSlideCommentsRequest createGetSlidesSlideCommentsRequest() {
        GetSlidesSlideCommentsRequest request = new GetSlidesSlideCommentsRequest();
        request.setName((String)getTestValue("String", "getSlidesSlideComments", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesSlideComments", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesSlideComments", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlideComments", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlideComments", "storage"));
        return request;
    }
    
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesTest() throws ApiException, Exception {
        initialize("getSlidesSlideImages", null, null);
        Images response = null;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        response = api.getSlidesSlideImages(request);
        assertNotNull(response);
    }

    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlideImages", "name"));
            initialize("getSlidesSlideImages", "name", request.getName());
            Images response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideImages", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesSlideImages", "slideIndex"));
            initialize("getSlidesSlideImages", "slideIndex", request.getSlideIndex());
            Images response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideImages", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlideImages", "password"));
            initialize("getSlidesSlideImages", "password", request.getPassword());
            Images response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideImages", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlideImages", "folder"));
            initialize("getSlidesSlideImages", "folder", request.getFolder());
            Images response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideImages", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlideImages", "storage"));
            initialize("getSlidesSlideImages", "storage", request.getStorage());
            Images response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideImages", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideImages");
        }
    }

    private GetSlidesSlideImagesRequest createGetSlidesSlideImagesRequest() {
        GetSlidesSlideImagesRequest request = new GetSlidesSlideImagesRequest();
        request.setName((String)getTestValue("String", "getSlidesSlideImages", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesSlideImages", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesSlideImages", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlideImages", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlideImages", "storage"));
        return request;
    }
    
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsTest() throws ApiException, Exception {
        initialize("getSlidesSlideTextItems", null, null);
        TextItems response = null;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        response = api.getSlidesSlideTextItems(request);
        assertNotNull(response);
    }

    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlideTextItems", "name"));
            initialize("getSlidesSlideTextItems", "name", request.getName());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideTextItems", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesSlideTextItems", "slideIndex"));
            initialize("getSlidesSlideTextItems", "slideIndex", request.getSlideIndex());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideTextItems", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidWithEmptyTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setWithEmpty((Boolean)invalidizeTestValue("Boolean", request.getWithEmpty(), "getSlidesSlideTextItems", "withEmpty"));
            initialize("getSlidesSlideTextItems", "withEmpty", request.getWithEmpty());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "withEmpty", "getSlidesSlideTextItems", request.getWithEmpty());
        }
        if (needAssertResponse) {
            assertResponse("withEmpty", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlideTextItems", "password"));
            initialize("getSlidesSlideTextItems", "password", request.getPassword());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideTextItems", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlideTextItems", "folder"));
            initialize("getSlidesSlideTextItems", "folder", request.getFolder());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideTextItems", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlideTextItems", "storage"));
            initialize("getSlidesSlideTextItems", "storage", request.getStorage());
            TextItems response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideTextItems", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideTextItems");
        }
    }

    private GetSlidesSlideTextItemsRequest createGetSlidesSlideTextItemsRequest() {
        GetSlidesSlideTextItemsRequest request = new GetSlidesSlideTextItemsRequest();
        request.setName((String)getTestValue("String", "getSlidesSlideTextItems", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesSlideTextItems", "slideIndex"));
        request.setWithEmpty((Boolean)getTestValue("Boolean", "getSlidesSlideTextItems", "withEmpty"));
        request.setPassword((String)getTestValue("String", "getSlidesSlideTextItems", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlideTextItems", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlideTextItems", "storage"));
        return request;
    }
    
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListTest() throws ApiException, Exception {
        initialize("getSlidesSlidesList", null, null);
        Slides response = null;
        GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
        response = api.getSlidesSlidesList(request);
        assertNotNull(response);
    }

    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesSlidesList", "name"));
            initialize("getSlidesSlidesList", "name", request.getName());
            Slides response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlidesList", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesSlidesList", "password"));
            initialize("getSlidesSlidesList", "password", request.getPassword());
            Slides response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlidesList", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesSlidesList", "folder"));
            initialize("getSlidesSlidesList", "folder", request.getFolder());
            Slides response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlidesList", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesSlidesList", "storage"));
            initialize("getSlidesSlidesList", "storage", request.getStorage());
            Slides response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlidesList", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlidesList");
        }
    }

    private GetSlidesSlidesListRequest createGetSlidesSlidesListRequest() {
        GetSlidesSlidesListRequest request = new GetSlidesSlidesListRequest();
        request.setName((String)getTestValue("String", "getSlidesSlidesList", "name"));
        request.setPassword((String)getTestValue("String", "getSlidesSlidesList", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesSlidesList", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesSlidesList", "storage"));
        return request;
    }
    
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeTest() throws ApiException, Exception {
        initialize("getSlidesTheme", null, null);
        Theme response = null;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        response = api.getSlidesTheme(request);
        assertNotNull(response);
    }

    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesTheme", "name"));
            initialize("getSlidesTheme", "name", request.getName());
            Theme response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesTheme", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesTheme", "slideIndex"));
            initialize("getSlidesTheme", "slideIndex", request.getSlideIndex());
            Theme response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesTheme", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesTheme", "password"));
            initialize("getSlidesTheme", "password", request.getPassword());
            Theme response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesTheme", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesTheme", "folder"));
            initialize("getSlidesTheme", "folder", request.getFolder());
            Theme response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesTheme", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeRequest request = createGetSlidesThemeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesTheme", "storage"));
            initialize("getSlidesTheme", "storage", request.getStorage());
            Theme response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesTheme", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesTheme");
        }
    }

    private GetSlidesThemeRequest createGetSlidesThemeRequest() {
        GetSlidesThemeRequest request = new GetSlidesThemeRequest();
        request.setName((String)getTestValue("String", "getSlidesTheme", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesTheme", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesTheme", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesTheme", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesTheme", "storage"));
        return request;
    }
    
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeColorScheme", null, null);
        ColorScheme response = null;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        response = api.getSlidesThemeColorScheme(request);
        assertNotNull(response);
    }

    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesThemeColorScheme", "name"));
            initialize("getSlidesThemeColorScheme", "name", request.getName());
            ColorScheme response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeColorScheme", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesThemeColorScheme", "slideIndex"));
            initialize("getSlidesThemeColorScheme", "slideIndex", request.getSlideIndex());
            ColorScheme response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeColorScheme", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesThemeColorScheme", "password"));
            initialize("getSlidesThemeColorScheme", "password", request.getPassword());
            ColorScheme response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeColorScheme", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesThemeColorScheme", "folder"));
            initialize("getSlidesThemeColorScheme", "folder", request.getFolder());
            ColorScheme response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeColorScheme", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesThemeColorScheme", "storage"));
            initialize("getSlidesThemeColorScheme", "storage", request.getStorage());
            ColorScheme response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeColorScheme", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeColorScheme");
        }
    }

    private GetSlidesThemeColorSchemeRequest createGetSlidesThemeColorSchemeRequest() {
        GetSlidesThemeColorSchemeRequest request = new GetSlidesThemeColorSchemeRequest();
        request.setName((String)getTestValue("String", "getSlidesThemeColorScheme", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesThemeColorScheme", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesThemeColorScheme", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesThemeColorScheme", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesThemeColorScheme", "storage"));
        return request;
    }
    
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeFontScheme", null, null);
        FontScheme response = null;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        response = api.getSlidesThemeFontScheme(request);
        assertNotNull(response);
    }

    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesThemeFontScheme", "name"));
            initialize("getSlidesThemeFontScheme", "name", request.getName());
            FontScheme response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeFontScheme", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesThemeFontScheme", "slideIndex"));
            initialize("getSlidesThemeFontScheme", "slideIndex", request.getSlideIndex());
            FontScheme response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeFontScheme", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesThemeFontScheme", "password"));
            initialize("getSlidesThemeFontScheme", "password", request.getPassword());
            FontScheme response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeFontScheme", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesThemeFontScheme", "folder"));
            initialize("getSlidesThemeFontScheme", "folder", request.getFolder());
            FontScheme response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeFontScheme", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesThemeFontScheme", "storage"));
            initialize("getSlidesThemeFontScheme", "storage", request.getStorage());
            FontScheme response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeFontScheme", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeFontScheme");
        }
    }

    private GetSlidesThemeFontSchemeRequest createGetSlidesThemeFontSchemeRequest() {
        GetSlidesThemeFontSchemeRequest request = new GetSlidesThemeFontSchemeRequest();
        request.setName((String)getTestValue("String", "getSlidesThemeFontScheme", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesThemeFontScheme", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesThemeFontScheme", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesThemeFontScheme", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesThemeFontScheme", "storage"));
        return request;
    }
    
    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeFormatScheme", null, null);
        FormatScheme response = null;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        response = api.getSlidesThemeFormatScheme(request);
        assertNotNull(response);
    }

    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "getSlidesThemeFormatScheme", "name"));
            initialize("getSlidesThemeFormatScheme", "name", request.getName());
            FormatScheme response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeFormatScheme", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "getSlidesThemeFormatScheme", "slideIndex"));
            initialize("getSlidesThemeFormatScheme", "slideIndex", request.getSlideIndex());
            FormatScheme response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeFormatScheme", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "getSlidesThemeFormatScheme", "password"));
            initialize("getSlidesThemeFormatScheme", "password", request.getPassword());
            FormatScheme response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeFormatScheme", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "getSlidesThemeFormatScheme", "folder"));
            initialize("getSlidesThemeFormatScheme", "folder", request.getFolder());
            FormatScheme response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeFormatScheme", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme format scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "getSlidesThemeFormatScheme", "storage"));
            initialize("getSlidesThemeFormatScheme", "storage", request.getStorage());
            FormatScheme response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeFormatScheme", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeFormatScheme");
        }
    }

    private GetSlidesThemeFormatSchemeRequest createGetSlidesThemeFormatSchemeRequest() {
        GetSlidesThemeFormatSchemeRequest request = new GetSlidesThemeFormatSchemeRequest();
        request.setName((String)getTestValue("String", "getSlidesThemeFormatScheme", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "getSlidesThemeFormatScheme", "slideIndex"));
        request.setPassword((String)getTestValue("String", "getSlidesThemeFormatScheme", "password"));
        request.setFolder((String)getTestValue("String", "getSlidesThemeFormatScheme", "folder"));
        request.setStorage((String)getTestValue("String", "getSlidesThemeFormatScheme", "storage"));
        return request;
    }
    
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileTest() throws ApiException, Exception {
        initialize("moveFile", null, null);
        ;
        MoveFileRequest request = createMoveFileRequest();
        api.moveFile(request);
    }

    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileInvalidSrcPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFileRequest request = createMoveFileRequest();
        try {
            request.setSrcPath((String)invalidizeTestValue("String", request.getSrcPath(), "moveFile", "srcPath"));
            initialize("moveFile", "srcPath", request.getSrcPath());
            api.moveFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcPath", "moveFile", request.getSrcPath());
        }
        if (needAssertResponse) {
            assertResponse("srcPath", "moveFile");
        }
    }
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileInvalidDestPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFileRequest request = createMoveFileRequest();
        try {
            request.setDestPath((String)invalidizeTestValue("String", request.getDestPath(), "moveFile", "destPath"));
            initialize("moveFile", "destPath", request.getDestPath());
            api.moveFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destPath", "moveFile", request.getDestPath());
        }
        if (needAssertResponse) {
            assertResponse("destPath", "moveFile");
        }
    }
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileInvalidSrcStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFileRequest request = createMoveFileRequest();
        try {
            request.setSrcStorageName((String)invalidizeTestValue("String", request.getSrcStorageName(), "moveFile", "srcStorageName"));
            initialize("moveFile", "srcStorageName", request.getSrcStorageName());
            api.moveFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcStorageName", "moveFile", request.getSrcStorageName());
        }
        if (needAssertResponse) {
            assertResponse("srcStorageName", "moveFile");
        }
    }
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileInvalidDestStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFileRequest request = createMoveFileRequest();
        try {
            request.setDestStorageName((String)invalidizeTestValue("String", request.getDestStorageName(), "moveFile", "destStorageName"));
            initialize("moveFile", "destStorageName", request.getDestStorageName());
            api.moveFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destStorageName", "moveFile", request.getDestStorageName());
        }
        if (needAssertResponse) {
            assertResponse("destStorageName", "moveFile");
        }
    }
    /**
     * Move file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFileInvalidVersionIdTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFileRequest request = createMoveFileRequest();
        try {
            request.setVersionId((String)invalidizeTestValue("String", request.getVersionId(), "moveFile", "versionId"));
            initialize("moveFile", "versionId", request.getVersionId());
            api.moveFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "versionId", "moveFile", request.getVersionId());
        }
        if (needAssertResponse) {
            assertResponse("versionId", "moveFile");
        }
    }

    private MoveFileRequest createMoveFileRequest() {
        MoveFileRequest request = new MoveFileRequest();
        request.setSrcPath((String)getTestValue("String", "moveFile", "srcPath"));
        request.setDestPath((String)getTestValue("String", "moveFile", "destPath"));
        request.setSrcStorageName((String)getTestValue("String", "moveFile", "srcStorageName"));
        request.setDestStorageName((String)getTestValue("String", "moveFile", "destStorageName"));
        request.setVersionId((String)getTestValue("String", "moveFile", "versionId"));
        return request;
    }
    
    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderTest() throws ApiException, Exception {
        initialize("moveFolder", null, null);
        ;
        MoveFolderRequest request = createMoveFolderRequest();
        api.moveFolder(request);
    }

    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderInvalidSrcPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFolderRequest request = createMoveFolderRequest();
        try {
            request.setSrcPath((String)invalidizeTestValue("String", request.getSrcPath(), "moveFolder", "srcPath"));
            initialize("moveFolder", "srcPath", request.getSrcPath());
            api.moveFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcPath", "moveFolder", request.getSrcPath());
        }
        if (needAssertResponse) {
            assertResponse("srcPath", "moveFolder");
        }
    }
    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderInvalidDestPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFolderRequest request = createMoveFolderRequest();
        try {
            request.setDestPath((String)invalidizeTestValue("String", request.getDestPath(), "moveFolder", "destPath"));
            initialize("moveFolder", "destPath", request.getDestPath());
            api.moveFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destPath", "moveFolder", request.getDestPath());
        }
        if (needAssertResponse) {
            assertResponse("destPath", "moveFolder");
        }
    }
    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderInvalidSrcStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFolderRequest request = createMoveFolderRequest();
        try {
            request.setSrcStorageName((String)invalidizeTestValue("String", request.getSrcStorageName(), "moveFolder", "srcStorageName"));
            initialize("moveFolder", "srcStorageName", request.getSrcStorageName());
            api.moveFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "srcStorageName", "moveFolder", request.getSrcStorageName());
        }
        if (needAssertResponse) {
            assertResponse("srcStorageName", "moveFolder");
        }
    }
    /**
     * Move folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveFolderInvalidDestStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        MoveFolderRequest request = createMoveFolderRequest();
        try {
            request.setDestStorageName((String)invalidizeTestValue("String", request.getDestStorageName(), "moveFolder", "destStorageName"));
            initialize("moveFolder", "destStorageName", request.getDestStorageName());
            api.moveFolder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destStorageName", "moveFolder", request.getDestStorageName());
        }
        if (needAssertResponse) {
            assertResponse("destStorageName", "moveFolder");
        }
    }

    private MoveFolderRequest createMoveFolderRequest() {
        MoveFolderRequest request = new MoveFolderRequest();
        request.setSrcPath((String)getTestValue("String", "moveFolder", "srcPath"));
        request.setDestPath((String)getTestValue("String", "moveFolder", "destPath"));
        request.setSrcStorageName((String)getTestValue("String", "moveFolder", "srcStorageName"));
        request.setDestStorageName((String)getTestValue("String", "moveFolder", "destStorageName"));
        return request;
    }
    
    /**
     * Check if file or folder exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void objectExistsTest() throws ApiException, Exception {
        initialize("objectExists", null, null);
        ObjectExist response = null;
        ObjectExistsRequest request = createObjectExistsRequest();
        response = api.objectExists(request);
        assertNotNull(response);
    }

    /**
     * Check if file or folder exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void objectExistsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        ObjectExistsRequest request = createObjectExistsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "objectExists", "path"));
            initialize("objectExists", "path", request.getPath());
            ObjectExist response = api.objectExists(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "objectExists", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "objectExists");
        }
    }
    /**
     * Check if file or folder exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void objectExistsInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        ObjectExistsRequest request = createObjectExistsRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "objectExists", "storageName"));
            initialize("objectExists", "storageName", request.getStorageName());
            ObjectExist response = api.objectExists(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "objectExists", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "objectExists");
        }
    }
    /**
     * Check if file or folder exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void objectExistsInvalidVersionIdTest() throws ApiException {
        Boolean needAssertResponse = false;
        ObjectExistsRequest request = createObjectExistsRequest();
        try {
            request.setVersionId((String)invalidizeTestValue("String", request.getVersionId(), "objectExists", "versionId"));
            initialize("objectExists", "versionId", request.getVersionId());
            ObjectExist response = api.objectExists(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "versionId", "objectExists", request.getVersionId());
        }
        if (needAssertResponse) {
            assertResponse("versionId", "objectExists");
        }
    }

    private ObjectExistsRequest createObjectExistsRequest() {
        ObjectExistsRequest request = new ObjectExistsRequest();
        request.setPath((String)getTestValue("String", "objectExists", "path"));
        request.setStorageName((String)getTestValue("String", "objectExists", "storageName"));
        request.setVersionId((String)getTestValue("String", "objectExists", "versionId"));
        return request;
    }
    
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphTest() throws ApiException, Exception {
        initialize("postAddNewParagraph", null, null);
        Paragraph response = null;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        response = api.postAddNewParagraph(request);
        assertNotNull(response);
    }

    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postAddNewParagraph", "name"));
            initialize("postAddNewParagraph", "name", request.getName());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postAddNewParagraph", "slideIndex"));
            initialize("postAddNewParagraph", "slideIndex", request.getSlideIndex());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postAddNewParagraph", "path"));
            initialize("postAddNewParagraph", "path", request.getPath());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postAddNewParagraph", "shapeIndex"));
            initialize("postAddNewParagraph", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postAddNewParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setDto((Paragraph)invalidizeTestValue("Paragraph", request.getDto(), "postAddNewParagraph", "dto"));
            initialize("postAddNewParagraph", "dto", request.getDto());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewParagraph", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postAddNewParagraph", "password"));
            initialize("postAddNewParagraph", "password", request.getPassword());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postAddNewParagraph", "folder"));
            initialize("postAddNewParagraph", "folder", request.getFolder());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postAddNewParagraph", "storage"));
            initialize("postAddNewParagraph", "storage", request.getStorage());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postAddNewParagraph", "position"));
            initialize("postAddNewParagraph", "position", request.getPosition());
            Paragraph response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewParagraph", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewParagraph");
        }
    }

    private PostAddNewParagraphRequest createPostAddNewParagraphRequest() {
        PostAddNewParagraphRequest request = new PostAddNewParagraphRequest();
        request.setName((String)getTestValue("String", "postAddNewParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postAddNewParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "postAddNewParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postAddNewParagraph", "shapeIndex"));
        request.setDto((Paragraph)getTestValue("Paragraph", "postAddNewParagraph", "dto"));
        request.setPassword((String)getTestValue("String", "postAddNewParagraph", "password"));
        request.setFolder((String)getTestValue("String", "postAddNewParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "postAddNewParagraph", "storage"));
        request.setPosition((Integer)getTestValue("Integer", "postAddNewParagraph", "position"));
        return request;
    }
    
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionTest() throws ApiException, Exception {
        initialize("postAddNewPortion", null, null);
        Portion response = null;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        response = api.postAddNewPortion(request);
        assertNotNull(response);
    }

    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postAddNewPortion", "name"));
            initialize("postAddNewPortion", "name", request.getName());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewPortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postAddNewPortion", "slideIndex"));
            initialize("postAddNewPortion", "slideIndex", request.getSlideIndex());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewPortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postAddNewPortion", "path"));
            initialize("postAddNewPortion", "path", request.getPath());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewPortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postAddNewPortion", "shapeIndex"));
            initialize("postAddNewPortion", "shapeIndex", request.getShapeIndex());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postAddNewPortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "postAddNewPortion", "paragraphIndex"));
            initialize("postAddNewPortion", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "postAddNewPortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setDto((Portion)invalidizeTestValue("Portion", request.getDto(), "postAddNewPortion", "dto"));
            initialize("postAddNewPortion", "dto", request.getDto());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewPortion", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postAddNewPortion", "password"));
            initialize("postAddNewPortion", "password", request.getPassword());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewPortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postAddNewPortion", "folder"));
            initialize("postAddNewPortion", "folder", request.getFolder());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewPortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postAddNewPortion", "storage"));
            initialize("postAddNewPortion", "storage", request.getStorage());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewPortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewPortionRequest request = createPostAddNewPortionRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postAddNewPortion", "position"));
            initialize("postAddNewPortion", "position", request.getPosition());
            Portion response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewPortion", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewPortion");
        }
    }

    private PostAddNewPortionRequest createPostAddNewPortionRequest() {
        PostAddNewPortionRequest request = new PostAddNewPortionRequest();
        request.setName((String)getTestValue("String", "postAddNewPortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postAddNewPortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "postAddNewPortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postAddNewPortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "postAddNewPortion", "paragraphIndex"));
        request.setDto((Portion)getTestValue("Portion", "postAddNewPortion", "dto"));
        request.setPassword((String)getTestValue("String", "postAddNewPortion", "password"));
        request.setFolder((String)getTestValue("String", "postAddNewPortion", "folder"));
        request.setStorage((String)getTestValue("String", "postAddNewPortion", "storage"));
        request.setPosition((Integer)getTestValue("Integer", "postAddNewPortion", "position"));
        return request;
    }
    
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeTest() throws ApiException, Exception {
        initialize("postAddNewShape", null, null);
        ShapeBase response = null;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        response = api.postAddNewShape(request);
        assertNotNull(response);
    }

    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postAddNewShape", "name"));
            initialize("postAddNewShape", "name", request.getName());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postAddNewShape", "slideIndex"));
            initialize("postAddNewShape", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postAddNewShape", "path"));
            initialize("postAddNewShape", "path", request.getPath());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setDto((ShapeBase)invalidizeTestValue("ShapeBase", request.getDto(), "postAddNewShape", "dto"));
            initialize("postAddNewShape", "dto", request.getDto());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewShape", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postAddNewShape", "password"));
            initialize("postAddNewShape", "password", request.getPassword());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postAddNewShape", "folder"));
            initialize("postAddNewShape", "folder", request.getFolder());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postAddNewShape", "storage"));
            initialize("postAddNewShape", "storage", request.getStorage());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidShapeToCloneTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setShapeToClone((Integer)invalidizeTestValue("Integer", request.getShapeToClone(), "postAddNewShape", "shapeToClone"));
            initialize("postAddNewShape", "shapeToClone", request.getShapeToClone());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeToClone", "postAddNewShape", request.getShapeToClone());
        }
        if (needAssertResponse) {
            assertResponse("shapeToClone", "postAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNewShapeRequest request = createPostAddNewShapeRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postAddNewShape", "position"));
            initialize("postAddNewShape", "position", request.getPosition());
            ShapeBase response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewShape", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewShape");
        }
    }

    private PostAddNewShapeRequest createPostAddNewShapeRequest() {
        PostAddNewShapeRequest request = new PostAddNewShapeRequest();
        request.setName((String)getTestValue("String", "postAddNewShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postAddNewShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "postAddNewShape", "path"));
        request.setDto((ShapeBase)getTestValue("ShapeBase", "postAddNewShape", "dto"));
        request.setPassword((String)getTestValue("String", "postAddNewShape", "password"));
        request.setFolder((String)getTestValue("String", "postAddNewShape", "folder"));
        request.setStorage((String)getTestValue("String", "postAddNewShape", "storage"));
        request.setShapeToClone((Integer)getTestValue("Integer", "postAddNewShape", "shapeToClone"));
        request.setPosition((Integer)getTestValue("Integer", "postAddNewShape", "position"));
        return request;
    }
    
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideTest() throws ApiException, Exception {
        initialize("postAddNotesSlide", null, null);
        NotesSlide response = null;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        response = api.postAddNotesSlide(request);
        assertNotNull(response);
    }

    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postAddNotesSlide", "name"));
            initialize("postAddNotesSlide", "name", request.getName());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNotesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNotesSlide");
        }
    }
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postAddNotesSlide", "slideIndex"));
            initialize("postAddNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNotesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNotesSlide");
        }
    }
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setDto((NotesSlide)invalidizeTestValue("NotesSlide", request.getDto(), "postAddNotesSlide", "dto"));
            initialize("postAddNotesSlide", "dto", request.getDto());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNotesSlide", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNotesSlide");
        }
    }
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postAddNotesSlide", "password"));
            initialize("postAddNotesSlide", "password", request.getPassword());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNotesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNotesSlide");
        }
    }
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postAddNotesSlide", "folder"));
            initialize("postAddNotesSlide", "folder", request.getFolder());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNotesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNotesSlide");
        }
    }
    /**
     * Add new notes slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postAddNotesSlide", "storage"));
            initialize("postAddNotesSlide", "storage", request.getStorage());
            NotesSlide response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNotesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNotesSlide");
        }
    }

    private PostAddNotesSlideRequest createPostAddNotesSlideRequest() {
        PostAddNotesSlideRequest request = new PostAddNotesSlideRequest();
        request.setName((String)getTestValue("String", "postAddNotesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postAddNotesSlide", "slideIndex"));
        request.setDto((NotesSlide)getTestValue("NotesSlide", "postAddNotesSlide", "dto"));
        request.setPassword((String)getTestValue("String", "postAddNotesSlide", "password"));
        request.setFolder((String)getTestValue("String", "postAddNotesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "postAddNotesSlide", "storage"));
        return request;
    }
    
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationTest() throws ApiException, Exception {
        initialize("postCopyLayoutSlideFromSourcePresentation", null, null);
        LayoutSlide response = null;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        response = api.postCopyLayoutSlideFromSourcePresentation(request);
        assertNotNull(response);
    }

    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postCopyLayoutSlideFromSourcePresentation", "name"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "name", request.getName());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postCopyLayoutSlideFromSourcePresentation", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setCloneFrom((String)invalidizeTestValue("String", request.getCloneFrom(), "postCopyLayoutSlideFromSourcePresentation", "cloneFrom"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFrom", request.getCloneFrom());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFrom", "postCopyLayoutSlideFromSourcePresentation", request.getCloneFrom());
        }
        if (needAssertResponse) {
            assertResponse("cloneFrom", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromPosition((Integer)invalidizeTestValue("Integer", request.getCloneFromPosition(), "postCopyLayoutSlideFromSourcePresentation", "cloneFromPosition"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromPosition", request.getCloneFromPosition());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPosition", "postCopyLayoutSlideFromSourcePresentation", request.getCloneFromPosition());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPosition", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromPassword((String)invalidizeTestValue("String", request.getCloneFromPassword(), "postCopyLayoutSlideFromSourcePresentation", "cloneFromPassword"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromPassword", request.getCloneFromPassword());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPassword", "postCopyLayoutSlideFromSourcePresentation", request.getCloneFromPassword());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPassword", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromStorage((String)invalidizeTestValue("String", request.getCloneFromStorage(), "postCopyLayoutSlideFromSourcePresentation", "cloneFromStorage"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromStorage", request.getCloneFromStorage());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromStorage", "postCopyLayoutSlideFromSourcePresentation", request.getCloneFromStorage());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromStorage", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postCopyLayoutSlideFromSourcePresentation", "password"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "password", request.getPassword());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postCopyLayoutSlideFromSourcePresentation", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postCopyLayoutSlideFromSourcePresentation", "folder"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "folder", request.getFolder());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postCopyLayoutSlideFromSourcePresentation", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postCopyLayoutSlideFromSourcePresentation", "storage"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "storage", request.getStorage());
            LayoutSlide response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postCopyLayoutSlideFromSourcePresentation", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postCopyLayoutSlideFromSourcePresentation");
        }
    }

    private PostCopyLayoutSlideFromSourcePresentationRequest createPostCopyLayoutSlideFromSourcePresentationRequest() {
        PostCopyLayoutSlideFromSourcePresentationRequest request = new PostCopyLayoutSlideFromSourcePresentationRequest();
        request.setName((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "name"));
        request.setCloneFrom((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "cloneFrom"));
        request.setCloneFromPosition((Integer)getTestValue("Integer", "postCopyLayoutSlideFromSourcePresentation", "cloneFromPosition"));
        request.setCloneFromPassword((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "cloneFromPassword"));
        request.setCloneFromStorage((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "cloneFromStorage"));
        request.setPassword((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "password"));
        request.setFolder((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "folder"));
        request.setStorage((String)getTestValue("String", "postCopyLayoutSlideFromSourcePresentation", "storage"));
        return request;
    }
    
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationTest() throws ApiException, Exception {
        initialize("postCopyMasterSlideFromSourcePresentation", null, null);
        MasterSlide response = null;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        response = api.postCopyMasterSlideFromSourcePresentation(request);
        assertNotNull(response);
    }

    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postCopyMasterSlideFromSourcePresentation", "name"));
            initialize("postCopyMasterSlideFromSourcePresentation", "name", request.getName());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postCopyMasterSlideFromSourcePresentation", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setCloneFrom((String)invalidizeTestValue("String", request.getCloneFrom(), "postCopyMasterSlideFromSourcePresentation", "cloneFrom"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFrom", request.getCloneFrom());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFrom", "postCopyMasterSlideFromSourcePresentation", request.getCloneFrom());
        }
        if (needAssertResponse) {
            assertResponse("cloneFrom", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromPosition((Integer)invalidizeTestValue("Integer", request.getCloneFromPosition(), "postCopyMasterSlideFromSourcePresentation", "cloneFromPosition"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromPosition", request.getCloneFromPosition());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPosition", "postCopyMasterSlideFromSourcePresentation", request.getCloneFromPosition());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPosition", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromPassword((String)invalidizeTestValue("String", request.getCloneFromPassword(), "postCopyMasterSlideFromSourcePresentation", "cloneFromPassword"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromPassword", request.getCloneFromPassword());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPassword", "postCopyMasterSlideFromSourcePresentation", request.getCloneFromPassword());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPassword", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setCloneFromStorage((String)invalidizeTestValue("String", request.getCloneFromStorage(), "postCopyMasterSlideFromSourcePresentation", "cloneFromStorage"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromStorage", request.getCloneFromStorage());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromStorage", "postCopyMasterSlideFromSourcePresentation", request.getCloneFromStorage());
        }
        if (needAssertResponse) {
            assertResponse("cloneFromStorage", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidApplyToAllTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setApplyToAll((Boolean)invalidizeTestValue("Boolean", request.getApplyToAll(), "postCopyMasterSlideFromSourcePresentation", "applyToAll"));
            initialize("postCopyMasterSlideFromSourcePresentation", "applyToAll", request.getApplyToAll());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "applyToAll", "postCopyMasterSlideFromSourcePresentation", request.getApplyToAll());
        }
        if (needAssertResponse) {
            assertResponse("applyToAll", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postCopyMasterSlideFromSourcePresentation", "password"));
            initialize("postCopyMasterSlideFromSourcePresentation", "password", request.getPassword());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postCopyMasterSlideFromSourcePresentation", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postCopyMasterSlideFromSourcePresentation", "folder"));
            initialize("postCopyMasterSlideFromSourcePresentation", "folder", request.getFolder());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postCopyMasterSlideFromSourcePresentation", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postCopyMasterSlideFromSourcePresentation", "storage"));
            initialize("postCopyMasterSlideFromSourcePresentation", "storage", request.getStorage());
            MasterSlide response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postCopyMasterSlideFromSourcePresentation", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postCopyMasterSlideFromSourcePresentation");
        }
    }

    private PostCopyMasterSlideFromSourcePresentationRequest createPostCopyMasterSlideFromSourcePresentationRequest() {
        PostCopyMasterSlideFromSourcePresentationRequest request = new PostCopyMasterSlideFromSourcePresentationRequest();
        request.setName((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "name"));
        request.setCloneFrom((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "cloneFrom"));
        request.setCloneFromPosition((Integer)getTestValue("Integer", "postCopyMasterSlideFromSourcePresentation", "cloneFromPosition"));
        request.setCloneFromPassword((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "cloneFromPassword"));
        request.setCloneFromStorage((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "cloneFromStorage"));
        request.setApplyToAll((Boolean)getTestValue("Boolean", "postCopyMasterSlideFromSourcePresentation", "applyToAll"));
        request.setPassword((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "password"));
        request.setFolder((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "folder"));
        request.setStorage((String)getTestValue("String", "postCopyMasterSlideFromSourcePresentation", "storage"));
        return request;
    }
    
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewParagraph", null, null);
        Paragraph response = null;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        response = api.postNotesSlideAddNewParagraph(request);
        assertNotNull(response);
    }

    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postNotesSlideAddNewParagraph", "name"));
            initialize("postNotesSlideAddNewParagraph", "name", request.getName());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postNotesSlideAddNewParagraph", "slideIndex"));
            initialize("postNotesSlideAddNewParagraph", "slideIndex", request.getSlideIndex());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postNotesSlideAddNewParagraph", "path"));
            initialize("postNotesSlideAddNewParagraph", "path", request.getPath());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postNotesSlideAddNewParagraph", "shapeIndex"));
            initialize("postNotesSlideAddNewParagraph", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideAddNewParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setDto((Paragraph)invalidizeTestValue("Paragraph", request.getDto(), "postNotesSlideAddNewParagraph", "dto"));
            initialize("postNotesSlideAddNewParagraph", "dto", request.getDto());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewParagraph", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postNotesSlideAddNewParagraph", "password"));
            initialize("postNotesSlideAddNewParagraph", "password", request.getPassword());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postNotesSlideAddNewParagraph", "folder"));
            initialize("postNotesSlideAddNewParagraph", "folder", request.getFolder());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postNotesSlideAddNewParagraph", "storage"));
            initialize("postNotesSlideAddNewParagraph", "storage", request.getStorage());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postNotesSlideAddNewParagraph", "position"));
            initialize("postNotesSlideAddNewParagraph", "position", request.getPosition());
            Paragraph response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewParagraph", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewParagraph");
        }
    }

    private PostNotesSlideAddNewParagraphRequest createPostNotesSlideAddNewParagraphRequest() {
        PostNotesSlideAddNewParagraphRequest request = new PostNotesSlideAddNewParagraphRequest();
        request.setName((String)getTestValue("String", "postNotesSlideAddNewParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "postNotesSlideAddNewParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewParagraph", "shapeIndex"));
        request.setDto((Paragraph)getTestValue("Paragraph", "postNotesSlideAddNewParagraph", "dto"));
        request.setPassword((String)getTestValue("String", "postNotesSlideAddNewParagraph", "password"));
        request.setFolder((String)getTestValue("String", "postNotesSlideAddNewParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "postNotesSlideAddNewParagraph", "storage"));
        request.setPosition((Integer)getTestValue("Integer", "postNotesSlideAddNewParagraph", "position"));
        return request;
    }
    
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewPortion", null, null);
        Portion response = null;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        response = api.postNotesSlideAddNewPortion(request);
        assertNotNull(response);
    }

    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postNotesSlideAddNewPortion", "name"));
            initialize("postNotesSlideAddNewPortion", "name", request.getName());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewPortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postNotesSlideAddNewPortion", "slideIndex"));
            initialize("postNotesSlideAddNewPortion", "slideIndex", request.getSlideIndex());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewPortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postNotesSlideAddNewPortion", "path"));
            initialize("postNotesSlideAddNewPortion", "path", request.getPath());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewPortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postNotesSlideAddNewPortion", "shapeIndex"));
            initialize("postNotesSlideAddNewPortion", "shapeIndex", request.getShapeIndex());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideAddNewPortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "postNotesSlideAddNewPortion", "paragraphIndex"));
            initialize("postNotesSlideAddNewPortion", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "postNotesSlideAddNewPortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setDto((Portion)invalidizeTestValue("Portion", request.getDto(), "postNotesSlideAddNewPortion", "dto"));
            initialize("postNotesSlideAddNewPortion", "dto", request.getDto());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewPortion", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postNotesSlideAddNewPortion", "password"));
            initialize("postNotesSlideAddNewPortion", "password", request.getPassword());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewPortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postNotesSlideAddNewPortion", "folder"));
            initialize("postNotesSlideAddNewPortion", "folder", request.getFolder());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewPortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postNotesSlideAddNewPortion", "storage"));
            initialize("postNotesSlideAddNewPortion", "storage", request.getStorage());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewPortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postNotesSlideAddNewPortion", "position"));
            initialize("postNotesSlideAddNewPortion", "position", request.getPosition());
            Portion response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewPortion", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewPortion");
        }
    }

    private PostNotesSlideAddNewPortionRequest createPostNotesSlideAddNewPortionRequest() {
        PostNotesSlideAddNewPortionRequest request = new PostNotesSlideAddNewPortionRequest();
        request.setName((String)getTestValue("String", "postNotesSlideAddNewPortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewPortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "postNotesSlideAddNewPortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewPortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewPortion", "paragraphIndex"));
        request.setDto((Portion)getTestValue("Portion", "postNotesSlideAddNewPortion", "dto"));
        request.setPassword((String)getTestValue("String", "postNotesSlideAddNewPortion", "password"));
        request.setFolder((String)getTestValue("String", "postNotesSlideAddNewPortion", "folder"));
        request.setStorage((String)getTestValue("String", "postNotesSlideAddNewPortion", "storage"));
        request.setPosition((Integer)getTestValue("Integer", "postNotesSlideAddNewPortion", "position"));
        return request;
    }
    
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewShape", null, null);
        ShapeBase response = null;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        response = api.postNotesSlideAddNewShape(request);
        assertNotNull(response);
    }

    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postNotesSlideAddNewShape", "name"));
            initialize("postNotesSlideAddNewShape", "name", request.getName());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postNotesSlideAddNewShape", "slideIndex"));
            initialize("postNotesSlideAddNewShape", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postNotesSlideAddNewShape", "path"));
            initialize("postNotesSlideAddNewShape", "path", request.getPath());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setDto((ShapeBase)invalidizeTestValue("ShapeBase", request.getDto(), "postNotesSlideAddNewShape", "dto"));
            initialize("postNotesSlideAddNewShape", "dto", request.getDto());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewShape", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postNotesSlideAddNewShape", "password"));
            initialize("postNotesSlideAddNewShape", "password", request.getPassword());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postNotesSlideAddNewShape", "folder"));
            initialize("postNotesSlideAddNewShape", "folder", request.getFolder());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postNotesSlideAddNewShape", "storage"));
            initialize("postNotesSlideAddNewShape", "storage", request.getStorage());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidShapeToCloneTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setShapeToClone((Integer)invalidizeTestValue("Integer", request.getShapeToClone(), "postNotesSlideAddNewShape", "shapeToClone"));
            initialize("postNotesSlideAddNewShape", "shapeToClone", request.getShapeToClone());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeToClone", "postNotesSlideAddNewShape", request.getShapeToClone());
        }
        if (needAssertResponse) {
            assertResponse("shapeToClone", "postNotesSlideAddNewShape");
        }
    }
    /**
     * Create new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewShapeInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postNotesSlideAddNewShape", "position"));
            initialize("postNotesSlideAddNewShape", "position", request.getPosition());
            ShapeBase response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewShape", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewShape");
        }
    }

    private PostNotesSlideAddNewShapeRequest createPostNotesSlideAddNewShapeRequest() {
        PostNotesSlideAddNewShapeRequest request = new PostNotesSlideAddNewShapeRequest();
        request.setName((String)getTestValue("String", "postNotesSlideAddNewShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postNotesSlideAddNewShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "postNotesSlideAddNewShape", "path"));
        request.setDto((ShapeBase)getTestValue("ShapeBase", "postNotesSlideAddNewShape", "dto"));
        request.setPassword((String)getTestValue("String", "postNotesSlideAddNewShape", "password"));
        request.setFolder((String)getTestValue("String", "postNotesSlideAddNewShape", "folder"));
        request.setStorage((String)getTestValue("String", "postNotesSlideAddNewShape", "storage"));
        request.setShapeToClone((Integer)getTestValue("Integer", "postNotesSlideAddNewShape", "shapeToClone"));
        request.setPosition((Integer)getTestValue("Integer", "postNotesSlideAddNewShape", "position"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsTest() throws ApiException, Exception {
        initialize("postNotesSlideShapeSaveAs", null, null);
        File response = null;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        response = api.postNotesSlideShapeSaveAs(request);
        assertTrue(response.isFile());
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postNotesSlideShapeSaveAs", "name"));
            initialize("postNotesSlideShapeSaveAs", "name", request.getName());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideShapeSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postNotesSlideShapeSaveAs", "slideIndex"));
            initialize("postNotesSlideShapeSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideShapeSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postNotesSlideShapeSaveAs", "path"));
            initialize("postNotesSlideShapeSaveAs", "path", request.getPath());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideShapeSaveAs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postNotesSlideShapeSaveAs", "shapeIndex"));
            initialize("postNotesSlideShapeSaveAs", "shapeIndex", request.getShapeIndex());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideShapeSaveAs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setFormat((ShapeExportFormat2)invalidizeTestValue("ShapeExportFormat2", request.getFormat(), "postNotesSlideShapeSaveAs", "format"));
            initialize("postNotesSlideShapeSaveAs", "format", request.getFormat());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postNotesSlideShapeSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setOptions((IShapeExportOptions)invalidizeTestValue("IShapeExportOptions", request.getOptions(), "postNotesSlideShapeSaveAs", "options"));
            initialize("postNotesSlideShapeSaveAs", "options", request.getOptions());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postNotesSlideShapeSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postNotesSlideShapeSaveAs", "password"));
            initialize("postNotesSlideShapeSaveAs", "password", request.getPassword());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideShapeSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postNotesSlideShapeSaveAs", "folder"));
            initialize("postNotesSlideShapeSaveAs", "folder", request.getFolder());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideShapeSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postNotesSlideShapeSaveAs", "storage"));
            initialize("postNotesSlideShapeSaveAs", "storage", request.getStorage());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideShapeSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setScaleX((Double)invalidizeTestValue("Double", request.getScaleX(), "postNotesSlideShapeSaveAs", "scaleX"));
            initialize("postNotesSlideShapeSaveAs", "scaleX", request.getScaleX());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "postNotesSlideShapeSaveAs", request.getScaleX());
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setScaleY((Double)invalidizeTestValue("Double", request.getScaleY(), "postNotesSlideShapeSaveAs", "scaleY"));
            initialize("postNotesSlideShapeSaveAs", "scaleY", request.getScaleY());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "postNotesSlideShapeSaveAs", request.getScaleY());
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setBounds((ShapeThumbnailBounds2)invalidizeTestValue("ShapeThumbnailBounds2", request.getBounds(), "postNotesSlideShapeSaveAs", "bounds"));
            initialize("postNotesSlideShapeSaveAs", "bounds", request.getBounds());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "postNotesSlideShapeSaveAs", request.getBounds());
        }
        if (needAssertResponse) {
            assertResponse("bounds", "postNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postNotesSlideShapeSaveAs", "fontsFolder"));
            initialize("postNotesSlideShapeSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postNotesSlideShapeSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postNotesSlideShapeSaveAs");
        }
    }

    private PostNotesSlideShapeSaveAsRequest createPostNotesSlideShapeSaveAsRequest() {
        PostNotesSlideShapeSaveAsRequest request = new PostNotesSlideShapeSaveAsRequest();
        request.setName((String)getTestValue("String", "postNotesSlideShapeSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postNotesSlideShapeSaveAs", "slideIndex"));
        request.setPath((String)getTestValue("String", "postNotesSlideShapeSaveAs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postNotesSlideShapeSaveAs", "shapeIndex"));
        request.setFormat((ShapeExportFormat2)getTestValue("ShapeExportFormat2", "postNotesSlideShapeSaveAs", "format"));
        request.setOptions((IShapeExportOptions)getTestValue("IShapeExportOptions", "postNotesSlideShapeSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "postNotesSlideShapeSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "postNotesSlideShapeSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "postNotesSlideShapeSaveAs", "storage"));
        request.setScaleX((Double)getTestValue("Double", "postNotesSlideShapeSaveAs", "scaleX"));
        request.setScaleY((Double)getTestValue("Double", "postNotesSlideShapeSaveAs", "scaleY"));
        request.setBounds((ShapeThumbnailBounds2)getTestValue("ShapeThumbnailBounds2", "postNotesSlideShapeSaveAs", "bounds"));
        request.setFontsFolder((String)getTestValue("String", "postNotesSlideShapeSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeTest() throws ApiException, Exception {
        initialize("postPresentationMerge", null, null);
        Document response = null;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        response = api.postPresentationMerge(request);
        assertNotNull(response);
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postPresentationMerge", "name"));
            initialize("postPresentationMerge", "name", request.getName());
            Document response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postPresentationMerge", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidRequestTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        try {
            request.setRequest((PresentationsMergeRequest)invalidizeTestValue("PresentationsMergeRequest", request.getRequest(), "postPresentationMerge", "request"));
            initialize("postPresentationMerge", "request", request.getRequest());
            Document response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "request", "postPresentationMerge", request.getRequest());
        }
        if (needAssertResponse) {
            assertResponse("request", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postPresentationMerge", "password"));
            initialize("postPresentationMerge", "password", request.getPassword());
            Document response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postPresentationMerge", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postPresentationMerge", "storage"));
            initialize("postPresentationMerge", "storage", request.getStorage());
            Document response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postPresentationMerge", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostPresentationMergeRequest request = createPostPresentationMergeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postPresentationMerge", "folder"));
            initialize("postPresentationMerge", "folder", request.getFolder());
            Document response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postPresentationMerge", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postPresentationMerge");
        }
    }

    private PostPresentationMergeRequest createPostPresentationMergeRequest() {
        PostPresentationMergeRequest request = new PostPresentationMergeRequest();
        request.setName((String)getTestValue("String", "postPresentationMerge", "name"));
        request.setRequest((PresentationsMergeRequest)getTestValue("PresentationsMergeRequest", "postPresentationMerge", "request"));
        request.setPassword((String)getTestValue("String", "postPresentationMerge", "password"));
        request.setStorage((String)getTestValue("String", "postPresentationMerge", "storage"));
        request.setFolder((String)getTestValue("String", "postPresentationMerge", "folder"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsTest() throws ApiException, Exception {
        initialize("postShapeSaveAs", null, null);
        File response = null;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        response = api.postShapeSaveAs(request);
        assertTrue(response.isFile());
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postShapeSaveAs", "name"));
            initialize("postShapeSaveAs", "name", request.getName());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postShapeSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postShapeSaveAs", "slideIndex"));
            initialize("postShapeSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postShapeSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "postShapeSaveAs", "path"));
            initialize("postShapeSaveAs", "path", request.getPath());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postShapeSaveAs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "postShapeSaveAs", "shapeIndex"));
            initialize("postShapeSaveAs", "shapeIndex", request.getShapeIndex());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postShapeSaveAs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setFormat((ShapeExportFormat2)invalidizeTestValue("ShapeExportFormat2", request.getFormat(), "postShapeSaveAs", "format"));
            initialize("postShapeSaveAs", "format", request.getFormat());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postShapeSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setOptions((IShapeExportOptions)invalidizeTestValue("IShapeExportOptions", request.getOptions(), "postShapeSaveAs", "options"));
            initialize("postShapeSaveAs", "options", request.getOptions());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postShapeSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postShapeSaveAs", "password"));
            initialize("postShapeSaveAs", "password", request.getPassword());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postShapeSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postShapeSaveAs", "folder"));
            initialize("postShapeSaveAs", "folder", request.getFolder());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postShapeSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postShapeSaveAs", "storage"));
            initialize("postShapeSaveAs", "storage", request.getStorage());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postShapeSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setScaleX((Double)invalidizeTestValue("Double", request.getScaleX(), "postShapeSaveAs", "scaleX"));
            initialize("postShapeSaveAs", "scaleX", request.getScaleX());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "postShapeSaveAs", request.getScaleX());
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setScaleY((Double)invalidizeTestValue("Double", request.getScaleY(), "postShapeSaveAs", "scaleY"));
            initialize("postShapeSaveAs", "scaleY", request.getScaleY());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "postShapeSaveAs", request.getScaleY());
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setBounds((ShapeThumbnailBounds2)invalidizeTestValue("ShapeThumbnailBounds2", request.getBounds(), "postShapeSaveAs", "bounds"));
            initialize("postShapeSaveAs", "bounds", request.getBounds());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "postShapeSaveAs", request.getBounds());
        }
        if (needAssertResponse) {
            assertResponse("bounds", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postShapeSaveAs", "fontsFolder"));
            initialize("postShapeSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postShapeSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postShapeSaveAs");
        }
    }

    private PostShapeSaveAsRequest createPostShapeSaveAsRequest() {
        PostShapeSaveAsRequest request = new PostShapeSaveAsRequest();
        request.setName((String)getTestValue("String", "postShapeSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postShapeSaveAs", "slideIndex"));
        request.setPath((String)getTestValue("String", "postShapeSaveAs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "postShapeSaveAs", "shapeIndex"));
        request.setFormat((ShapeExportFormat2)getTestValue("ShapeExportFormat2", "postShapeSaveAs", "format"));
        request.setOptions((IShapeExportOptions)getTestValue("IShapeExportOptions", "postShapeSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "postShapeSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "postShapeSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "postShapeSaveAs", "storage"));
        request.setScaleX((Double)getTestValue("Double", "postShapeSaveAs", "scaleX"));
        request.setScaleY((Double)getTestValue("Double", "postShapeSaveAs", "scaleY"));
        request.setBounds((ShapeThumbnailBounds2)getTestValue("ShapeThumbnailBounds2", "postShapeSaveAs", "bounds"));
        request.setFontsFolder((String)getTestValue("String", "postShapeSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectTest() throws ApiException, Exception {
        initialize("postSlideAnimationEffect", null, null);
        SlideAnimation response = null;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        response = api.postSlideAnimationEffect(request);
        assertNotNull(response);
    }

    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlideAnimationEffect", "name"));
            initialize("postSlideAnimationEffect", "name", request.getName());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlideAnimationEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlideAnimationEffect");
        }
    }
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlideAnimationEffect", "slideIndex"));
            initialize("postSlideAnimationEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlideAnimationEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlideAnimationEffect");
        }
    }
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidEffectTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setEffect((Effect)invalidizeTestValue("Effect", request.getEffect(), "postSlideAnimationEffect", "effect"));
            initialize("postSlideAnimationEffect", "effect", request.getEffect());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effect", "postSlideAnimationEffect", request.getEffect());
        }
        if (needAssertResponse) {
            assertResponse("effect", "postSlideAnimationEffect");
        }
    }
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlideAnimationEffect", "password"));
            initialize("postSlideAnimationEffect", "password", request.getPassword());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlideAnimationEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlideAnimationEffect");
        }
    }
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlideAnimationEffect", "folder"));
            initialize("postSlideAnimationEffect", "folder", request.getFolder());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlideAnimationEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlideAnimationEffect");
        }
    }
    /**
     * Add an effect to slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationEffectRequest request = createPostSlideAnimationEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlideAnimationEffect", "storage"));
            initialize("postSlideAnimationEffect", "storage", request.getStorage());
            SlideAnimation response = api.postSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlideAnimationEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlideAnimationEffect");
        }
    }

    private PostSlideAnimationEffectRequest createPostSlideAnimationEffectRequest() {
        PostSlideAnimationEffectRequest request = new PostSlideAnimationEffectRequest();
        request.setName((String)getTestValue("String", "postSlideAnimationEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlideAnimationEffect", "slideIndex"));
        request.setEffect((Effect)getTestValue("Effect", "postSlideAnimationEffect", "effect"));
        request.setPassword((String)getTestValue("String", "postSlideAnimationEffect", "password"));
        request.setFolder((String)getTestValue("String", "postSlideAnimationEffect", "folder"));
        request.setStorage((String)getTestValue("String", "postSlideAnimationEffect", "storage"));
        return request;
    }
    
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceTest() throws ApiException, Exception {
        initialize("postSlideAnimationInteractiveSequence", null, null);
        SlideAnimation response = null;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        response = api.postSlideAnimationInteractiveSequence(request);
        assertNotNull(response);
    }

    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlideAnimationInteractiveSequence", "name"));
            initialize("postSlideAnimationInteractiveSequence", "name", request.getName());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlideAnimationInteractiveSequence", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlideAnimationInteractiveSequence", "slideIndex"));
            initialize("postSlideAnimationInteractiveSequence", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlideAnimationInteractiveSequence", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidSequenceTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setSequence((InteractiveSequence)invalidizeTestValue("InteractiveSequence", request.getSequence(), "postSlideAnimationInteractiveSequence", "sequence"));
            initialize("postSlideAnimationInteractiveSequence", "sequence", request.getSequence());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sequence", "postSlideAnimationInteractiveSequence", request.getSequence());
        }
        if (needAssertResponse) {
            assertResponse("sequence", "postSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlideAnimationInteractiveSequence", "password"));
            initialize("postSlideAnimationInteractiveSequence", "password", request.getPassword());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlideAnimationInteractiveSequence", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlideAnimationInteractiveSequence", "folder"));
            initialize("postSlideAnimationInteractiveSequence", "folder", request.getFolder());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlideAnimationInteractiveSequence", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlideAnimationInteractiveSequence");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceRequest request = createPostSlideAnimationInteractiveSequenceRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlideAnimationInteractiveSequence", "storage"));
            initialize("postSlideAnimationInteractiveSequence", "storage", request.getStorage());
            SlideAnimation response = api.postSlideAnimationInteractiveSequence(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlideAnimationInteractiveSequence", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlideAnimationInteractiveSequence");
        }
    }

    private PostSlideAnimationInteractiveSequenceRequest createPostSlideAnimationInteractiveSequenceRequest() {
        PostSlideAnimationInteractiveSequenceRequest request = new PostSlideAnimationInteractiveSequenceRequest();
        request.setName((String)getTestValue("String", "postSlideAnimationInteractiveSequence", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlideAnimationInteractiveSequence", "slideIndex"));
        request.setSequence((InteractiveSequence)getTestValue("InteractiveSequence", "postSlideAnimationInteractiveSequence", "sequence"));
        request.setPassword((String)getTestValue("String", "postSlideAnimationInteractiveSequence", "password"));
        request.setFolder((String)getTestValue("String", "postSlideAnimationInteractiveSequence", "folder"));
        request.setStorage((String)getTestValue("String", "postSlideAnimationInteractiveSequence", "storage"));
        return request;
    }
    
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectTest() throws ApiException, Exception {
        initialize("postSlideAnimationInteractiveSequenceEffect", null, null);
        SlideAnimation response = null;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        response = api.postSlideAnimationInteractiveSequenceEffect(request);
        assertNotNull(response);
    }

    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlideAnimationInteractiveSequenceEffect", "name"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "name", request.getName());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlideAnimationInteractiveSequenceEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlideAnimationInteractiveSequenceEffect", "slideIndex"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlideAnimationInteractiveSequenceEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidSequenceIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSequenceIndex((Integer)invalidizeTestValue("Integer", request.getSequenceIndex(), "postSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "sequenceIndex", request.getSequenceIndex());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sequenceIndex", "postSlideAnimationInteractiveSequenceEffect", request.getSequenceIndex());
        }
        if (needAssertResponse) {
            assertResponse("sequenceIndex", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidEffectTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setEffect((Effect)invalidizeTestValue("Effect", request.getEffect(), "postSlideAnimationInteractiveSequenceEffect", "effect"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "effect", request.getEffect());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effect", "postSlideAnimationInteractiveSequenceEffect", request.getEffect());
        }
        if (needAssertResponse) {
            assertResponse("effect", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlideAnimationInteractiveSequenceEffect", "password"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "password", request.getPassword());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlideAnimationInteractiveSequenceEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlideAnimationInteractiveSequenceEffect", "folder"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "folder", request.getFolder());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlideAnimationInteractiveSequenceEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Add an animation effect to a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideAnimationInteractiveSequenceEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideAnimationInteractiveSequenceEffectRequest request = createPostSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlideAnimationInteractiveSequenceEffect", "storage"));
            initialize("postSlideAnimationInteractiveSequenceEffect", "storage", request.getStorage());
            SlideAnimation response = api.postSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlideAnimationInteractiveSequenceEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlideAnimationInteractiveSequenceEffect");
        }
    }

    private PostSlideAnimationInteractiveSequenceEffectRequest createPostSlideAnimationInteractiveSequenceEffectRequest() {
        PostSlideAnimationInteractiveSequenceEffectRequest request = new PostSlideAnimationInteractiveSequenceEffectRequest();
        request.setName((String)getTestValue("String", "postSlideAnimationInteractiveSequenceEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlideAnimationInteractiveSequenceEffect", "slideIndex"));
        request.setSequenceIndex((Integer)getTestValue("Integer", "postSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
        request.setEffect((Effect)getTestValue("Effect", "postSlideAnimationInteractiveSequenceEffect", "effect"));
        request.setPassword((String)getTestValue("String", "postSlideAnimationInteractiveSequenceEffect", "password"));
        request.setFolder((String)getTestValue("String", "postSlideAnimationInteractiveSequenceEffect", "folder"));
        request.setStorage((String)getTestValue("String", "postSlideAnimationInteractiveSequenceEffect", "storage"));
        return request;
    }
    
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsTest() throws ApiException, Exception {
        initialize("postSlideSaveAs", null, null);
        File response = null;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        response = api.postSlideSaveAs(request);
        assertTrue(response.isFile());
    }

    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlideSaveAs", "name"));
            initialize("postSlideSaveAs", "name", request.getName());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlideSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlideSaveAs", "slideIndex"));
            initialize("postSlideSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlideSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setFormat((SlideExportFormat)invalidizeTestValue("SlideExportFormat", request.getFormat(), "postSlideSaveAs", "format"));
            initialize("postSlideSaveAs", "format", request.getFormat());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlideSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setOptions((ExportOptions)invalidizeTestValue("ExportOptions", request.getOptions(), "postSlideSaveAs", "options"));
            initialize("postSlideSaveAs", "options", request.getOptions());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlideSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setWidth((Integer)invalidizeTestValue("Integer", request.getWidth(), "postSlideSaveAs", "width"));
            initialize("postSlideSaveAs", "width", request.getWidth());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "postSlideSaveAs", request.getWidth());
        }
        if (needAssertResponse) {
            assertResponse("width", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setHeight((Integer)invalidizeTestValue("Integer", request.getHeight(), "postSlideSaveAs", "height"));
            initialize("postSlideSaveAs", "height", request.getHeight());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "postSlideSaveAs", request.getHeight());
        }
        if (needAssertResponse) {
            assertResponse("height", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlideSaveAs", "password"));
            initialize("postSlideSaveAs", "password", request.getPassword());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlideSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlideSaveAs", "folder"));
            initialize("postSlideSaveAs", "folder", request.getFolder());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlideSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlideSaveAs", "storage"));
            initialize("postSlideSaveAs", "storage", request.getStorage());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlideSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postSlideSaveAs", "fontsFolder"));
            initialize("postSlideSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlideSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlideSaveAs");
        }
    }

    private PostSlideSaveAsRequest createPostSlideSaveAsRequest() {
        PostSlideSaveAsRequest request = new PostSlideSaveAsRequest();
        request.setName((String)getTestValue("String", "postSlideSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlideSaveAs", "slideIndex"));
        request.setFormat((SlideExportFormat)getTestValue("SlideExportFormat", "postSlideSaveAs", "format"));
        request.setOptions((ExportOptions)getTestValue("ExportOptions", "postSlideSaveAs", "options"));
        request.setWidth((Integer)getTestValue("Integer", "postSlideSaveAs", "width"));
        request.setHeight((Integer)getTestValue("Integer", "postSlideSaveAs", "height"));
        request.setPassword((String)getTestValue("String", "postSlideSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "postSlideSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "postSlideSaveAs", "storage"));
        request.setFontsFolder((String)getTestValue("String", "postSlideSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddTest() throws ApiException, Exception {
        initialize("postSlidesAdd", null, null);
        Slides response = null;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        response = api.postSlidesAdd(request);
        assertNotNull(response);
    }

    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesAdd", "name"));
            initialize("postSlidesAdd", "name", request.getName());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesAdd", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postSlidesAdd", "position"));
            initialize("postSlidesAdd", "position", request.getPosition());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postSlidesAdd", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesAdd", "password"));
            initialize("postSlidesAdd", "password", request.getPassword());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesAdd", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesAdd", "folder"));
            initialize("postSlidesAdd", "folder", request.getFolder());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesAdd", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesAdd", "storage"));
            initialize("postSlidesAdd", "storage", request.getStorage());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesAdd", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidLayoutAliasTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesAddRequest request = createPostSlidesAddRequest();
        try {
            request.setLayoutAlias((String)invalidizeTestValue("String", request.getLayoutAlias(), "postSlidesAdd", "layoutAlias"));
            initialize("postSlidesAdd", "layoutAlias", request.getLayoutAlias());
            Slides response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "layoutAlias", "postSlidesAdd", request.getLayoutAlias());
        }
        if (needAssertResponse) {
            assertResponse("layoutAlias", "postSlidesAdd");
        }
    }

    private PostSlidesAddRequest createPostSlidesAddRequest() {
        PostSlidesAddRequest request = new PostSlidesAddRequest();
        request.setName((String)getTestValue("String", "postSlidesAdd", "name"));
        request.setPosition((Integer)getTestValue("Integer", "postSlidesAdd", "position"));
        request.setPassword((String)getTestValue("String", "postSlidesAdd", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesAdd", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesAdd", "storage"));
        request.setLayoutAlias((String)getTestValue("String", "postSlidesAdd", "layoutAlias"));
        return request;
    }
    
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesConvertTest() throws ApiException, Exception {
        initialize("postSlidesConvert", null, null);
        File response = null;
        PostSlidesConvertRequest request = createPostSlidesConvertRequest();
        response = api.postSlidesConvert(request);
        assertTrue(response.isFile());
    }

    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesConvertInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesConvertRequest request = createPostSlidesConvertRequest();
        try {
            request.setFormat((ExportFormat)invalidizeTestValue("ExportFormat", request.getFormat(), "postSlidesConvert", "format"));
            initialize("postSlidesConvert", "format", request.getFormat());
            File response = api.postSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlidesConvert", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesConvertInvalidDocumentTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesConvertRequest request = createPostSlidesConvertRequest();
        try {
            request.setDocument((byte[])invalidizeTestValue("byte[]", request.getDocument(), "postSlidesConvert", "document"));
            initialize("postSlidesConvert", "document", request.getDocument());
            File response = api.postSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "document", "postSlidesConvert", request.getDocument());
        }
        if (needAssertResponse) {
            assertResponse("document", "postSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesConvertInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesConvertRequest request = createPostSlidesConvertRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesConvert", "password"));
            initialize("postSlidesConvert", "password", request.getPassword());
            File response = api.postSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesConvert", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesConvertInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesConvertRequest request = createPostSlidesConvertRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postSlidesConvert", "fontsFolder"));
            initialize("postSlidesConvert", "fontsFolder", request.getFontsFolder());
            File response = api.postSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlidesConvert", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlidesConvert");
        }
    }

    private PostSlidesConvertRequest createPostSlidesConvertRequest() {
        PostSlidesConvertRequest request = new PostSlidesConvertRequest();
        request.setFormat((ExportFormat)getTestValue("ExportFormat", "postSlidesConvert", "format"));
        request.setDocument((byte[])getTestValue("byte[]", "postSlidesConvert", "document"));
        request.setPassword((String)getTestValue("String", "postSlidesConvert", "password"));
        request.setFontsFolder((String)getTestValue("String", "postSlidesConvert", "fontsFolder"));
        return request;
    }
    
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyTest() throws ApiException, Exception {
        initialize("postSlidesCopy", null, null);
        Slides response = null;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        response = api.postSlidesCopy(request);
        assertNotNull(response);
    }

    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesCopy", "name"));
            initialize("postSlidesCopy", "name", request.getName());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesCopy", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSlideToCopyTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setSlideToCopy((Integer)invalidizeTestValue("Integer", request.getSlideToCopy(), "postSlidesCopy", "slideToCopy"));
            initialize("postSlidesCopy", "slideToCopy", request.getSlideToCopy());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideToCopy", "postSlidesCopy", request.getSlideToCopy());
        }
        if (needAssertResponse) {
            assertResponse("slideToCopy", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setPosition((Integer)invalidizeTestValue("Integer", request.getPosition(), "postSlidesCopy", "position"));
            initialize("postSlidesCopy", "position", request.getPosition());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postSlidesCopy", request.getPosition());
        }
        if (needAssertResponse) {
            assertResponse("position", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSourceTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setSource((String)invalidizeTestValue("String", request.getSource(), "postSlidesCopy", "source"));
            initialize("postSlidesCopy", "source", request.getSource());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "source", "postSlidesCopy", request.getSource());
        }
        if (needAssertResponse) {
            assertResponse("source", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSourcePasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setSourcePassword((String)invalidizeTestValue("String", request.getSourcePassword(), "postSlidesCopy", "sourcePassword"));
            initialize("postSlidesCopy", "sourcePassword", request.getSourcePassword());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourcePassword", "postSlidesCopy", request.getSourcePassword());
        }
        if (needAssertResponse) {
            assertResponse("sourcePassword", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSourceStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setSourceStorage((String)invalidizeTestValue("String", request.getSourceStorage(), "postSlidesCopy", "sourceStorage"));
            initialize("postSlidesCopy", "sourceStorage", request.getSourceStorage());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourceStorage", "postSlidesCopy", request.getSourceStorage());
        }
        if (needAssertResponse) {
            assertResponse("sourceStorage", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesCopy", "password"));
            initialize("postSlidesCopy", "password", request.getPassword());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesCopy", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesCopy", "folder"));
            initialize("postSlidesCopy", "folder", request.getFolder());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesCopy", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesCopyRequest request = createPostSlidesCopyRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesCopy", "storage"));
            initialize("postSlidesCopy", "storage", request.getStorage());
            Slides response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesCopy", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesCopy");
        }
    }

    private PostSlidesCopyRequest createPostSlidesCopyRequest() {
        PostSlidesCopyRequest request = new PostSlidesCopyRequest();
        request.setName((String)getTestValue("String", "postSlidesCopy", "name"));
        request.setSlideToCopy((Integer)getTestValue("Integer", "postSlidesCopy", "slideToCopy"));
        request.setPosition((Integer)getTestValue("Integer", "postSlidesCopy", "position"));
        request.setSource((String)getTestValue("String", "postSlidesCopy", "source"));
        request.setSourcePassword((String)getTestValue("String", "postSlidesCopy", "sourcePassword"));
        request.setSourceStorage((String)getTestValue("String", "postSlidesCopy", "sourceStorage"));
        request.setPassword((String)getTestValue("String", "postSlidesCopy", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesCopy", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesCopy", "storage"));
        return request;
    }
    
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentTest() throws ApiException, Exception {
        initialize("postSlidesDocument", null, null);
        Document response = null;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        response = api.postSlidesDocument(request);
        assertNotNull(response);
    }

    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesDocument", "name"));
            initialize("postSlidesDocument", "name", request.getName());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesDocument", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesDocument");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidDataTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setData((byte[])invalidizeTestValue("byte[]", request.getData(), "postSlidesDocument", "data"));
            initialize("postSlidesDocument", "data", request.getData());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "data", "postSlidesDocument", request.getData());
        }
        if (needAssertResponse) {
            assertResponse("data", "postSlidesDocument");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidInputPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setInputPassword((String)invalidizeTestValue("String", request.getInputPassword(), "postSlidesDocument", "inputPassword"));
            initialize("postSlidesDocument", "inputPassword", request.getInputPassword());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "inputPassword", "postSlidesDocument", request.getInputPassword());
        }
        if (needAssertResponse) {
            assertResponse("inputPassword", "postSlidesDocument");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesDocument", "password"));
            initialize("postSlidesDocument", "password", request.getPassword());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesDocument", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesDocument");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesDocument", "storage"));
            initialize("postSlidesDocument", "storage", request.getStorage());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesDocument", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesDocument");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesDocument", "folder"));
            initialize("postSlidesDocument", "folder", request.getFolder());
            Document response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesDocument", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesDocument");
        }
    }

    private PostSlidesDocumentRequest createPostSlidesDocumentRequest() {
        PostSlidesDocumentRequest request = new PostSlidesDocumentRequest();
        request.setName((String)getTestValue("String", "postSlidesDocument", "name"));
        request.setData((byte[])getTestValue("byte[]", "postSlidesDocument", "data"));
        request.setInputPassword((String)getTestValue("String", "postSlidesDocument", "inputPassword"));
        request.setPassword((String)getTestValue("String", "postSlidesDocument", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesDocument", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesDocument", "folder"));
        return request;
    }
    
    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlTest() throws ApiException, Exception {
        initialize("postSlidesDocumentFromHtml", null, null);
        Document response = null;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        response = api.postSlidesDocumentFromHtml(request);
        assertNotNull(response);
    }

    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesDocumentFromHtml", "name"));
            initialize("postSlidesDocumentFromHtml", "name", request.getName());
            Document response = api.postSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesDocumentFromHtml", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlInvalidHtmlTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        try {
            request.setHtml((String)invalidizeTestValue("String", request.getHtml(), "postSlidesDocumentFromHtml", "html"));
            initialize("postSlidesDocumentFromHtml", "html", request.getHtml());
            Document response = api.postSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "html", "postSlidesDocumentFromHtml", request.getHtml());
        }
        if (needAssertResponse) {
            assertResponse("html", "postSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesDocumentFromHtml", "password"));
            initialize("postSlidesDocumentFromHtml", "password", request.getPassword());
            Document response = api.postSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesDocumentFromHtml", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesDocumentFromHtml", "storage"));
            initialize("postSlidesDocumentFromHtml", "storage", request.getStorage());
            Document response = api.postSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesDocumentFromHtml", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromHtmlInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromHtmlRequest request = createPostSlidesDocumentFromHtmlRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesDocumentFromHtml", "folder"));
            initialize("postSlidesDocumentFromHtml", "folder", request.getFolder());
            Document response = api.postSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesDocumentFromHtml", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesDocumentFromHtml");
        }
    }

    private PostSlidesDocumentFromHtmlRequest createPostSlidesDocumentFromHtmlRequest() {
        PostSlidesDocumentFromHtmlRequest request = new PostSlidesDocumentFromHtmlRequest();
        request.setName((String)getTestValue("String", "postSlidesDocumentFromHtml", "name"));
        request.setHtml((String)getTestValue("String", "postSlidesDocumentFromHtml", "html"));
        request.setPassword((String)getTestValue("String", "postSlidesDocumentFromHtml", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesDocumentFromHtml", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesDocumentFromHtml", "folder"));
        return request;
    }
    
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceTest() throws ApiException, Exception {
        initialize("postSlidesDocumentFromSource", null, null);
        Document response = null;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        response = api.postSlidesDocumentFromSource(request);
        assertNotNull(response);
    }

    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesDocumentFromSource", "name"));
            initialize("postSlidesDocumentFromSource", "name", request.getName());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesDocumentFromSource", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidSourcePathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setSourcePath((String)invalidizeTestValue("String", request.getSourcePath(), "postSlidesDocumentFromSource", "sourcePath"));
            initialize("postSlidesDocumentFromSource", "sourcePath", request.getSourcePath());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourcePath", "postSlidesDocumentFromSource", request.getSourcePath());
        }
        if (needAssertResponse) {
            assertResponse("sourcePath", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidSourcePasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setSourcePassword((String)invalidizeTestValue("String", request.getSourcePassword(), "postSlidesDocumentFromSource", "sourcePassword"));
            initialize("postSlidesDocumentFromSource", "sourcePassword", request.getSourcePassword());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourcePassword", "postSlidesDocumentFromSource", request.getSourcePassword());
        }
        if (needAssertResponse) {
            assertResponse("sourcePassword", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidSourceStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setSourceStorage((String)invalidizeTestValue("String", request.getSourceStorage(), "postSlidesDocumentFromSource", "sourceStorage"));
            initialize("postSlidesDocumentFromSource", "sourceStorage", request.getSourceStorage());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourceStorage", "postSlidesDocumentFromSource", request.getSourceStorage());
        }
        if (needAssertResponse) {
            assertResponse("sourceStorage", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesDocumentFromSource", "password"));
            initialize("postSlidesDocumentFromSource", "password", request.getPassword());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesDocumentFromSource", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesDocumentFromSource", "storage"));
            initialize("postSlidesDocumentFromSource", "storage", request.getStorage());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesDocumentFromSource", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesDocumentFromSource");
        }
    }
    /**
     * Create a presentation from an existing source.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromSourceInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromSourceRequest request = createPostSlidesDocumentFromSourceRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesDocumentFromSource", "folder"));
            initialize("postSlidesDocumentFromSource", "folder", request.getFolder());
            Document response = api.postSlidesDocumentFromSource(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesDocumentFromSource", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesDocumentFromSource");
        }
    }

    private PostSlidesDocumentFromSourceRequest createPostSlidesDocumentFromSourceRequest() {
        PostSlidesDocumentFromSourceRequest request = new PostSlidesDocumentFromSourceRequest();
        request.setName((String)getTestValue("String", "postSlidesDocumentFromSource", "name"));
        request.setSourcePath((String)getTestValue("String", "postSlidesDocumentFromSource", "sourcePath"));
        request.setSourcePassword((String)getTestValue("String", "postSlidesDocumentFromSource", "sourcePassword"));
        request.setSourceStorage((String)getTestValue("String", "postSlidesDocumentFromSource", "sourceStorage"));
        request.setPassword((String)getTestValue("String", "postSlidesDocumentFromSource", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesDocumentFromSource", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesDocumentFromSource", "folder"));
        return request;
    }
    
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateTest() throws ApiException, Exception {
        initialize("postSlidesDocumentFromTemplate", null, null);
        Document response = null;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        response = api.postSlidesDocumentFromTemplate(request);
        assertNotNull(response);
    }

    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesDocumentFromTemplate", "name"));
            initialize("postSlidesDocumentFromTemplate", "name", request.getName());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesDocumentFromTemplate", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidTemplatePathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setTemplatePath((String)invalidizeTestValue("String", request.getTemplatePath(), "postSlidesDocumentFromTemplate", "templatePath"));
            initialize("postSlidesDocumentFromTemplate", "templatePath", request.getTemplatePath());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templatePath", "postSlidesDocumentFromTemplate", request.getTemplatePath());
        }
        if (needAssertResponse) {
            assertResponse("templatePath", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidDataTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setData((String)invalidizeTestValue("String", request.getData(), "postSlidesDocumentFromTemplate", "data"));
            initialize("postSlidesDocumentFromTemplate", "data", request.getData());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "data", "postSlidesDocumentFromTemplate", request.getData());
        }
        if (needAssertResponse) {
            assertResponse("data", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidTemplatePasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setTemplatePassword((String)invalidizeTestValue("String", request.getTemplatePassword(), "postSlidesDocumentFromTemplate", "templatePassword"));
            initialize("postSlidesDocumentFromTemplate", "templatePassword", request.getTemplatePassword());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templatePassword", "postSlidesDocumentFromTemplate", request.getTemplatePassword());
        }
        if (needAssertResponse) {
            assertResponse("templatePassword", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidTemplateStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setTemplateStorage((String)invalidizeTestValue("String", request.getTemplateStorage(), "postSlidesDocumentFromTemplate", "templateStorage"));
            initialize("postSlidesDocumentFromTemplate", "templateStorage", request.getTemplateStorage());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templateStorage", "postSlidesDocumentFromTemplate", request.getTemplateStorage());
        }
        if (needAssertResponse) {
            assertResponse("templateStorage", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidIsImageDataEmbeddedTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setIsImageDataEmbedded((Boolean)invalidizeTestValue("Boolean", request.getIsImageDataEmbedded(), "postSlidesDocumentFromTemplate", "isImageDataEmbedded"));
            initialize("postSlidesDocumentFromTemplate", "isImageDataEmbedded", request.getIsImageDataEmbedded());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "isImageDataEmbedded", "postSlidesDocumentFromTemplate", request.getIsImageDataEmbedded());
        }
        if (needAssertResponse) {
            assertResponse("isImageDataEmbedded", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesDocumentFromTemplate", "password"));
            initialize("postSlidesDocumentFromTemplate", "password", request.getPassword());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesDocumentFromTemplate", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesDocumentFromTemplate", "storage"));
            initialize("postSlidesDocumentFromTemplate", "storage", request.getStorage());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesDocumentFromTemplate", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesDocumentFromTemplate");
        }
    }
    /**
     * Create a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentFromTemplateInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesDocumentFromTemplateRequest request = createPostSlidesDocumentFromTemplateRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesDocumentFromTemplate", "folder"));
            initialize("postSlidesDocumentFromTemplate", "folder", request.getFolder());
            Document response = api.postSlidesDocumentFromTemplate(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesDocumentFromTemplate", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesDocumentFromTemplate");
        }
    }

    private PostSlidesDocumentFromTemplateRequest createPostSlidesDocumentFromTemplateRequest() {
        PostSlidesDocumentFromTemplateRequest request = new PostSlidesDocumentFromTemplateRequest();
        request.setName((String)getTestValue("String", "postSlidesDocumentFromTemplate", "name"));
        request.setTemplatePath((String)getTestValue("String", "postSlidesDocumentFromTemplate", "templatePath"));
        request.setData((String)getTestValue("String", "postSlidesDocumentFromTemplate", "data"));
        request.setTemplatePassword((String)getTestValue("String", "postSlidesDocumentFromTemplate", "templatePassword"));
        request.setTemplateStorage((String)getTestValue("String", "postSlidesDocumentFromTemplate", "templateStorage"));
        request.setIsImageDataEmbedded((Boolean)getTestValue("Boolean", "postSlidesDocumentFromTemplate", "isImageDataEmbedded"));
        request.setPassword((String)getTestValue("String", "postSlidesDocumentFromTemplate", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesDocumentFromTemplate", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesDocumentFromTemplate", "folder"));
        return request;
    }
    
    /**
     * Performs slides pipeline.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineTest() throws ApiException, Exception {
        initialize("postSlidesPipeline", null, null);
        File response = null;
        PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
        response = api.postSlidesPipeline(request);
        assertTrue(response.isFile());
    }

    /**
     * Performs slides pipeline.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineInvalidPipelineTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
        try {
            request.setPipeline((Pipeline)invalidizeTestValue("Pipeline", request.getPipeline(), "postSlidesPipeline", "pipeline"));
            initialize("postSlidesPipeline", "pipeline", request.getPipeline());
            File response = api.postSlidesPipeline(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "pipeline", "postSlidesPipeline", request.getPipeline());
        }
        if (needAssertResponse) {
            assertResponse("pipeline", "postSlidesPipeline");
        }
    }
    /**
     * Performs slides pipeline.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineInvalidFilesTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
        try {
            request.setFiles((List<FileInfo>)invalidizeTestValue("List<FileInfo>", request.getFiles(), "postSlidesPipeline", "files"));
            initialize("postSlidesPipeline", "files", request.getFiles());
            File response = api.postSlidesPipeline(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "files", "postSlidesPipeline", request.getFiles());
        }
        if (needAssertResponse) {
            assertResponse("files", "postSlidesPipeline");
        }
    }

    private PostSlidesPipelineRequest createPostSlidesPipelineRequest() {
        PostSlidesPipelineRequest request = new PostSlidesPipelineRequest();
        request.setPipeline((Pipeline)getTestValue("Pipeline", "postSlidesPipeline", "pipeline"));
        request.setFiles((List<FileInfo>)getTestValue("List<FileInfo>", "postSlidesPipeline", "files"));
        return request;
    }
    
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextTest() throws ApiException, Exception {
        initialize("postSlidesPresentationReplaceText", null, null);
        DocumentReplaceResult response = null;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        response = api.postSlidesPresentationReplaceText(request);
        assertNotNull(response);
    }

    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesPresentationReplaceText", "name"));
            initialize("postSlidesPresentationReplaceText", "name", request.getName());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesPresentationReplaceText", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidOldValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setOldValue((String)invalidizeTestValue("String", request.getOldValue(), "postSlidesPresentationReplaceText", "oldValue"));
            initialize("postSlidesPresentationReplaceText", "oldValue", request.getOldValue());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldValue", "postSlidesPresentationReplaceText", request.getOldValue());
        }
        if (needAssertResponse) {
            assertResponse("oldValue", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidNewValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setNewValue((String)invalidizeTestValue("String", request.getNewValue(), "postSlidesPresentationReplaceText", "newValue"));
            initialize("postSlidesPresentationReplaceText", "newValue", request.getNewValue());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newValue", "postSlidesPresentationReplaceText", request.getNewValue());
        }
        if (needAssertResponse) {
            assertResponse("newValue", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidIgnoreCaseTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setIgnoreCase((Boolean)invalidizeTestValue("Boolean", request.getIgnoreCase(), "postSlidesPresentationReplaceText", "ignoreCase"));
            initialize("postSlidesPresentationReplaceText", "ignoreCase", request.getIgnoreCase());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "ignoreCase", "postSlidesPresentationReplaceText", request.getIgnoreCase());
        }
        if (needAssertResponse) {
            assertResponse("ignoreCase", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesPresentationReplaceText", "password"));
            initialize("postSlidesPresentationReplaceText", "password", request.getPassword());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesPresentationReplaceText", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesPresentationReplaceText", "folder"));
            initialize("postSlidesPresentationReplaceText", "folder", request.getFolder());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesPresentationReplaceText", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesPresentationReplaceText", "storage"));
            initialize("postSlidesPresentationReplaceText", "storage", request.getStorage());
            DocumentReplaceResult response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesPresentationReplaceText", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesPresentationReplaceText");
        }
    }

    private PostSlidesPresentationReplaceTextRequest createPostSlidesPresentationReplaceTextRequest() {
        PostSlidesPresentationReplaceTextRequest request = new PostSlidesPresentationReplaceTextRequest();
        request.setName((String)getTestValue("String", "postSlidesPresentationReplaceText", "name"));
        request.setOldValue((String)getTestValue("String", "postSlidesPresentationReplaceText", "oldValue"));
        request.setNewValue((String)getTestValue("String", "postSlidesPresentationReplaceText", "newValue"));
        request.setIgnoreCase((Boolean)getTestValue("Boolean", "postSlidesPresentationReplaceText", "ignoreCase"));
        request.setPassword((String)getTestValue("String", "postSlidesPresentationReplaceText", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesPresentationReplaceText", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesPresentationReplaceText", "storage"));
        return request;
    }
    
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderTest() throws ApiException, Exception {
        initialize("postSlidesReorder", null, null);
        Slides response = null;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        response = api.postSlidesReorder(request);
        assertNotNull(response);
    }

    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesReorder", "name"));
            initialize("postSlidesReorder", "name", request.getName());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesReorder", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlidesReorder", "slideIndex"));
            initialize("postSlidesReorder", "slideIndex", request.getSlideIndex());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlidesReorder", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidNewPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setNewPosition((Integer)invalidizeTestValue("Integer", request.getNewPosition(), "postSlidesReorder", "newPosition"));
            initialize("postSlidesReorder", "newPosition", request.getNewPosition());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPosition", "postSlidesReorder", request.getNewPosition());
        }
        if (needAssertResponse) {
            assertResponse("newPosition", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesReorder", "password"));
            initialize("postSlidesReorder", "password", request.getPassword());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesReorder", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesReorder", "folder"));
            initialize("postSlidesReorder", "folder", request.getFolder());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesReorder", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderRequest request = createPostSlidesReorderRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesReorder", "storage"));
            initialize("postSlidesReorder", "storage", request.getStorage());
            Slides response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesReorder", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesReorder");
        }
    }

    private PostSlidesReorderRequest createPostSlidesReorderRequest() {
        PostSlidesReorderRequest request = new PostSlidesReorderRequest();
        request.setName((String)getTestValue("String", "postSlidesReorder", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlidesReorder", "slideIndex"));
        request.setNewPosition((Integer)getTestValue("Integer", "postSlidesReorder", "newPosition"));
        request.setPassword((String)getTestValue("String", "postSlidesReorder", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesReorder", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesReorder", "storage"));
        return request;
    }
    
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyTest() throws ApiException, Exception {
        initialize("postSlidesReorderMany", null, null);
        Slides response = null;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        response = api.postSlidesReorderMany(request);
        assertNotNull(response);
    }

    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesReorderMany", "name"));
            initialize("postSlidesReorderMany", "name", request.getName());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesReorderMany", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidOldPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setOldPositions((List<Integer>)invalidizeTestValue("List<Integer>", request.getOldPositions(), "postSlidesReorderMany", "oldPositions"));
            initialize("postSlidesReorderMany", "oldPositions", request.getOldPositions());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldPositions", "postSlidesReorderMany", request.getOldPositions());
        }
        if (needAssertResponse) {
            assertResponse("oldPositions", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidNewPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setNewPositions((List<Integer>)invalidizeTestValue("List<Integer>", request.getNewPositions(), "postSlidesReorderMany", "newPositions"));
            initialize("postSlidesReorderMany", "newPositions", request.getNewPositions());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPositions", "postSlidesReorderMany", request.getNewPositions());
        }
        if (needAssertResponse) {
            assertResponse("newPositions", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesReorderMany", "password"));
            initialize("postSlidesReorderMany", "password", request.getPassword());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesReorderMany", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesReorderMany", "folder"));
            initialize("postSlidesReorderMany", "folder", request.getFolder());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesReorderMany", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesReorderMany", "storage"));
            initialize("postSlidesReorderMany", "storage", request.getStorage());
            Slides response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesReorderMany", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesReorderMany");
        }
    }

    private PostSlidesReorderManyRequest createPostSlidesReorderManyRequest() {
        PostSlidesReorderManyRequest request = new PostSlidesReorderManyRequest();
        request.setName((String)getTestValue("String", "postSlidesReorderMany", "name"));
        request.setOldPositions((List<Integer>)getTestValue("List<Integer>", "postSlidesReorderMany", "oldPositions"));
        request.setNewPositions((List<Integer>)getTestValue("List<Integer>", "postSlidesReorderMany", "newPositions"));
        request.setPassword((String)getTestValue("String", "postSlidesReorderMany", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesReorderMany", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesReorderMany", "storage"));
        return request;
    }
    
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsTest() throws ApiException, Exception {
        initialize("postSlidesSaveAs", null, null);
        File response = null;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        response = api.postSlidesSaveAs(request);
        assertTrue(response.isFile());
    }

    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesSaveAs", "name"));
            initialize("postSlidesSaveAs", "name", request.getName());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setFormat((ExportFormat)invalidizeTestValue("ExportFormat", request.getFormat(), "postSlidesSaveAs", "format"));
            initialize("postSlidesSaveAs", "format", request.getFormat());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlidesSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setOptions((ExportOptions)invalidizeTestValue("ExportOptions", request.getOptions(), "postSlidesSaveAs", "options"));
            initialize("postSlidesSaveAs", "options", request.getOptions());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlidesSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesSaveAs", "password"));
            initialize("postSlidesSaveAs", "password", request.getPassword());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesSaveAs", "storage"));
            initialize("postSlidesSaveAs", "storage", request.getStorage());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesSaveAs", "folder"));
            initialize("postSlidesSaveAs", "folder", request.getFolder());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postSlidesSaveAs", "fontsFolder"));
            initialize("postSlidesSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlidesSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlidesSaveAs");
        }
    }

    private PostSlidesSaveAsRequest createPostSlidesSaveAsRequest() {
        PostSlidesSaveAsRequest request = new PostSlidesSaveAsRequest();
        request.setName((String)getTestValue("String", "postSlidesSaveAs", "name"));
        request.setFormat((ExportFormat)getTestValue("ExportFormat", "postSlidesSaveAs", "format"));
        request.setOptions((ExportOptions)getTestValue("ExportOptions", "postSlidesSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "postSlidesSaveAs", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesSaveAs", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesSaveAs", "folder"));
        request.setFontsFolder((String)getTestValue("String", "postSlidesSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesTest() throws ApiException, Exception {
        initialize("postSlidesSetDocumentProperties", null, null);
        DocumentProperties response = null;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        response = api.postSlidesSetDocumentProperties(request);
        assertNotNull(response);
    }

    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesSetDocumentProperties", "name"));
            initialize("postSlidesSetDocumentProperties", "name", request.getName());
            DocumentProperties response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSetDocumentProperties", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidPropertiesTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        try {
            request.setProperties((DocumentProperties)invalidizeTestValue("DocumentProperties", request.getProperties(), "postSlidesSetDocumentProperties", "properties"));
            initialize("postSlidesSetDocumentProperties", "properties", request.getProperties());
            DocumentProperties response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "properties", "postSlidesSetDocumentProperties", request.getProperties());
        }
        if (needAssertResponse) {
            assertResponse("properties", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesSetDocumentProperties", "password"));
            initialize("postSlidesSetDocumentProperties", "password", request.getPassword());
            DocumentProperties response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSetDocumentProperties", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesSetDocumentProperties", "folder"));
            initialize("postSlidesSetDocumentProperties", "folder", request.getFolder());
            DocumentProperties response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSetDocumentProperties", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesSetDocumentProperties", "storage"));
            initialize("postSlidesSetDocumentProperties", "storage", request.getStorage());
            DocumentProperties response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSetDocumentProperties", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSetDocumentProperties");
        }
    }

    private PostSlidesSetDocumentPropertiesRequest createPostSlidesSetDocumentPropertiesRequest() {
        PostSlidesSetDocumentPropertiesRequest request = new PostSlidesSetDocumentPropertiesRequest();
        request.setName((String)getTestValue("String", "postSlidesSetDocumentProperties", "name"));
        request.setProperties((DocumentProperties)getTestValue("DocumentProperties", "postSlidesSetDocumentProperties", "properties"));
        request.setPassword((String)getTestValue("String", "postSlidesSetDocumentProperties", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesSetDocumentProperties", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesSetDocumentProperties", "storage"));
        return request;
    }
    
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextTest() throws ApiException, Exception {
        initialize("postSlidesSlideReplaceText", null, null);
        SlideReplaceResult response = null;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        response = api.postSlidesSlideReplaceText(request);
        assertNotNull(response);
    }

    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesSlideReplaceText", "name"));
            initialize("postSlidesSlideReplaceText", "name", request.getName());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSlideReplaceText", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "postSlidesSlideReplaceText", "slideIndex"));
            initialize("postSlidesSlideReplaceText", "slideIndex", request.getSlideIndex());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlidesSlideReplaceText", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidOldValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setOldValue((String)invalidizeTestValue("String", request.getOldValue(), "postSlidesSlideReplaceText", "oldValue"));
            initialize("postSlidesSlideReplaceText", "oldValue", request.getOldValue());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldValue", "postSlidesSlideReplaceText", request.getOldValue());
        }
        if (needAssertResponse) {
            assertResponse("oldValue", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidNewValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setNewValue((String)invalidizeTestValue("String", request.getNewValue(), "postSlidesSlideReplaceText", "newValue"));
            initialize("postSlidesSlideReplaceText", "newValue", request.getNewValue());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newValue", "postSlidesSlideReplaceText", request.getNewValue());
        }
        if (needAssertResponse) {
            assertResponse("newValue", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidIgnoreCaseTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setIgnoreCase((Boolean)invalidizeTestValue("Boolean", request.getIgnoreCase(), "postSlidesSlideReplaceText", "ignoreCase"));
            initialize("postSlidesSlideReplaceText", "ignoreCase", request.getIgnoreCase());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "ignoreCase", "postSlidesSlideReplaceText", request.getIgnoreCase());
        }
        if (needAssertResponse) {
            assertResponse("ignoreCase", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesSlideReplaceText", "password"));
            initialize("postSlidesSlideReplaceText", "password", request.getPassword());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSlideReplaceText", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesSlideReplaceText", "folder"));
            initialize("postSlidesSlideReplaceText", "folder", request.getFolder());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSlideReplaceText", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesSlideReplaceText", "storage"));
            initialize("postSlidesSlideReplaceText", "storage", request.getStorage());
            SlideReplaceResult response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSlideReplaceText", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSlideReplaceText");
        }
    }

    private PostSlidesSlideReplaceTextRequest createPostSlidesSlideReplaceTextRequest() {
        PostSlidesSlideReplaceTextRequest request = new PostSlidesSlideReplaceTextRequest();
        request.setName((String)getTestValue("String", "postSlidesSlideReplaceText", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "postSlidesSlideReplaceText", "slideIndex"));
        request.setOldValue((String)getTestValue("String", "postSlidesSlideReplaceText", "oldValue"));
        request.setNewValue((String)getTestValue("String", "postSlidesSlideReplaceText", "newValue"));
        request.setIgnoreCase((Boolean)getTestValue("Boolean", "postSlidesSlideReplaceText", "ignoreCase"));
        request.setPassword((String)getTestValue("String", "postSlidesSlideReplaceText", "password"));
        request.setFolder((String)getTestValue("String", "postSlidesSlideReplaceText", "folder"));
        request.setStorage((String)getTestValue("String", "postSlidesSlideReplaceText", "storage"));
        return request;
    }
    
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitTest() throws ApiException, Exception {
        initialize("postSlidesSplit", null, null);
        SplitDocumentResult response = null;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        response = api.postSlidesSplit(request);
        assertNotNull(response);
    }

    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "postSlidesSplit", "name"));
            initialize("postSlidesSplit", "name", request.getName());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSplit", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setOptions((ExportOptions)invalidizeTestValue("ExportOptions", request.getOptions(), "postSlidesSplit", "options"));
            initialize("postSlidesSplit", "options", request.getOptions());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlidesSplit", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setFormat((SlideExportFormat)invalidizeTestValue("SlideExportFormat", request.getFormat(), "postSlidesSplit", "format"));
            initialize("postSlidesSplit", "format", request.getFormat());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlidesSplit", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setWidth((Integer)invalidizeTestValue("Integer", request.getWidth(), "postSlidesSplit", "width"));
            initialize("postSlidesSplit", "width", request.getWidth());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "postSlidesSplit", request.getWidth());
        }
        if (needAssertResponse) {
            assertResponse("width", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setHeight((Integer)invalidizeTestValue("Integer", request.getHeight(), "postSlidesSplit", "height"));
            initialize("postSlidesSplit", "height", request.getHeight());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "postSlidesSplit", request.getHeight());
        }
        if (needAssertResponse) {
            assertResponse("height", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidToTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setTo((Integer)invalidizeTestValue("Integer", request.getTo(), "postSlidesSplit", "to"));
            initialize("postSlidesSplit", "to", request.getTo());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "to", "postSlidesSplit", request.getTo());
        }
        if (needAssertResponse) {
            assertResponse("to", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setFrom((Integer)invalidizeTestValue("Integer", request.getFrom(), "postSlidesSplit", "from"));
            initialize("postSlidesSplit", "from", request.getFrom());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "from", "postSlidesSplit", request.getFrom());
        }
        if (needAssertResponse) {
            assertResponse("from", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidDestFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setDestFolder((String)invalidizeTestValue("String", request.getDestFolder(), "postSlidesSplit", "destFolder"));
            initialize("postSlidesSplit", "destFolder", request.getDestFolder());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destFolder", "postSlidesSplit", request.getDestFolder());
        }
        if (needAssertResponse) {
            assertResponse("destFolder", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "postSlidesSplit", "password"));
            initialize("postSlidesSplit", "password", request.getPassword());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSplit", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "postSlidesSplit", "storage"));
            initialize("postSlidesSplit", "storage", request.getStorage());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSplit", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "postSlidesSplit", "folder"));
            initialize("postSlidesSplit", "folder", request.getFolder());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSplit", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PostSlidesSplitRequest request = createPostSlidesSplitRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "postSlidesSplit", "fontsFolder"));
            initialize("postSlidesSplit", "fontsFolder", request.getFontsFolder());
            SplitDocumentResult response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlidesSplit", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlidesSplit");
        }
    }

    private PostSlidesSplitRequest createPostSlidesSplitRequest() {
        PostSlidesSplitRequest request = new PostSlidesSplitRequest();
        request.setName((String)getTestValue("String", "postSlidesSplit", "name"));
        request.setOptions((ExportOptions)getTestValue("ExportOptions", "postSlidesSplit", "options"));
        request.setFormat((SlideExportFormat)getTestValue("SlideExportFormat", "postSlidesSplit", "format"));
        request.setWidth((Integer)getTestValue("Integer", "postSlidesSplit", "width"));
        request.setHeight((Integer)getTestValue("Integer", "postSlidesSplit", "height"));
        request.setTo((Integer)getTestValue("Integer", "postSlidesSplit", "to"));
        request.setFrom((Integer)getTestValue("Integer", "postSlidesSplit", "from"));
        request.setDestFolder((String)getTestValue("String", "postSlidesSplit", "destFolder"));
        request.setPassword((String)getTestValue("String", "postSlidesSplit", "password"));
        request.setStorage((String)getTestValue("String", "postSlidesSplit", "storage"));
        request.setFolder((String)getTestValue("String", "postSlidesSplit", "folder"));
        request.setFontsFolder((String)getTestValue("String", "postSlidesSplit", "fontsFolder"));
        return request;
    }
    
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideTest() throws ApiException, Exception {
        initialize("putLayoutSlide", null, null);
        LayoutSlide response = null;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        response = api.putLayoutSlide(request);
        assertNotNull(response);
    }

    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putLayoutSlide", "name"));
            initialize("putLayoutSlide", "name", request.getName());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putLayoutSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putLayoutSlide");
        }
    }
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putLayoutSlide", "slideIndex"));
            initialize("putLayoutSlide", "slideIndex", request.getSlideIndex());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putLayoutSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putLayoutSlide");
        }
    }
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidSlideDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setSlideDto((LayoutSlide)invalidizeTestValue("LayoutSlide", request.getSlideDto(), "putLayoutSlide", "slideDto"));
            initialize("putLayoutSlide", "slideDto", request.getSlideDto());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideDto", "putLayoutSlide", request.getSlideDto());
        }
        if (needAssertResponse) {
            assertResponse("slideDto", "putLayoutSlide");
        }
    }
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putLayoutSlide", "password"));
            initialize("putLayoutSlide", "password", request.getPassword());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putLayoutSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putLayoutSlide");
        }
    }
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putLayoutSlide", "folder"));
            initialize("putLayoutSlide", "folder", request.getFolder());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putLayoutSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putLayoutSlide");
        }
    }
    /**
     * Update a layoutSlide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutLayoutSlideRequest request = createPutLayoutSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putLayoutSlide", "storage"));
            initialize("putLayoutSlide", "storage", request.getStorage());
            LayoutSlide response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putLayoutSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putLayoutSlide");
        }
    }

    private PutLayoutSlideRequest createPutLayoutSlideRequest() {
        PutLayoutSlideRequest request = new PutLayoutSlideRequest();
        request.setName((String)getTestValue("String", "putLayoutSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putLayoutSlide", "slideIndex"));
        request.setSlideDto((LayoutSlide)getTestValue("LayoutSlide", "putLayoutSlide", "slideDto"));
        request.setPassword((String)getTestValue("String", "putLayoutSlide", "password"));
        request.setFolder((String)getTestValue("String", "putLayoutSlide", "folder"));
        request.setStorage((String)getTestValue("String", "putLayoutSlide", "storage"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsTest() throws ApiException, Exception {
        initialize("putNotesSlideShapeSaveAs", null, null);
        ;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        api.putNotesSlideShapeSaveAs(request);
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putNotesSlideShapeSaveAs", "name"));
            initialize("putNotesSlideShapeSaveAs", "name", request.getName());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putNotesSlideShapeSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putNotesSlideShapeSaveAs", "slideIndex"));
            initialize("putNotesSlideShapeSaveAs", "slideIndex", request.getSlideIndex());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putNotesSlideShapeSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putNotesSlideShapeSaveAs", "path"));
            initialize("putNotesSlideShapeSaveAs", "path", request.getPath());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putNotesSlideShapeSaveAs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putNotesSlideShapeSaveAs", "shapeIndex"));
            initialize("putNotesSlideShapeSaveAs", "shapeIndex", request.getShapeIndex());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putNotesSlideShapeSaveAs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setFormat((ShapeExportFormat2)invalidizeTestValue("ShapeExportFormat2", request.getFormat(), "putNotesSlideShapeSaveAs", "format"));
            initialize("putNotesSlideShapeSaveAs", "format", request.getFormat());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putNotesSlideShapeSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setOutPath((String)invalidizeTestValue("String", request.getOutPath(), "putNotesSlideShapeSaveAs", "outPath"));
            initialize("putNotesSlideShapeSaveAs", "outPath", request.getOutPath());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putNotesSlideShapeSaveAs", request.getOutPath());
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setOptions((IShapeExportOptions)invalidizeTestValue("IShapeExportOptions", request.getOptions(), "putNotesSlideShapeSaveAs", "options"));
            initialize("putNotesSlideShapeSaveAs", "options", request.getOptions());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "putNotesSlideShapeSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putNotesSlideShapeSaveAs", "password"));
            initialize("putNotesSlideShapeSaveAs", "password", request.getPassword());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putNotesSlideShapeSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putNotesSlideShapeSaveAs", "folder"));
            initialize("putNotesSlideShapeSaveAs", "folder", request.getFolder());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putNotesSlideShapeSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putNotesSlideShapeSaveAs", "storage"));
            initialize("putNotesSlideShapeSaveAs", "storage", request.getStorage());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putNotesSlideShapeSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setScaleX((Double)invalidizeTestValue("Double", request.getScaleX(), "putNotesSlideShapeSaveAs", "scaleX"));
            initialize("putNotesSlideShapeSaveAs", "scaleX", request.getScaleX());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "putNotesSlideShapeSaveAs", request.getScaleX());
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setScaleY((Double)invalidizeTestValue("Double", request.getScaleY(), "putNotesSlideShapeSaveAs", "scaleY"));
            initialize("putNotesSlideShapeSaveAs", "scaleY", request.getScaleY());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "putNotesSlideShapeSaveAs", request.getScaleY());
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setBounds((ShapeThumbnailBounds2)invalidizeTestValue("ShapeThumbnailBounds2", request.getBounds(), "putNotesSlideShapeSaveAs", "bounds"));
            initialize("putNotesSlideShapeSaveAs", "bounds", request.getBounds());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "putNotesSlideShapeSaveAs", request.getBounds());
        }
        if (needAssertResponse) {
            assertResponse("bounds", "putNotesSlideShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNotesSlideShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutNotesSlideShapeSaveAsRequest request = createPutNotesSlideShapeSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "putNotesSlideShapeSaveAs", "fontsFolder"));
            initialize("putNotesSlideShapeSaveAs", "fontsFolder", request.getFontsFolder());
            api.putNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putNotesSlideShapeSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putNotesSlideShapeSaveAs");
        }
    }

    private PutNotesSlideShapeSaveAsRequest createPutNotesSlideShapeSaveAsRequest() {
        PutNotesSlideShapeSaveAsRequest request = new PutNotesSlideShapeSaveAsRequest();
        request.setName((String)getTestValue("String", "putNotesSlideShapeSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putNotesSlideShapeSaveAs", "slideIndex"));
        request.setPath((String)getTestValue("String", "putNotesSlideShapeSaveAs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putNotesSlideShapeSaveAs", "shapeIndex"));
        request.setFormat((ShapeExportFormat2)getTestValue("ShapeExportFormat2", "putNotesSlideShapeSaveAs", "format"));
        request.setOutPath((String)getTestValue("String", "putNotesSlideShapeSaveAs", "outPath"));
        request.setOptions((IShapeExportOptions)getTestValue("IShapeExportOptions", "putNotesSlideShapeSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "putNotesSlideShapeSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "putNotesSlideShapeSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "putNotesSlideShapeSaveAs", "storage"));
        request.setScaleX((Double)getTestValue("Double", "putNotesSlideShapeSaveAs", "scaleX"));
        request.setScaleY((Double)getTestValue("Double", "putNotesSlideShapeSaveAs", "scaleY"));
        request.setBounds((ShapeThumbnailBounds2)getTestValue("ShapeThumbnailBounds2", "putNotesSlideShapeSaveAs", "bounds"));
        request.setFontsFolder((String)getTestValue("String", "putNotesSlideShapeSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeTest() throws ApiException, Exception {
        initialize("putPresentationMerge", null, null);
        Document response = null;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        response = api.putPresentationMerge(request);
        assertNotNull(response);
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putPresentationMerge", "name"));
            initialize("putPresentationMerge", "name", request.getName());
            Document response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putPresentationMerge", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidRequestTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        try {
            request.setRequest((OrderedMergeRequest)invalidizeTestValue("OrderedMergeRequest", request.getRequest(), "putPresentationMerge", "request"));
            initialize("putPresentationMerge", "request", request.getRequest());
            Document response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "request", "putPresentationMerge", request.getRequest());
        }
        if (needAssertResponse) {
            assertResponse("request", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putPresentationMerge", "password"));
            initialize("putPresentationMerge", "password", request.getPassword());
            Document response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putPresentationMerge", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putPresentationMerge", "storage"));
            initialize("putPresentationMerge", "storage", request.getStorage());
            Document response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putPresentationMerge", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutPresentationMergeRequest request = createPutPresentationMergeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putPresentationMerge", "folder"));
            initialize("putPresentationMerge", "folder", request.getFolder());
            Document response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putPresentationMerge", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putPresentationMerge");
        }
    }

    private PutPresentationMergeRequest createPutPresentationMergeRequest() {
        PutPresentationMergeRequest request = new PutPresentationMergeRequest();
        request.setName((String)getTestValue("String", "putPresentationMerge", "name"));
        request.setRequest((OrderedMergeRequest)getTestValue("OrderedMergeRequest", "putPresentationMerge", "request"));
        request.setPassword((String)getTestValue("String", "putPresentationMerge", "password"));
        request.setStorage((String)getTestValue("String", "putPresentationMerge", "storage"));
        request.setFolder((String)getTestValue("String", "putPresentationMerge", "folder"));
        return request;
    }
    
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesTest() throws ApiException, Exception {
        initialize("putSetParagraphPortionProperties", null, null);
        Portion response = null;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        response = api.putSetParagraphPortionProperties(request);
        assertNotNull(response);
    }

    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSetParagraphPortionProperties", "name"));
            initialize("putSetParagraphPortionProperties", "name", request.getName());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSetParagraphPortionProperties", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSetParagraphPortionProperties", "slideIndex"));
            initialize("putSetParagraphPortionProperties", "slideIndex", request.getSlideIndex());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSetParagraphPortionProperties", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putSetParagraphPortionProperties", "path"));
            initialize("putSetParagraphPortionProperties", "path", request.getPath());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSetParagraphPortionProperties", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putSetParagraphPortionProperties", "shapeIndex"));
            initialize("putSetParagraphPortionProperties", "shapeIndex", request.getShapeIndex());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSetParagraphPortionProperties", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "putSetParagraphPortionProperties", "paragraphIndex"));
            initialize("putSetParagraphPortionProperties", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putSetParagraphPortionProperties", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "putSetParagraphPortionProperties", "portionIndex"));
            initialize("putSetParagraphPortionProperties", "portionIndex", request.getPortionIndex());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "putSetParagraphPortionProperties", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setDto((Portion)invalidizeTestValue("Portion", request.getDto(), "putSetParagraphPortionProperties", "dto"));
            initialize("putSetParagraphPortionProperties", "dto", request.getDto());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSetParagraphPortionProperties", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSetParagraphPortionProperties", "password"));
            initialize("putSetParagraphPortionProperties", "password", request.getPassword());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSetParagraphPortionProperties", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSetParagraphPortionProperties", "folder"));
            initialize("putSetParagraphPortionProperties", "folder", request.getFolder());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSetParagraphPortionProperties", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSetParagraphPortionProperties", "storage"));
            initialize("putSetParagraphPortionProperties", "storage", request.getStorage());
            Portion response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSetParagraphPortionProperties", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSetParagraphPortionProperties");
        }
    }

    private PutSetParagraphPortionPropertiesRequest createPutSetParagraphPortionPropertiesRequest() {
        PutSetParagraphPortionPropertiesRequest request = new PutSetParagraphPortionPropertiesRequest();
        request.setName((String)getTestValue("String", "putSetParagraphPortionProperties", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSetParagraphPortionProperties", "slideIndex"));
        request.setPath((String)getTestValue("String", "putSetParagraphPortionProperties", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putSetParagraphPortionProperties", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "putSetParagraphPortionProperties", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "putSetParagraphPortionProperties", "portionIndex"));
        request.setDto((Portion)getTestValue("Portion", "putSetParagraphPortionProperties", "dto"));
        request.setPassword((String)getTestValue("String", "putSetParagraphPortionProperties", "password"));
        request.setFolder((String)getTestValue("String", "putSetParagraphPortionProperties", "folder"));
        request.setStorage((String)getTestValue("String", "putSetParagraphPortionProperties", "storage"));
        return request;
    }
    
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesTest() throws ApiException, Exception {
        initialize("putSetParagraphProperties", null, null);
        Paragraph response = null;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        response = api.putSetParagraphProperties(request);
        assertNotNull(response);
    }

    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSetParagraphProperties", "name"));
            initialize("putSetParagraphProperties", "name", request.getName());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSetParagraphProperties", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSetParagraphProperties", "slideIndex"));
            initialize("putSetParagraphProperties", "slideIndex", request.getSlideIndex());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSetParagraphProperties", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putSetParagraphProperties", "path"));
            initialize("putSetParagraphProperties", "path", request.getPath());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSetParagraphProperties", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putSetParagraphProperties", "shapeIndex"));
            initialize("putSetParagraphProperties", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSetParagraphProperties", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "putSetParagraphProperties", "paragraphIndex"));
            initialize("putSetParagraphProperties", "paragraphIndex", request.getParagraphIndex());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putSetParagraphProperties", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setDto((Paragraph)invalidizeTestValue("Paragraph", request.getDto(), "putSetParagraphProperties", "dto"));
            initialize("putSetParagraphProperties", "dto", request.getDto());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSetParagraphProperties", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSetParagraphProperties", "password"));
            initialize("putSetParagraphProperties", "password", request.getPassword());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSetParagraphProperties", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSetParagraphProperties", "folder"));
            initialize("putSetParagraphProperties", "folder", request.getFolder());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSetParagraphProperties", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSetParagraphProperties");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSetParagraphProperties", "storage"));
            initialize("putSetParagraphProperties", "storage", request.getStorage());
            Paragraph response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSetParagraphProperties", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSetParagraphProperties");
        }
    }

    private PutSetParagraphPropertiesRequest createPutSetParagraphPropertiesRequest() {
        PutSetParagraphPropertiesRequest request = new PutSetParagraphPropertiesRequest();
        request.setName((String)getTestValue("String", "putSetParagraphProperties", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSetParagraphProperties", "slideIndex"));
        request.setPath((String)getTestValue("String", "putSetParagraphProperties", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putSetParagraphProperties", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "putSetParagraphProperties", "paragraphIndex"));
        request.setDto((Paragraph)getTestValue("Paragraph", "putSetParagraphProperties", "dto"));
        request.setPassword((String)getTestValue("String", "putSetParagraphProperties", "password"));
        request.setFolder((String)getTestValue("String", "putSetParagraphProperties", "folder"));
        request.setStorage((String)getTestValue("String", "putSetParagraphProperties", "storage"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsTest() throws ApiException, Exception {
        initialize("putShapeSaveAs", null, null);
        ;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        api.putShapeSaveAs(request);
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putShapeSaveAs", "name"));
            initialize("putShapeSaveAs", "name", request.getName());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putShapeSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putShapeSaveAs", "slideIndex"));
            initialize("putShapeSaveAs", "slideIndex", request.getSlideIndex());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putShapeSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putShapeSaveAs", "path"));
            initialize("putShapeSaveAs", "path", request.getPath());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putShapeSaveAs", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putShapeSaveAs", "shapeIndex"));
            initialize("putShapeSaveAs", "shapeIndex", request.getShapeIndex());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putShapeSaveAs", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setFormat((ShapeExportFormat2)invalidizeTestValue("ShapeExportFormat2", request.getFormat(), "putShapeSaveAs", "format"));
            initialize("putShapeSaveAs", "format", request.getFormat());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putShapeSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setOutPath((String)invalidizeTestValue("String", request.getOutPath(), "putShapeSaveAs", "outPath"));
            initialize("putShapeSaveAs", "outPath", request.getOutPath());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putShapeSaveAs", request.getOutPath());
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setOptions((IShapeExportOptions)invalidizeTestValue("IShapeExportOptions", request.getOptions(), "putShapeSaveAs", "options"));
            initialize("putShapeSaveAs", "options", request.getOptions());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "putShapeSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putShapeSaveAs", "password"));
            initialize("putShapeSaveAs", "password", request.getPassword());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putShapeSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putShapeSaveAs", "folder"));
            initialize("putShapeSaveAs", "folder", request.getFolder());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putShapeSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putShapeSaveAs", "storage"));
            initialize("putShapeSaveAs", "storage", request.getStorage());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putShapeSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setScaleX((Double)invalidizeTestValue("Double", request.getScaleX(), "putShapeSaveAs", "scaleX"));
            initialize("putShapeSaveAs", "scaleX", request.getScaleX());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "putShapeSaveAs", request.getScaleX());
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setScaleY((Double)invalidizeTestValue("Double", request.getScaleY(), "putShapeSaveAs", "scaleY"));
            initialize("putShapeSaveAs", "scaleY", request.getScaleY());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "putShapeSaveAs", request.getScaleY());
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setBounds((ShapeThumbnailBounds2)invalidizeTestValue("ShapeThumbnailBounds2", request.getBounds(), "putShapeSaveAs", "bounds"));
            initialize("putShapeSaveAs", "bounds", request.getBounds());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "putShapeSaveAs", request.getBounds());
        }
        if (needAssertResponse) {
            assertResponse("bounds", "putShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutShapeSaveAsRequest request = createPutShapeSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "putShapeSaveAs", "fontsFolder"));
            initialize("putShapeSaveAs", "fontsFolder", request.getFontsFolder());
            api.putShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putShapeSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putShapeSaveAs");
        }
    }

    private PutShapeSaveAsRequest createPutShapeSaveAsRequest() {
        PutShapeSaveAsRequest request = new PutShapeSaveAsRequest();
        request.setName((String)getTestValue("String", "putShapeSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putShapeSaveAs", "slideIndex"));
        request.setPath((String)getTestValue("String", "putShapeSaveAs", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putShapeSaveAs", "shapeIndex"));
        request.setFormat((ShapeExportFormat2)getTestValue("ShapeExportFormat2", "putShapeSaveAs", "format"));
        request.setOutPath((String)getTestValue("String", "putShapeSaveAs", "outPath"));
        request.setOptions((IShapeExportOptions)getTestValue("IShapeExportOptions", "putShapeSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "putShapeSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "putShapeSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "putShapeSaveAs", "storage"));
        request.setScaleX((Double)getTestValue("Double", "putShapeSaveAs", "scaleX"));
        request.setScaleY((Double)getTestValue("Double", "putShapeSaveAs", "scaleY"));
        request.setBounds((ShapeThumbnailBounds2)getTestValue("ShapeThumbnailBounds2", "putShapeSaveAs", "bounds"));
        request.setFontsFolder((String)getTestValue("String", "putShapeSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationTest() throws ApiException, Exception {
        initialize("putSlideAnimation", null, null);
        SlideAnimation response = null;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        response = api.putSlideAnimation(request);
        assertNotNull(response);
    }

    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlideAnimation", "name"));
            initialize("putSlideAnimation", "name", request.getName());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideAnimation", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideAnimation");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlideAnimation", "slideIndex"));
            initialize("putSlideAnimation", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideAnimation", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideAnimation");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidAnimationTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setAnimation((SlideAnimation)invalidizeTestValue("SlideAnimation", request.getAnimation(), "putSlideAnimation", "animation"));
            initialize("putSlideAnimation", "animation", request.getAnimation());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "animation", "putSlideAnimation", request.getAnimation());
        }
        if (needAssertResponse) {
            assertResponse("animation", "putSlideAnimation");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlideAnimation", "password"));
            initialize("putSlideAnimation", "password", request.getPassword());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideAnimation", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideAnimation");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlideAnimation", "folder"));
            initialize("putSlideAnimation", "folder", request.getFolder());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideAnimation", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideAnimation");
        }
    }
    /**
     * Set slide animation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationRequest request = createPutSlideAnimationRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlideAnimation", "storage"));
            initialize("putSlideAnimation", "storage", request.getStorage());
            SlideAnimation response = api.putSlideAnimation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideAnimation", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideAnimation");
        }
    }

    private PutSlideAnimationRequest createPutSlideAnimationRequest() {
        PutSlideAnimationRequest request = new PutSlideAnimationRequest();
        request.setName((String)getTestValue("String", "putSlideAnimation", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlideAnimation", "slideIndex"));
        request.setAnimation((SlideAnimation)getTestValue("SlideAnimation", "putSlideAnimation", "animation"));
        request.setPassword((String)getTestValue("String", "putSlideAnimation", "password"));
        request.setFolder((String)getTestValue("String", "putSlideAnimation", "folder"));
        request.setStorage((String)getTestValue("String", "putSlideAnimation", "storage"));
        return request;
    }
    
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectTest() throws ApiException, Exception {
        initialize("putSlideAnimationEffect", null, null);
        SlideAnimation response = null;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        response = api.putSlideAnimationEffect(request);
        assertNotNull(response);
    }

    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlideAnimationEffect", "name"));
            initialize("putSlideAnimationEffect", "name", request.getName());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideAnimationEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlideAnimationEffect", "slideIndex"));
            initialize("putSlideAnimationEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideAnimationEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidEffectIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setEffectIndex((Integer)invalidizeTestValue("Integer", request.getEffectIndex(), "putSlideAnimationEffect", "effectIndex"));
            initialize("putSlideAnimationEffect", "effectIndex", request.getEffectIndex());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effectIndex", "putSlideAnimationEffect", request.getEffectIndex());
        }
        if (needAssertResponse) {
            assertResponse("effectIndex", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidEffectTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setEffect((Effect)invalidizeTestValue("Effect", request.getEffect(), "putSlideAnimationEffect", "effect"));
            initialize("putSlideAnimationEffect", "effect", request.getEffect());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effect", "putSlideAnimationEffect", request.getEffect());
        }
        if (needAssertResponse) {
            assertResponse("effect", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlideAnimationEffect", "password"));
            initialize("putSlideAnimationEffect", "password", request.getPassword());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideAnimationEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlideAnimationEffect", "folder"));
            initialize("putSlideAnimationEffect", "folder", request.getFolder());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideAnimationEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideAnimationEffect");
        }
    }
    /**
     * Modify an animation effect for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationEffectRequest request = createPutSlideAnimationEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlideAnimationEffect", "storage"));
            initialize("putSlideAnimationEffect", "storage", request.getStorage());
            SlideAnimation response = api.putSlideAnimationEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideAnimationEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideAnimationEffect");
        }
    }

    private PutSlideAnimationEffectRequest createPutSlideAnimationEffectRequest() {
        PutSlideAnimationEffectRequest request = new PutSlideAnimationEffectRequest();
        request.setName((String)getTestValue("String", "putSlideAnimationEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlideAnimationEffect", "slideIndex"));
        request.setEffectIndex((Integer)getTestValue("Integer", "putSlideAnimationEffect", "effectIndex"));
        request.setEffect((Effect)getTestValue("Effect", "putSlideAnimationEffect", "effect"));
        request.setPassword((String)getTestValue("String", "putSlideAnimationEffect", "password"));
        request.setFolder((String)getTestValue("String", "putSlideAnimationEffect", "folder"));
        request.setStorage((String)getTestValue("String", "putSlideAnimationEffect", "storage"));
        return request;
    }
    
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectTest() throws ApiException, Exception {
        initialize("putSlideAnimationInteractiveSequenceEffect", null, null);
        SlideAnimation response = null;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        response = api.putSlideAnimationInteractiveSequenceEffect(request);
        assertNotNull(response);
    }

    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlideAnimationInteractiveSequenceEffect", "name"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "name", request.getName());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideAnimationInteractiveSequenceEffect", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlideAnimationInteractiveSequenceEffect", "slideIndex"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "slideIndex", request.getSlideIndex());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideAnimationInteractiveSequenceEffect", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidSequenceIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setSequenceIndex((Integer)invalidizeTestValue("Integer", request.getSequenceIndex(), "putSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "sequenceIndex", request.getSequenceIndex());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sequenceIndex", "putSlideAnimationInteractiveSequenceEffect", request.getSequenceIndex());
        }
        if (needAssertResponse) {
            assertResponse("sequenceIndex", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidEffectIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setEffectIndex((Integer)invalidizeTestValue("Integer", request.getEffectIndex(), "putSlideAnimationInteractiveSequenceEffect", "effectIndex"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "effectIndex", request.getEffectIndex());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effectIndex", "putSlideAnimationInteractiveSequenceEffect", request.getEffectIndex());
        }
        if (needAssertResponse) {
            assertResponse("effectIndex", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidEffectTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setEffect((Effect)invalidizeTestValue("Effect", request.getEffect(), "putSlideAnimationInteractiveSequenceEffect", "effect"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "effect", request.getEffect());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "effect", "putSlideAnimationInteractiveSequenceEffect", request.getEffect());
        }
        if (needAssertResponse) {
            assertResponse("effect", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlideAnimationInteractiveSequenceEffect", "password"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "password", request.getPassword());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideAnimationInteractiveSequenceEffect", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlideAnimationInteractiveSequenceEffect", "folder"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "folder", request.getFolder());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideAnimationInteractiveSequenceEffect", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideAnimationInteractiveSequenceEffect");
        }
    }
    /**
     * Modify an animation effect for a slide interactive sequence.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideAnimationInteractiveSequenceEffectInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideAnimationInteractiveSequenceEffectRequest request = createPutSlideAnimationInteractiveSequenceEffectRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlideAnimationInteractiveSequenceEffect", "storage"));
            initialize("putSlideAnimationInteractiveSequenceEffect", "storage", request.getStorage());
            SlideAnimation response = api.putSlideAnimationInteractiveSequenceEffect(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideAnimationInteractiveSequenceEffect", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideAnimationInteractiveSequenceEffect");
        }
    }

    private PutSlideAnimationInteractiveSequenceEffectRequest createPutSlideAnimationInteractiveSequenceEffectRequest() {
        PutSlideAnimationInteractiveSequenceEffectRequest request = new PutSlideAnimationInteractiveSequenceEffectRequest();
        request.setName((String)getTestValue("String", "putSlideAnimationInteractiveSequenceEffect", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlideAnimationInteractiveSequenceEffect", "slideIndex"));
        request.setSequenceIndex((Integer)getTestValue("Integer", "putSlideAnimationInteractiveSequenceEffect", "sequenceIndex"));
        request.setEffectIndex((Integer)getTestValue("Integer", "putSlideAnimationInteractiveSequenceEffect", "effectIndex"));
        request.setEffect((Effect)getTestValue("Effect", "putSlideAnimationInteractiveSequenceEffect", "effect"));
        request.setPassword((String)getTestValue("String", "putSlideAnimationInteractiveSequenceEffect", "password"));
        request.setFolder((String)getTestValue("String", "putSlideAnimationInteractiveSequenceEffect", "folder"));
        request.setStorage((String)getTestValue("String", "putSlideAnimationInteractiveSequenceEffect", "storage"));
        return request;
    }
    
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsTest() throws ApiException, Exception {
        initialize("putSlideSaveAs", null, null);
        ;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        api.putSlideSaveAs(request);
    }

    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlideSaveAs", "name"));
            initialize("putSlideSaveAs", "name", request.getName());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlideSaveAs", "slideIndex"));
            initialize("putSlideSaveAs", "slideIndex", request.getSlideIndex());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideSaveAs", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setFormat((SlideExportFormat)invalidizeTestValue("SlideExportFormat", request.getFormat(), "putSlideSaveAs", "format"));
            initialize("putSlideSaveAs", "format", request.getFormat());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putSlideSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setOutPath((String)invalidizeTestValue("String", request.getOutPath(), "putSlideSaveAs", "outPath"));
            initialize("putSlideSaveAs", "outPath", request.getOutPath());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putSlideSaveAs", request.getOutPath());
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setOptions((ExportOptions)invalidizeTestValue("ExportOptions", request.getOptions(), "putSlideSaveAs", "options"));
            initialize("putSlideSaveAs", "options", request.getOptions());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "putSlideSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setWidth((Integer)invalidizeTestValue("Integer", request.getWidth(), "putSlideSaveAs", "width"));
            initialize("putSlideSaveAs", "width", request.getWidth());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "putSlideSaveAs", request.getWidth());
        }
        if (needAssertResponse) {
            assertResponse("width", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setHeight((Integer)invalidizeTestValue("Integer", request.getHeight(), "putSlideSaveAs", "height"));
            initialize("putSlideSaveAs", "height", request.getHeight());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "putSlideSaveAs", request.getHeight());
        }
        if (needAssertResponse) {
            assertResponse("height", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlideSaveAs", "password"));
            initialize("putSlideSaveAs", "password", request.getPassword());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlideSaveAs", "folder"));
            initialize("putSlideSaveAs", "folder", request.getFolder());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlideSaveAs", "storage"));
            initialize("putSlideSaveAs", "storage", request.getStorage());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideSaveAs");
        }
    }
    /**
     * Save a slide to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideSaveAsRequest request = createPutSlideSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "putSlideSaveAs", "fontsFolder"));
            initialize("putSlideSaveAs", "fontsFolder", request.getFontsFolder());
            api.putSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putSlideSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putSlideSaveAs");
        }
    }

    private PutSlideSaveAsRequest createPutSlideSaveAsRequest() {
        PutSlideSaveAsRequest request = new PutSlideSaveAsRequest();
        request.setName((String)getTestValue("String", "putSlideSaveAs", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlideSaveAs", "slideIndex"));
        request.setFormat((SlideExportFormat)getTestValue("SlideExportFormat", "putSlideSaveAs", "format"));
        request.setOutPath((String)getTestValue("String", "putSlideSaveAs", "outPath"));
        request.setOptions((ExportOptions)getTestValue("ExportOptions", "putSlideSaveAs", "options"));
        request.setWidth((Integer)getTestValue("Integer", "putSlideSaveAs", "width"));
        request.setHeight((Integer)getTestValue("Integer", "putSlideSaveAs", "height"));
        request.setPassword((String)getTestValue("String", "putSlideSaveAs", "password"));
        request.setFolder((String)getTestValue("String", "putSlideSaveAs", "folder"));
        request.setStorage((String)getTestValue("String", "putSlideSaveAs", "storage"));
        request.setFontsFolder((String)getTestValue("String", "putSlideSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoTest() throws ApiException, Exception {
        initialize("putSlideShapeInfo", null, null);
        ShapeBase response = null;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        response = api.putSlideShapeInfo(request);
        assertNotNull(response);
    }

    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlideShapeInfo", "name"));
            initialize("putSlideShapeInfo", "name", request.getName());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideShapeInfo", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlideShapeInfo", "slideIndex"));
            initialize("putSlideShapeInfo", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideShapeInfo", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putSlideShapeInfo", "path"));
            initialize("putSlideShapeInfo", "path", request.getPath());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSlideShapeInfo", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putSlideShapeInfo", "shapeIndex"));
            initialize("putSlideShapeInfo", "shapeIndex", request.getShapeIndex());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSlideShapeInfo", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setDto((ShapeBase)invalidizeTestValue("ShapeBase", request.getDto(), "putSlideShapeInfo", "dto"));
            initialize("putSlideShapeInfo", "dto", request.getDto());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSlideShapeInfo", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlideShapeInfo", "password"));
            initialize("putSlideShapeInfo", "password", request.getPassword());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideShapeInfo", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlideShapeInfo", "folder"));
            initialize("putSlideShapeInfo", "folder", request.getFolder());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideShapeInfo", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideShapeInfo");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlideShapeInfo", "storage"));
            initialize("putSlideShapeInfo", "storage", request.getStorage());
            ShapeBase response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideShapeInfo", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideShapeInfo");
        }
    }

    private PutSlideShapeInfoRequest createPutSlideShapeInfoRequest() {
        PutSlideShapeInfoRequest request = new PutSlideShapeInfoRequest();
        request.setName((String)getTestValue("String", "putSlideShapeInfo", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlideShapeInfo", "slideIndex"));
        request.setPath((String)getTestValue("String", "putSlideShapeInfo", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putSlideShapeInfo", "shapeIndex"));
        request.setDto((ShapeBase)getTestValue("ShapeBase", "putSlideShapeInfo", "dto"));
        request.setPassword((String)getTestValue("String", "putSlideShapeInfo", "password"));
        request.setFolder((String)getTestValue("String", "putSlideShapeInfo", "folder"));
        request.setStorage((String)getTestValue("String", "putSlideShapeInfo", "storage"));
        return request;
    }
    
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertTest() throws ApiException, Exception {
        initialize("putSlidesConvert", null, null);
        ;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        api.putSlidesConvert(request);
    }

    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        try {
            request.setFormat((ExportFormat)invalidizeTestValue("ExportFormat", request.getFormat(), "putSlidesConvert", "format"));
            initialize("putSlidesConvert", "format", request.getFormat());
            api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putSlidesConvert", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        try {
            request.setOutPath((String)invalidizeTestValue("String", request.getOutPath(), "putSlidesConvert", "outPath"));
            initialize("putSlidesConvert", "outPath", request.getOutPath());
            api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putSlidesConvert", request.getOutPath());
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidDocumentTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        try {
            request.setDocument((byte[])invalidizeTestValue("byte[]", request.getDocument(), "putSlidesConvert", "document"));
            initialize("putSlidesConvert", "document", request.getDocument());
            api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "document", "putSlidesConvert", request.getDocument());
        }
        if (needAssertResponse) {
            assertResponse("document", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesConvert", "password"));
            initialize("putSlidesConvert", "password", request.getPassword());
            api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesConvert", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesConvertRequest request = createPutSlidesConvertRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "putSlidesConvert", "fontsFolder"));
            initialize("putSlidesConvert", "fontsFolder", request.getFontsFolder());
            api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putSlidesConvert", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putSlidesConvert");
        }
    }

    private PutSlidesConvertRequest createPutSlidesConvertRequest() {
        PutSlidesConvertRequest request = new PutSlidesConvertRequest();
        request.setFormat((ExportFormat)getTestValue("ExportFormat", "putSlidesConvert", "format"));
        request.setOutPath((String)getTestValue("String", "putSlidesConvert", "outPath"));
        request.setDocument((byte[])getTestValue("byte[]", "putSlidesConvert", "document"));
        request.setPassword((String)getTestValue("String", "putSlidesConvert", "password"));
        request.setFontsFolder((String)getTestValue("String", "putSlidesConvert", "fontsFolder"));
        return request;
    }
    
    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlTest() throws ApiException, Exception {
        initialize("putSlidesDocumentFromHtml", null, null);
        Document response = null;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        response = api.putSlidesDocumentFromHtml(request);
        assertNotNull(response);
    }

    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesDocumentFromHtml", "name"));
            initialize("putSlidesDocumentFromHtml", "name", request.getName());
            Document response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesDocumentFromHtml", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidHtmlTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        try {
            request.setHtml((String)invalidizeTestValue("String", request.getHtml(), "putSlidesDocumentFromHtml", "html"));
            initialize("putSlidesDocumentFromHtml", "html", request.getHtml());
            Document response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "html", "putSlidesDocumentFromHtml", request.getHtml());
        }
        if (needAssertResponse) {
            assertResponse("html", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesDocumentFromHtml", "password"));
            initialize("putSlidesDocumentFromHtml", "password", request.getPassword());
            Document response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesDocumentFromHtml", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesDocumentFromHtml", "storage"));
            initialize("putSlidesDocumentFromHtml", "storage", request.getStorage());
            Document response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesDocumentFromHtml", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Update presentation document from html.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesDocumentFromHtml", "folder"));
            initialize("putSlidesDocumentFromHtml", "folder", request.getFolder());
            Document response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesDocumentFromHtml", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesDocumentFromHtml");
        }
    }

    private PutSlidesDocumentFromHtmlRequest createPutSlidesDocumentFromHtmlRequest() {
        PutSlidesDocumentFromHtmlRequest request = new PutSlidesDocumentFromHtmlRequest();
        request.setName((String)getTestValue("String", "putSlidesDocumentFromHtml", "name"));
        request.setHtml((String)getTestValue("String", "putSlidesDocumentFromHtml", "html"));
        request.setPassword((String)getTestValue("String", "putSlidesDocumentFromHtml", "password"));
        request.setStorage((String)getTestValue("String", "putSlidesDocumentFromHtml", "storage"));
        request.setFolder((String)getTestValue("String", "putSlidesDocumentFromHtml", "folder"));
        return request;
    }
    
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsTest() throws ApiException, Exception {
        initialize("putSlidesSaveAs", null, null);
        ;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        api.putSlidesSaveAs(request);
    }

    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSaveAs", "name"));
            initialize("putSlidesSaveAs", "name", request.getName());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSaveAs", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setOutPath((String)invalidizeTestValue("String", request.getOutPath(), "putSlidesSaveAs", "outPath"));
            initialize("putSlidesSaveAs", "outPath", request.getOutPath());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putSlidesSaveAs", request.getOutPath());
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setFormat((ExportFormat)invalidizeTestValue("ExportFormat", request.getFormat(), "putSlidesSaveAs", "format"));
            initialize("putSlidesSaveAs", "format", request.getFormat());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putSlidesSaveAs", request.getFormat());
        }
        if (needAssertResponse) {
            assertResponse("format", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setOptions((ExportOptions)invalidizeTestValue("ExportOptions", request.getOptions(), "putSlidesSaveAs", "options"));
            initialize("putSlidesSaveAs", "options", request.getOptions());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "putSlidesSaveAs", request.getOptions());
        }
        if (needAssertResponse) {
            assertResponse("options", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSaveAs", "password"));
            initialize("putSlidesSaveAs", "password", request.getPassword());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSaveAs", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSaveAs", "storage"));
            initialize("putSlidesSaveAs", "storage", request.getStorage());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSaveAs", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSaveAs", "folder"));
            initialize("putSlidesSaveAs", "folder", request.getFolder());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSaveAs", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSaveAs");
        }
    }
    /**
     * Save a presentation to a specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSaveAsRequest request = createPutSlidesSaveAsRequest();
        try {
            request.setFontsFolder((String)invalidizeTestValue("String", request.getFontsFolder(), "putSlidesSaveAs", "fontsFolder"));
            initialize("putSlidesSaveAs", "fontsFolder", request.getFontsFolder());
            api.putSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putSlidesSaveAs", request.getFontsFolder());
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putSlidesSaveAs");
        }
    }

    private PutSlidesSaveAsRequest createPutSlidesSaveAsRequest() {
        PutSlidesSaveAsRequest request = new PutSlidesSaveAsRequest();
        request.setName((String)getTestValue("String", "putSlidesSaveAs", "name"));
        request.setOutPath((String)getTestValue("String", "putSlidesSaveAs", "outPath"));
        request.setFormat((ExportFormat)getTestValue("ExportFormat", "putSlidesSaveAs", "format"));
        request.setOptions((ExportOptions)getTestValue("ExportOptions", "putSlidesSaveAs", "options"));
        request.setPassword((String)getTestValue("String", "putSlidesSaveAs", "password"));
        request.setStorage((String)getTestValue("String", "putSlidesSaveAs", "storage"));
        request.setFolder((String)getTestValue("String", "putSlidesSaveAs", "folder"));
        request.setFontsFolder((String)getTestValue("String", "putSlidesSaveAs", "fontsFolder"));
        return request;
    }
    
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyTest() throws ApiException, Exception {
        initialize("putSlidesSetDocumentProperty", null, null);
        DocumentProperty response = null;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        response = api.putSlidesSetDocumentProperty(request);
        assertNotNull(response);
    }

    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSetDocumentProperty", "name"));
            initialize("putSlidesSetDocumentProperty", "name", request.getName());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSetDocumentProperty", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setPropertyName((String)invalidizeTestValue("String", request.getPropertyName(), "putSlidesSetDocumentProperty", "propertyName"));
            initialize("putSlidesSetDocumentProperty", "propertyName", request.getPropertyName());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "putSlidesSetDocumentProperty", request.getPropertyName());
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPropertyTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setProperty((DocumentProperty)invalidizeTestValue("DocumentProperty", request.getProperty(), "putSlidesSetDocumentProperty", "property"));
            initialize("putSlidesSetDocumentProperty", "property", request.getProperty());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "property", "putSlidesSetDocumentProperty", request.getProperty());
        }
        if (needAssertResponse) {
            assertResponse("property", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSetDocumentProperty", "password"));
            initialize("putSlidesSetDocumentProperty", "password", request.getPassword());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSetDocumentProperty", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSetDocumentProperty", "folder"));
            initialize("putSlidesSetDocumentProperty", "folder", request.getFolder());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSetDocumentProperty", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSetDocumentProperty", "storage"));
            initialize("putSlidesSetDocumentProperty", "storage", request.getStorage());
            DocumentProperty response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSetDocumentProperty", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSetDocumentProperty");
        }
    }

    private PutSlidesSetDocumentPropertyRequest createPutSlidesSetDocumentPropertyRequest() {
        PutSlidesSetDocumentPropertyRequest request = new PutSlidesSetDocumentPropertyRequest();
        request.setName((String)getTestValue("String", "putSlidesSetDocumentProperty", "name"));
        request.setPropertyName((String)getTestValue("String", "putSlidesSetDocumentProperty", "propertyName"));
        request.setProperty((DocumentProperty)getTestValue("DocumentProperty", "putSlidesSetDocumentProperty", "property"));
        request.setPassword((String)getTestValue("String", "putSlidesSetDocumentProperty", "password"));
        request.setFolder((String)getTestValue("String", "putSlidesSetDocumentProperty", "folder"));
        request.setStorage((String)getTestValue("String", "putSlidesSetDocumentProperty", "storage"));
        return request;
    }
    
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideTest() throws ApiException, Exception {
        initialize("putSlidesSlide", null, null);
        Slide response = null;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        response = api.putSlidesSlide(request);
        assertNotNull(response);
    }

    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSlide", "name"));
            initialize("putSlidesSlide", "name", request.getName());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlidesSlide", "slideIndex"));
            initialize("putSlidesSlide", "slideIndex", request.getSlideIndex());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlidesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidSlideDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setSlideDto((Slide)invalidizeTestValue("Slide", request.getSlideDto(), "putSlidesSlide", "slideDto"));
            initialize("putSlidesSlide", "slideDto", request.getSlideDto());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideDto", "putSlidesSlide", request.getSlideDto());
        }
        if (needAssertResponse) {
            assertResponse("slideDto", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSlide", "password"));
            initialize("putSlidesSlide", "password", request.getPassword());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSlide", "folder"));
            initialize("putSlidesSlide", "folder", request.getFolder());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideRequest request = createPutSlidesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSlide", "storage"));
            initialize("putSlidesSlide", "storage", request.getStorage());
            Slide response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlide");
        }
    }

    private PutSlidesSlideRequest createPutSlidesSlideRequest() {
        PutSlidesSlideRequest request = new PutSlidesSlideRequest();
        request.setName((String)getTestValue("String", "putSlidesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlidesSlide", "slideIndex"));
        request.setSlideDto((Slide)getTestValue("Slide", "putSlidesSlide", "slideDto"));
        request.setPassword((String)getTestValue("String", "putSlidesSlide", "password"));
        request.setFolder((String)getTestValue("String", "putSlidesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "putSlidesSlide", "storage"));
        return request;
    }
    
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("putSlidesSlideBackground", null, null);
        SlideBackground response = null;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        response = api.putSlidesSlideBackground(request);
        assertNotNull(response);
    }

    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSlideBackground", "name"));
            initialize("putSlidesSlideBackground", "name", request.getName());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlideBackground", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlidesSlideBackground", "slideIndex"));
            initialize("putSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlidesSlideBackground", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidBackgroundTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setBackground((SlideBackground)invalidizeTestValue("SlideBackground", request.getBackground(), "putSlidesSlideBackground", "background"));
            initialize("putSlidesSlideBackground", "background", request.getBackground());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "background", "putSlidesSlideBackground", request.getBackground());
        }
        if (needAssertResponse) {
            assertResponse("background", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSlideBackground", "folder"));
            initialize("putSlidesSlideBackground", "folder", request.getFolder());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlideBackground", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSlideBackground", "password"));
            initialize("putSlidesSlideBackground", "password", request.getPassword());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlideBackground", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSlideBackground", "storage"));
            initialize("putSlidesSlideBackground", "storage", request.getStorage());
            SlideBackground response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlideBackground", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlideBackground");
        }
    }

    private PutSlidesSlideBackgroundRequest createPutSlidesSlideBackgroundRequest() {
        PutSlidesSlideBackgroundRequest request = new PutSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("String", "putSlidesSlideBackground", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlidesSlideBackground", "slideIndex"));
        request.setBackground((SlideBackground)getTestValue("SlideBackground", "putSlidesSlideBackground", "background"));
        request.setFolder((String)getTestValue("String", "putSlidesSlideBackground", "folder"));
        request.setPassword((String)getTestValue("String", "putSlidesSlideBackground", "password"));
        request.setStorage((String)getTestValue("String", "putSlidesSlideBackground", "storage"));
        return request;
    }
    
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorTest() throws ApiException, Exception {
        initialize("putSlidesSlideBackgroundColor", null, null);
        SlideBackground response = null;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        response = api.putSlidesSlideBackgroundColor(request);
        assertNotNull(response);
    }

    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSlideBackgroundColor", "name"));
            initialize("putSlidesSlideBackgroundColor", "name", request.getName());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlideBackgroundColor", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlideBackgroundColor");
        }
    }
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putSlidesSlideBackgroundColor", "slideIndex"));
            initialize("putSlidesSlideBackgroundColor", "slideIndex", request.getSlideIndex());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlidesSlideBackgroundColor", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlidesSlideBackgroundColor");
        }
    }
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidColorTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setColor((String)invalidizeTestValue("String", request.getColor(), "putSlidesSlideBackgroundColor", "color"));
            initialize("putSlidesSlideBackgroundColor", "color", request.getColor());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "color", "putSlidesSlideBackgroundColor", request.getColor());
        }
        if (needAssertResponse) {
            assertResponse("color", "putSlidesSlideBackgroundColor");
        }
    }
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSlideBackgroundColor", "folder"));
            initialize("putSlidesSlideBackgroundColor", "folder", request.getFolder());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlideBackgroundColor", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlideBackgroundColor");
        }
    }
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSlideBackgroundColor", "password"));
            initialize("putSlidesSlideBackgroundColor", "password", request.getPassword());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlideBackgroundColor", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlideBackgroundColor");
        }
    }
    /**
     * Set background color for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundColorInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideBackgroundColorRequest request = createPutSlidesSlideBackgroundColorRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSlideBackgroundColor", "storage"));
            initialize("putSlidesSlideBackgroundColor", "storage", request.getStorage());
            SlideBackground response = api.putSlidesSlideBackgroundColor(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlideBackgroundColor", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlideBackgroundColor");
        }
    }

    private PutSlidesSlideBackgroundColorRequest createPutSlidesSlideBackgroundColorRequest() {
        PutSlidesSlideBackgroundColorRequest request = new PutSlidesSlideBackgroundColorRequest();
        request.setName((String)getTestValue("String", "putSlidesSlideBackgroundColor", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putSlidesSlideBackgroundColor", "slideIndex"));
        request.setColor((String)getTestValue("String", "putSlidesSlideBackgroundColor", "color"));
        request.setFolder((String)getTestValue("String", "putSlidesSlideBackgroundColor", "folder"));
        request.setPassword((String)getTestValue("String", "putSlidesSlideBackgroundColor", "password"));
        request.setStorage((String)getTestValue("String", "putSlidesSlideBackgroundColor", "storage"));
        return request;
    }
    
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeTest() throws ApiException, Exception {
        initialize("putSlidesSlideSize", null, null);
        Document response = null;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        response = api.putSlidesSlideSize(request);
        assertNotNull(response);
    }

    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putSlidesSlideSize", "name"));
            initialize("putSlidesSlideSize", "name", request.getName());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlideSize", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putSlidesSlideSize", "password"));
            initialize("putSlidesSlideSize", "password", request.getPassword());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlideSize", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putSlidesSlideSize", "storage"));
            initialize("putSlidesSlideSize", "storage", request.getStorage());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlideSize", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putSlidesSlideSize", "folder"));
            initialize("putSlidesSlideSize", "folder", request.getFolder());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlideSize", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setWidth((Integer)invalidizeTestValue("Integer", request.getWidth(), "putSlidesSlideSize", "width"));
            initialize("putSlidesSlideSize", "width", request.getWidth());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "putSlidesSlideSize", request.getWidth());
        }
        if (needAssertResponse) {
            assertResponse("width", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setHeight((Integer)invalidizeTestValue("Integer", request.getHeight(), "putSlidesSlideSize", "height"));
            initialize("putSlidesSlideSize", "height", request.getHeight());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "putSlidesSlideSize", request.getHeight());
        }
        if (needAssertResponse) {
            assertResponse("height", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidSizeTypeTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setSizeType((SizeType)invalidizeTestValue("SizeType", request.getSizeType(), "putSlidesSlideSize", "sizeType"));
            initialize("putSlidesSlideSize", "sizeType", request.getSizeType());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sizeType", "putSlidesSlideSize", request.getSizeType());
        }
        if (needAssertResponse) {
            assertResponse("sizeType", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for a presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidScaleTypeTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
        try {
            request.setScaleType((ScaleType)invalidizeTestValue("ScaleType", request.getScaleType(), "putSlidesSlideSize", "scaleType"));
            initialize("putSlidesSlideSize", "scaleType", request.getScaleType());
            Document response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleType", "putSlidesSlideSize", request.getScaleType());
        }
        if (needAssertResponse) {
            assertResponse("scaleType", "putSlidesSlideSize");
        }
    }

    private PutSlidesSlideSizeRequest createPutSlidesSlideSizeRequest() {
        PutSlidesSlideSizeRequest request = new PutSlidesSlideSizeRequest();
        request.setName((String)getTestValue("String", "putSlidesSlideSize", "name"));
        request.setPassword((String)getTestValue("String", "putSlidesSlideSize", "password"));
        request.setStorage((String)getTestValue("String", "putSlidesSlideSize", "storage"));
        request.setFolder((String)getTestValue("String", "putSlidesSlideSize", "folder"));
        request.setWidth((Integer)getTestValue("Integer", "putSlidesSlideSize", "width"));
        request.setHeight((Integer)getTestValue("Integer", "putSlidesSlideSize", "height"));
        request.setSizeType((SizeType)getTestValue("SizeType", "putSlidesSlideSize", "sizeType"));
        request.setScaleType((ScaleType)getTestValue("ScaleType", "putSlidesSlideSize", "scaleType"));
        return request;
    }
    
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlide", null, null);
        NotesSlide response = null;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        response = api.putUpdateNotesSlide(request);
        assertNotNull(response);
    }

    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putUpdateNotesSlide", "name"));
            initialize("putUpdateNotesSlide", "name", request.getName());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlide", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlide");
        }
    }
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putUpdateNotesSlide", "slideIndex"));
            initialize("putUpdateNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlide", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlide");
        }
    }
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setDto((NotesSlide)invalidizeTestValue("NotesSlide", request.getDto(), "putUpdateNotesSlide", "dto"));
            initialize("putUpdateNotesSlide", "dto", request.getDto());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlide", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlide");
        }
    }
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putUpdateNotesSlide", "password"));
            initialize("putUpdateNotesSlide", "password", request.getPassword());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlide", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlide");
        }
    }
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putUpdateNotesSlide", "folder"));
            initialize("putUpdateNotesSlide", "folder", request.getFolder());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlide", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlide");
        }
    }
    /**
     * Update notes slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putUpdateNotesSlide", "storage"));
            initialize("putUpdateNotesSlide", "storage", request.getStorage());
            NotesSlide response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlide", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlide");
        }
    }

    private PutUpdateNotesSlideRequest createPutUpdateNotesSlideRequest() {
        PutUpdateNotesSlideRequest request = new PutUpdateNotesSlideRequest();
        request.setName((String)getTestValue("String", "putUpdateNotesSlide", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putUpdateNotesSlide", "slideIndex"));
        request.setDto((NotesSlide)getTestValue("NotesSlide", "putUpdateNotesSlide", "dto"));
        request.setPassword((String)getTestValue("String", "putUpdateNotesSlide", "password"));
        request.setFolder((String)getTestValue("String", "putUpdateNotesSlide", "folder"));
        request.setStorage((String)getTestValue("String", "putUpdateNotesSlide", "storage"));
        return request;
    }
    
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShape", null, null);
        ShapeBase response = null;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        response = api.putUpdateNotesSlideShape(request);
        assertNotNull(response);
    }

    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putUpdateNotesSlideShape", "name"));
            initialize("putUpdateNotesSlideShape", "name", request.getName());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShape", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putUpdateNotesSlideShape", "slideIndex"));
            initialize("putUpdateNotesSlideShape", "slideIndex", request.getSlideIndex());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShape", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putUpdateNotesSlideShape", "path"));
            initialize("putUpdateNotesSlideShape", "path", request.getPath());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShape", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putUpdateNotesSlideShape", "shapeIndex"));
            initialize("putUpdateNotesSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShape", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setDto((ShapeBase)invalidizeTestValue("ShapeBase", request.getDto(), "putUpdateNotesSlideShape", "dto"));
            initialize("putUpdateNotesSlideShape", "dto", request.getDto());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShape", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putUpdateNotesSlideShape", "password"));
            initialize("putUpdateNotesSlideShape", "password", request.getPassword());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShape", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putUpdateNotesSlideShape", "folder"));
            initialize("putUpdateNotesSlideShape", "folder", request.getFolder());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShape", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShape");
        }
    }
    /**
     * Update shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putUpdateNotesSlideShape", "storage"));
            initialize("putUpdateNotesSlideShape", "storage", request.getStorage());
            ShapeBase response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShape", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShape");
        }
    }

    private PutUpdateNotesSlideShapeRequest createPutUpdateNotesSlideShapeRequest() {
        PutUpdateNotesSlideShapeRequest request = new PutUpdateNotesSlideShapeRequest();
        request.setName((String)getTestValue("String", "putUpdateNotesSlideShape", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShape", "slideIndex"));
        request.setPath((String)getTestValue("String", "putUpdateNotesSlideShape", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShape", "shapeIndex"));
        request.setDto((ShapeBase)getTestValue("ShapeBase", "putUpdateNotesSlideShape", "dto"));
        request.setPassword((String)getTestValue("String", "putUpdateNotesSlideShape", "password"));
        request.setFolder((String)getTestValue("String", "putUpdateNotesSlideShape", "folder"));
        request.setStorage((String)getTestValue("String", "putUpdateNotesSlideShape", "storage"));
        return request;
    }
    
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShapeParagraph", null, null);
        Paragraph response = null;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        response = api.putUpdateNotesSlideShapeParagraph(request);
        assertNotNull(response);
    }

    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putUpdateNotesSlideShapeParagraph", "name"));
            initialize("putUpdateNotesSlideShapeParagraph", "name", request.getName());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShapeParagraph", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putUpdateNotesSlideShapeParagraph", "slideIndex"));
            initialize("putUpdateNotesSlideShapeParagraph", "slideIndex", request.getSlideIndex());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShapeParagraph", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putUpdateNotesSlideShapeParagraph", "path"));
            initialize("putUpdateNotesSlideShapeParagraph", "path", request.getPath());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShapeParagraph", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putUpdateNotesSlideShapeParagraph", "shapeIndex"));
            initialize("putUpdateNotesSlideShapeParagraph", "shapeIndex", request.getShapeIndex());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShapeParagraph", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "putUpdateNotesSlideShapeParagraph", "paragraphIndex"));
            initialize("putUpdateNotesSlideShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putUpdateNotesSlideShapeParagraph", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setDto((Paragraph)invalidizeTestValue("Paragraph", request.getDto(), "putUpdateNotesSlideShapeParagraph", "dto"));
            initialize("putUpdateNotesSlideShapeParagraph", "dto", request.getDto());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShapeParagraph", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putUpdateNotesSlideShapeParagraph", "password"));
            initialize("putUpdateNotesSlideShapeParagraph", "password", request.getPassword());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShapeParagraph", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putUpdateNotesSlideShapeParagraph", "folder"));
            initialize("putUpdateNotesSlideShapeParagraph", "folder", request.getFolder());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShapeParagraph", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShapeParagraph");
        }
    }
    /**
     * Update paragraph properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putUpdateNotesSlideShapeParagraph", "storage"));
            initialize("putUpdateNotesSlideShapeParagraph", "storage", request.getStorage());
            Paragraph response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShapeParagraph", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShapeParagraph");
        }
    }

    private PutUpdateNotesSlideShapeParagraphRequest createPutUpdateNotesSlideShapeParagraphRequest() {
        PutUpdateNotesSlideShapeParagraphRequest request = new PutUpdateNotesSlideShapeParagraphRequest();
        request.setName((String)getTestValue("String", "putUpdateNotesSlideShapeParagraph", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapeParagraph", "slideIndex"));
        request.setPath((String)getTestValue("String", "putUpdateNotesSlideShapeParagraph", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapeParagraph", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapeParagraph", "paragraphIndex"));
        request.setDto((Paragraph)getTestValue("Paragraph", "putUpdateNotesSlideShapeParagraph", "dto"));
        request.setPassword((String)getTestValue("String", "putUpdateNotesSlideShapeParagraph", "password"));
        request.setFolder((String)getTestValue("String", "putUpdateNotesSlideShapeParagraph", "folder"));
        request.setStorage((String)getTestValue("String", "putUpdateNotesSlideShapeParagraph", "storage"));
        return request;
    }
    
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShapePortion", null, null);
        Portion response = null;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        response = api.putUpdateNotesSlideShapePortion(request);
        assertNotNull(response);
    }

    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setName((String)invalidizeTestValue("String", request.getName(), "putUpdateNotesSlideShapePortion", "name"));
            initialize("putUpdateNotesSlideShapePortion", "name", request.getName());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShapePortion", request.getName());
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setSlideIndex((Integer)invalidizeTestValue("Integer", request.getSlideIndex(), "putUpdateNotesSlideShapePortion", "slideIndex"));
            initialize("putUpdateNotesSlideShapePortion", "slideIndex", request.getSlideIndex());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShapePortion", request.getSlideIndex());
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "putUpdateNotesSlideShapePortion", "path"));
            initialize("putUpdateNotesSlideShapePortion", "path", request.getPath());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShapePortion", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setShapeIndex((Integer)invalidizeTestValue("Integer", request.getShapeIndex(), "putUpdateNotesSlideShapePortion", "shapeIndex"));
            initialize("putUpdateNotesSlideShapePortion", "shapeIndex", request.getShapeIndex());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShapePortion", request.getShapeIndex());
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setParagraphIndex((Integer)invalidizeTestValue("Integer", request.getParagraphIndex(), "putUpdateNotesSlideShapePortion", "paragraphIndex"));
            initialize("putUpdateNotesSlideShapePortion", "paragraphIndex", request.getParagraphIndex());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putUpdateNotesSlideShapePortion", request.getParagraphIndex());
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setPortionIndex((Integer)invalidizeTestValue("Integer", request.getPortionIndex(), "putUpdateNotesSlideShapePortion", "portionIndex"));
            initialize("putUpdateNotesSlideShapePortion", "portionIndex", request.getPortionIndex());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "putUpdateNotesSlideShapePortion", request.getPortionIndex());
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setDto((Portion)invalidizeTestValue("Portion", request.getDto(), "putUpdateNotesSlideShapePortion", "dto"));
            initialize("putUpdateNotesSlideShapePortion", "dto", request.getDto());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShapePortion", request.getDto());
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setPassword((String)invalidizeTestValue("String", request.getPassword(), "putUpdateNotesSlideShapePortion", "password"));
            initialize("putUpdateNotesSlideShapePortion", "password", request.getPassword());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShapePortion", request.getPassword());
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setFolder((String)invalidizeTestValue("String", request.getFolder(), "putUpdateNotesSlideShapePortion", "folder"));
            initialize("putUpdateNotesSlideShapePortion", "folder", request.getFolder());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShapePortion", request.getFolder());
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShapePortion");
        }
    }
    /**
     * Update portion properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideShapePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
        try {
            request.setStorage((String)invalidizeTestValue("String", request.getStorage(), "putUpdateNotesSlideShapePortion", "storage"));
            initialize("putUpdateNotesSlideShapePortion", "storage", request.getStorage());
            Portion response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShapePortion", request.getStorage());
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShapePortion");
        }
    }

    private PutUpdateNotesSlideShapePortionRequest createPutUpdateNotesSlideShapePortionRequest() {
        PutUpdateNotesSlideShapePortionRequest request = new PutUpdateNotesSlideShapePortionRequest();
        request.setName((String)getTestValue("String", "putUpdateNotesSlideShapePortion", "name"));
        request.setSlideIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapePortion", "slideIndex"));
        request.setPath((String)getTestValue("String", "putUpdateNotesSlideShapePortion", "path"));
        request.setShapeIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapePortion", "shapeIndex"));
        request.setParagraphIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapePortion", "paragraphIndex"));
        request.setPortionIndex((Integer)getTestValue("Integer", "putUpdateNotesSlideShapePortion", "portionIndex"));
        request.setDto((Portion)getTestValue("Portion", "putUpdateNotesSlideShapePortion", "dto"));
        request.setPassword((String)getTestValue("String", "putUpdateNotesSlideShapePortion", "password"));
        request.setFolder((String)getTestValue("String", "putUpdateNotesSlideShapePortion", "folder"));
        request.setStorage((String)getTestValue("String", "putUpdateNotesSlideShapePortion", "storage"));
        return request;
    }
    
    /**
     * Check if storage exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void storageExistsTest() throws ApiException, Exception {
        initialize("storageExists", null, null);
        StorageExist response = null;
        StorageExistsRequest request = createStorageExistsRequest();
        response = api.storageExists(request);
        assertNotNull(response);
    }

    /**
     * Check if storage exists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void storageExistsInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        StorageExistsRequest request = createStorageExistsRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "storageExists", "storageName"));
            initialize("storageExists", "storageName", request.getStorageName());
            StorageExist response = api.storageExists(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "storageExists", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "storageExists");
        }
    }

    private StorageExistsRequest createStorageExistsRequest() {
        StorageExistsRequest request = new StorageExistsRequest();
        request.setStorageName((String)getTestValue("String", "storageExists", "storageName"));
        return request;
    }
    
    /**
     * Upload file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException, Exception {
        initialize("uploadFile", null, null);
        FilesUploadResult response = null;
        UploadFileRequest request = createUploadFileRequest();
        response = api.uploadFile(request);
        assertNotNull(response);
    }

    /**
     * Upload file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        UploadFileRequest request = createUploadFileRequest();
        try {
            request.setPath((String)invalidizeTestValue("String", request.getPath(), "uploadFile", "path"));
            initialize("uploadFile", "path", request.getPath());
            FilesUploadResult response = api.uploadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "uploadFile", request.getPath());
        }
        if (needAssertResponse) {
            assertResponse("path", "uploadFile");
        }
    }
    /**
     * Upload file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileInvalidFileTest() throws ApiException {
        Boolean needAssertResponse = false;
        UploadFileRequest request = createUploadFileRequest();
        try {
            request.setFile((byte[])invalidizeTestValue("byte[]", request.getFile(), "uploadFile", "file"));
            initialize("uploadFile", "file", request.getFile());
            FilesUploadResult response = api.uploadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "file", "uploadFile", request.getFile());
        }
        if (needAssertResponse) {
            assertResponse("file", "uploadFile");
        }
    }
    /**
     * Upload file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileInvalidStorageNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        UploadFileRequest request = createUploadFileRequest();
        try {
            request.setStorageName((String)invalidizeTestValue("String", request.getStorageName(), "uploadFile", "storageName"));
            initialize("uploadFile", "storageName", request.getStorageName());
            FilesUploadResult response = api.uploadFile(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storageName", "uploadFile", request.getStorageName());
        }
        if (needAssertResponse) {
            assertResponse("storageName", "uploadFile");
        }
    }

    private UploadFileRequest createUploadFileRequest() {
        UploadFileRequest request = new UploadFileRequest();
        request.setPath((String)getTestValue("String", "uploadFile", "path"));
        request.setFile((byte[])getTestValue("byte[]", "uploadFile", "file"));
        request.setStorageName((String)getTestValue("String", "uploadFile", "storageName"));
        return request;
    }
    
}
