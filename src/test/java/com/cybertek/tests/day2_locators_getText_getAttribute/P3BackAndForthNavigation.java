package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3BackAndForthNavigation {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
//        driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.partialLinkText("mail")).click();
        String expected ="Gmail";
        String actual=driver.getTitle() ;
        if(actual.contains(expected)){
            driver.navigate().back();
        }else {
            driver.navigate().refresh();
        }
        String gog= driver.getTitle();
        String gogback="Google";
        if (gogback.equals(gog)){
            System.out.println("title verification passed");
        }else {
            System.out.println("title verification fail");
        }
        driver.close();
    }
}
