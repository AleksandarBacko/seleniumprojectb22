package com.cybertek.tests.Practice;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTaskUrl {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("rightClickTaskUrl"));
        WebElement box=Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(box).contextClick().perform();

        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
        Driver.closeDriver();
    }
}
