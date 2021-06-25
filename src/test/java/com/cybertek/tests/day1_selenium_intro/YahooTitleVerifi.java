package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerifi {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://yahoo.com");

        String actuale = driver.getTitle();
        if (actuale.equals("Yahoo32")){
            System.out.println("pass");
        }else {
            driver.get("https://google.com");
            System.out.println("fail");
        }
        driver.close();

    }
}
