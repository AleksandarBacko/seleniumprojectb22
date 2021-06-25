package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFacebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        String actual=driver.getTitle();
        String expected="Facebook - Log In or Sign Up";
        if (expected.equals(actual)){
            System.out.println("title verification facebook passed");
        }else{
            System.out.println("title verification facebook failed");
        }
        driver.findElement(By.name("email")).sendKeys("erf");
        driver.findElement(By.name("pass")).sendKeys("f8f43r");
        driver.findElement(By.name("login")).click();

        String actualPG=driver.getTitle();
        String expectedPG="Log into Facebook";

    }
}
