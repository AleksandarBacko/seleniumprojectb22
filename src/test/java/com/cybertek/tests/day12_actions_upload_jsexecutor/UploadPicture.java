package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPicture {
    @Test
    public void upload_test(){
        //1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2. Find some small file from your computer, and get the path of it.

        String path="C:\\Users\\backo\\Desktop\\200896649_240599294116898_4034881604417346963_n.jpg";
        //3. Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));


        BrowserUtils.sleep(3);
        chooseFile.sendKeys(path);
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page

        WebElement fileUplodedMessage=Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUplodedMessage.isDisplayed());

        Driver.closeDriver();
    }
}
