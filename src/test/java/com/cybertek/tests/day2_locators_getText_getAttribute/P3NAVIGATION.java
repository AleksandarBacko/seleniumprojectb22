package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3NAVIGATION {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
