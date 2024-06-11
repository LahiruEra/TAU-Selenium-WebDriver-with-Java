package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Lahiru\\Pictures\\sssss.jpg");
        assertEquals(uploadPage.getUploadedFiles(), "sssss.jpg", "Uploaded files incorrect");
    }
}
