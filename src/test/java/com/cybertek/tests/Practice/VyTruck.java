package com.cybertek.tests.Practice;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VyTruck {
    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("VYtruck"));

    }

    @Test
    public void test(){

        WebElement username=ElementChaser.lookForElement(Driver.getDriver(),"//input[@name='_username']");
        username.sendKeys(ConfigurationReader.getProperty("VYusername"));
        WebElement pass=ElementChaser.lookForElement(Driver.getDriver(),"//input[@name='_password']");
        pass.sendKeys(ConfigurationReader.getProperty("VYpass"));
        ElementChaser.lookForElement(Driver.getDriver(),"//button[@name='_submit']").click();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(ElementChaser.lookForElement(Driver.getDriver(),"//span[@class='title title-level-1']")).perform();
        ElementChaser.lookForElement(Driver.getDriver(),"//span[@class='title title-level-2']").click();
        ElementChaser.lookForElement(Driver.getDriver(),"//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']").isDisplayed();
        BrowserUtils.sleep(3);
        ElementChaser.lookForElement(Driver.getDriver(),"//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']").click();
        WebElement ExportGrid=ElementChaser.lookForElement(Driver.getDriver(),"//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']");
        System.out.println("X position is = " + ExportGrid.getLocation().getX());
        System.out.println("Y position is = " + ExportGrid.getLocation().getY());

        int xPosition=ExportGrid.getLocation().getX();
        int yPosition=ExportGrid.getLocation().getY();
        Assert.assertTrue(xPosition<300,"Is not on left side");
        Assert.assertTrue(yPosition<300,"is in second half of page");
    }
}
class ElementChaser{
    public static WebElement lookForElement(WebDriver driver,String location){
        WebElement element=driver.findElement(By.xpath(location));
        return element;
    }
}
