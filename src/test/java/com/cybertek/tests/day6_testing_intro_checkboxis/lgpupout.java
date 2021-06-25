package com.cybertek.tests.day6_testing_intro_checkboxis;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class lgpupout {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.lg.com/us/solar");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement lgpup=driver.findElement(By.className("css-r06ghi ekxwqh01"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        lgpup.click();
    }
}
