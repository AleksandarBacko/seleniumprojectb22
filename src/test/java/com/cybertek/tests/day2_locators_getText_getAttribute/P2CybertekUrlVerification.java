package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2CybertekUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/");
        String url="cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(url)){
            System.out.println("URL verification Passed!");
        }else{
            System.out.println("URL verification not Passed!");
        }


        String expectedTitle="Practice";
        String acctualTitle= driver.getTitle();

        if (acctualTitle.equals(expectedTitle)){
            System.out.println("title verification passed");
        }else {
            System.out.println("title verification no passed");
        }
    }

}
