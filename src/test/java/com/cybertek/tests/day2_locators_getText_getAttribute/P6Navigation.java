package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(2000);

        driver.findElement(By.className("nav-link")).click();

        String exp = "Practice";
        String ecut = driver.getTitle();
        if (ecut.equals(exp)) {
            System.out.println("Passed");
        } else {
            System.out.println("Pased");
        }
    }
}
