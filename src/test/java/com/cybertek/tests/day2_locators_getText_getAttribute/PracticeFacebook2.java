package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFacebook2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://www.facebook.com");

        String acH=driver.findElement(By.tagName("h2")).getText();
        String exH="Connect with friends and the world around you on Facebook.";
        if(acH.equals(exH)){
            System.out.println("header verification passed");
        }else{
            System.out.println("header verification failed");
        }
        WebElement dr=driver.findElement(By.className("_8esh"));
        String ac=dr.getAttribute("href");
        String expe="registration_form";
        if(ac.contains(expe)){
            System.out.println("Creat a page verification passed");

        }else {
            System.out.println("Creat a page verification failed");
        }
    }
}
