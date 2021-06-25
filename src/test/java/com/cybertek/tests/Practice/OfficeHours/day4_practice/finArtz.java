package com.cybertek.tests.Practice.OfficeHours.day4_practice;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.OfficeHoursUtils;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class finArtz {

    WebDriver driver;
    String browser= ConfigurationReader.getProperty("browser");
    String addUserUrl=ConfigurationReader.getProperty("finartzAdduserUrl");
    String loginUrl=ConfigurationReader.getProperty("finartzLoginUrl");

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void loginTests(){
        //adding user test
        OfficeHoursUtils.addUserTest(driver,addUserUrl);
        BrowserUtils.sleep(3);

        //positive login test
        Assert.assertTrue(OfficeHoursUtils.positiveLoginTest(driver,loginUrl));

        Assert.assertTrue(OfficeHoursUtils.negativeLoginTest(driver,loginUrl));


    }
    @Test
    public void textTests(){
        driver.get(loginUrl);
        String expeectedTab="Login example page to test the PHP MySQL online system";
        Assert.assertEquals(expeectedTab,driver.getTitle());

        String actualHeader = driver.findElement(By.xpath("(//strong)[3]")).getText();
        String expectedHeader = "4. Login";
        Assert.assertEquals(actualHeader,expectedHeader);

        String expectedFuunyText = "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";
        String actualText = driver.findElement(By.xpath("//p[contains(.,'login details you added')]")).getText();
        Assert.assertEquals(actualText,expectedFuunyText);
    }
    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(3);
        driver.close();
    }
}
