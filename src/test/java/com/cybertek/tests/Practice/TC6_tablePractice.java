package com.cybertek.tests.Practice;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6_tablePractice {
    WebDriver driver;

    @BeforeMethod
       public void setupMethod(){
        String url= ConfigurationReader.getProperty("urlREgistration");
        String browser=ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver(browser);
        driver.get(url);
    }
    @Test
        public void  Cybertek_registration_form_confirmation(){
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Aleksandar");
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Backovic");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("backo94");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("aleksandarbackovicfpim@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("aleksandar94");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("805-666-8888");
        WebElement male=driver.findElement(By.xpath("//input[@value='male']"));
        male.click();
        WebElement Birthday=driver.findElement(By.xpath("//input[@name='birthday']"));
        Birthday.sendKeys("11/23/1994");

        WebElement selectOffice=driver.findElement(By.xpath("//select[@name='department']"));
        Select selcOffice=new Select(selectOffice);
        selcOffice.selectByVisibleText("Department of Engineering");

        WebElement selectjobType=driver.findElement(By.xpath("//select[@name='job_title']"));
        Select selJob=new Select(selectjobType);
        selJob.selectByVisibleText("SDET");

        WebElement java=driver.findElement(By.xpath("//input[@value='java']"));
        java.click();
        WebElement submite=driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        submite.click();

        WebElement expectedElement=driver.findElement(By.xpath("//div/p"));
        expectedElement.isDisplayed();
        Assert.assertEquals(expectedElement.getText(),"You've successfully completed registration!");


    }
}
