package com.cybertek.tests.Practice;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DugAndDropTask {
    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("drugAndDropTaskUrl"));

        WebElement buble=Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop=Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(buble).clickAndHold().perform();
        actions.moveToElement(drop).release().perform();
        Assert.assertEquals(drop.getText(),"You did great!");

    }
}
