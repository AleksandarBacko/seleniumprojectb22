package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC_finfelements {
    public static void main(String[] args) {
        /**C #0: FINDELEMENTS
         1. Open Chrome browser
         2. Go to http://practice.cybertekschool.com/forgot_password
         3. Print out the texts of all links
         4. Print out how many total link */

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        //if a web element is not found this will wait UP TO given secounds
        //if web element is located before 15 secounds it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement each : links) {
            System.out.println(each.getText());
        }


    }
}
