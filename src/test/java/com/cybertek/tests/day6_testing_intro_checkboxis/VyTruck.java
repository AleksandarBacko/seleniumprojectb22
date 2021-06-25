package com.cybertek.tests.day6_testing_intro_checkboxis;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VyTruck {

    @BeforeMethod
    public  void setup(){
        System.out.println("Verify that Truck Driver user is able to login to VyTrack website with valid Username and Password AND \"Remember me on this computer\" is checked");
    }

    @Test
    public void taskVyTruck1() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");

        WebElement login = driver.findElement(By.id("prependedInput"));
        login.sendKeys("user1");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        WebElement checkBox=driver.findElement(By.className("custom-checkbox__icon"));
        checkBox.click();
        checkBox.isSelected();

        WebElement loginButton2 = driver.findElement(By.id("_submit"));
        loginButton2.click();


        String current = driver.getTitle();
        String Expected = "Dashboard";

        Assert.assertEquals(current,Expected);
//        if (current.equals(Expected)) {
//            System.out.println("Title verification passed");
//            driver.close();
//        } else {
//            System.out.println("Title verification failed");
//            driver.navigate().back();
//
//        }
    }
    @AfterMethod
    public  void setup1(){
        System.out.println("Verify that Truck Driver user is able to login to VyTrack website with valid Username and Password AND \"Remember me on this computer\" is NOT checked");
    }

    @Test
    public void taskVyTruck2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");

        WebElement login = driver.findElement(By.id("prependedInput"));
        login.sendKeys("user1");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

//        WebElement checkBox=driver.findElement(By.className("custom-checkbox__icon"));
//        checkBox.click();
//        checkBox.isSelected();

        WebElement loginButton2 = driver.findElement(By.id("_submit"));
        loginButton2.click();


        String current1 = driver.getTitle();
        String Expected1 = "Dashboard";

        Assert.assertEquals(current1,Expected1);



    }


}
