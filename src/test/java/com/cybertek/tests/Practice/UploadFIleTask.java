package com.cybertek.tests.Practice;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFIleTask {
    @Test
    public void Test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("uploadFileUrl"));

        String path="C:\\Users\\backo\\Desktop\\200896649_240599294116898_4034881604417346963_n.jpg";

        ElementChaser.lookForElement(Driver.getDriver(),"//input[@id='file-upload']").sendKeys(path);
        ElementChaser.lookForElement(Driver.getDriver(),"//input[@id='file-submit']").click();

        String expected="File Uploaded!";
        Assert.assertEquals(expected,ElementChaser.lookForElement(Driver.getDriver(),"//h3").getText());


    }
}
