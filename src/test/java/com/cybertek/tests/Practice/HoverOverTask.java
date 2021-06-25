package com.cybertek.tests.Practice;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverTask {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hoverOverTaskUrl"));

        WebElement user1=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[3]"));

        WebElement userText1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement userText2= Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement userText3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));


        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(user1).perform();
        Assert.assertTrue(userText1.isDisplayed(),"text on user1 is no displayed");
        BrowserUtils.sleep(3);

        actions.moveToElement(user2).perform();
        Assert.assertTrue(userText2.isDisplayed(),"text on user2 is no displayed");

        actions.moveToElement(user3).perform();
        Assert.assertTrue(userText3.isDisplayed(),"text on user3 is no displayed");
    }
}
