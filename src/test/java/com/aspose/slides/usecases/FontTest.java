// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="MergeTest.java">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.*;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FontTest extends ApiTest {
    @Test
    public void fontsGetTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = api.getFonts(fileName, password, folderName, null);
        assertEquals(3, response.getList().size());
    }

    @Test
    public void fontsGetOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        FontsData response = api.getFontsOnline(file, password);
        assertEquals(3, response.getList().size());
    }

    @Test
    public void fontEmbeddedSetTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = api.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertNull(response.getList().get(0).isIsEmbedded());
        assertEquals(true, response.getList().get(1).isIsEmbedded());
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void fontEmbeddedSetOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File response = api.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < response.length());
    }

    @Test
    public void fontSetEmbeddedFromRequestTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        byte[] fontFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fontFileName));
        FontsData response = api.setEmbeddedFontFromRequest(fontFile, fileName, false, password, folderName, null);
        assertNull(response.getList().get(0).isIsEmbedded());
        assertEquals(true, response.getList().get(1).isIsEmbedded());
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        assertEquals(c_fontName, response.getList().get(2).getFontName());
    }

    @Test
    public void fontSetEmbeddedFromRequestOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        byte[] fontFile = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fontFileName));
        File response = api.setEmbeddedFontFromRequestOnline(file, fontFile, false, password);
        assertTrue(file.length < response.length());
    }

    @Test
    public void fontEmbeddedCompressTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = api.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        //In a real world example, you would rather get the same result by calling SetEmbeddedFont with onlyUsed = true
        api.compressEmbeddedFonts(fileName, password, folderName, null);
    }

    @Test
    public void fontEmbeddedCompressOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File responseEmbedded = api.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < responseEmbedded.length());

        FileInputStream fl = new FileInputStream(responseEmbedded);
        byte[] arr = new byte[(int)responseEmbedded.length()];
        fl.read(arr);
        fl.close();
        //In a real world example, you would rather get the same result by calling SetEmbeddedFontOnline with onlyUsed = true
        File responseCompressed = api.compressEmbeddedFontsOnline(arr, password);
        assertTrue(responseCompressed.length() < responseEmbedded.length());
    }

    @Test
    public void fontEmbeddedDeleteTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = api.setEmbeddedFont(fileName, c_fontName, false, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        response = api.deleteEmbeddedFont(fileName, c_fontName, password, folderName, null);
        assertEquals(null, response.getList().get(2).isIsEmbedded());
    }

    @Test
    public void fontEmbeddedDeleteOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File responseEmbedded = api.setEmbeddedFontOnline(file, c_fontName, false, password, null);
        assertTrue(file.length < responseEmbedded.length());

        FileInputStream fl = new FileInputStream(responseEmbedded);
        byte[] arr = new byte[(int)responseEmbedded.length()];
        fl.read(arr);
        fl.close();
        File responseDeleted = api.deleteEmbeddedFontOnline(arr, c_fontName, password);
        assertTrue(responseDeleted.length() < responseEmbedded.length());
    }

    @Test
    public void fontReplaceTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        FontsData response = api.replaceFont(fileName, c_fontName, c_fontNameTimes, true, password, folderName, null, null);
        assertEquals(true, response.getList().get(2).isIsEmbedded());
        assertEquals(c_fontNameTimes, response.getList().get(2).getFontName());
    }

    @Test
    public void fontReplaceOnlineTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + fileName));
        File response = api.replaceFontOnline(file, c_fontName, c_fontNameTimes, true, password, null);
        assertTrue(file.length < response.length());
    }

    @Test
    public void fontSubstitutionTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);

        FontSubstRule rule1 = new FontSubstRule();
        rule1.setSourceFont("Arial");
        rule1.setTargetFont(c_fontNameTimes);
        rule1.setNotFoundOnly(false);
        FontSubstRule rule2 = new FontSubstRule();
        rule2.setSourceFont(c_fontName);
        rule2.setTargetFont(c_fontNameTimes);
        ArrayList<FontSubstRule> rules = new ArrayList<FontSubstRule>();
        rules.add(rule1);
        rules.add(rule2);

        ImageExportOptions exportOptions = new ImageExportOptions();
        exportOptions.setFontSubstRules(rules);

        File response = api.downloadPresentation(fileName, ExportFormat.PNG, exportOptions, password, folderName, null, null, null);
        assertTrue(response.length() > 0);
    }

    private final String c_fontName = "Calibri";
    private final String c_fontNameTimes = "Times New Roman";
    private final String c_fontFileName = "calibri.ttf";
}
