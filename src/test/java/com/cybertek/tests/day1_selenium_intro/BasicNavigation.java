package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();//otvaramo browzer

        driver.get("https://www.tesla.com");// idemo na specific link https://tesla.com mozemo da napisemo ovako isto

        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

//        Thread.sleep(3000);//usporava za 3 sec
        driver.navigate().back();//idemo nazad na stranici

//        Thread.sleep(3000);//usporava za 3 sec
        driver.navigate().forward();//unapred strana
        driver.navigate().refresh();//rifres stranu
//        Thread.sleep(3000);
        driver.navigate().to("https://google.com");

        System.out.println("current title: "+driver.getTitle());//daje nam title printan

        System.out.println(driver.getCurrentUrl());// daje nam url u ovom slucaju printa https://www.google.com/


        driver.manage().window().maximize();

        driver.close();//zatvara bravzer i zatvara samo 1 tab ili jedan bravzer

        //driver.quit();//zatvorice sve bravzere i sve tabove



    }
}
