package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {



//        CSS Practice
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #3: Amazon link number verification
//        1. Open Chrome browser
//        2. Go to https://www.amazon.com/
//        3. Enter search term (use cssSelector to locate search box)
//        4. Verify title contains search term

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        WebElement amazonSearchBar=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("tracer 900 protecter"+ Keys.ENTER);

        String expectedTitle="Amazon.com : tracer 900 protecter";
        String actualTitle=driver.getTitle();
//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("Titel verification passed");
//        }else {
//            System.out.println("Titel verification failed");
//        }
        WebDriverFactory.titleVerification(expectedTitle,actualTitle);

    }
}
