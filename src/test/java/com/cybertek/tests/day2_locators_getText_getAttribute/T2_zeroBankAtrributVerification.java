package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_zeroBankAtrributVerification {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://zero.webappsecurity.com/login.html");
//
//        String expectedLinkText="Zero Bank";
//        WebElement zeroBankLeft=driver.findElement(By.className("brand"));
//
//        String actualLinkText = zeroBankLeft.getText();
//        if(actualLinkText.equals(expectedLinkText)){
//            System.out.println("link text verification passed");
//        }else{
//            System.out.println("link text verification filed");
//
//        }
//
//        String actualLink=zeroBankLeft.getAttribute("href");
//        System.out.println(actualLink);
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //LOCATE THE LINK AND STORE INSIDE OF WebElement

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //All of the below is locating same web element
        //WebElement zeroBankLink = driver.findElement(By.linkText("Zero Bank"));
        //WebElement zeroBankLink = driver.findElement(By.tagName("a"));

        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();
        //driver.findElement(By.className("brand")).getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED!");
        }else{
            System.out.println("Link text verification FAILED!");
        }

        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedInHrefValue = "index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");

        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("HREF attribute value verification PASSED!");
        }else {
            System.out.println("HREF attribute value verification FAILED!!!");
        }

        //System.out.println("actualHrefValue = " + actualHrefValue);


    }
}
