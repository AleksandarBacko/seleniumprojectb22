package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {

//
//    TC-6 : Window Handle practice
//1. Create new test and make set ups
//2. Go to : https://www.amazon.com/
//            3. Copy paste the lines from below into your class
//4. Create a logic to switch to the tab where Etsy.com is open
//5. Assert: Title contains “Etsy”
//    Lines to be pasted:







    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

    }
    @Test
    public void multiple_window_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        for (String windowHandle : driver.getWindowHandles()) {//////iter tab driver.getWindowHandles()
            driver.switchTo().window(windowHandle);
            System.out.println("Title in curet page: "+driver.getTitle());
            if (driver.getTitle().contains("Etsy")){
                break;
            }
        }
        String expected="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actual=driver.getTitle();
        Assert.assertEquals(expected,actual);
    }
}
