package com.cybertek.tests.Practice;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DubleClickTask {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("doubleCliclTask"));
        WebElement frame2=Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']"));
        Driver.getDriver().switchTo().frame(frame2);
        WebElement text=Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(text).perform();
        actions.doubleClick().perform();

        WebElement colorRed=Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));
        Assert.assertTrue(colorRed.isDisplayed(),"color red is not displayed");
        Driver.closeDriver();

    }
}
