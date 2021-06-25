package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCBASICloginAuthrntication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String actual=driver.getTitle();
        String expected="Web Orders Login";
        if (actual.equals(expected)) {
            System.out.println("title verification passed");
        }else  {
            System.out.println("title verification failed");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        Thread.sleep(3000);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(3000);
        driver.findElement((By.name("ctl00$MainContent$login_button"))).click();
        Thread.sleep(3000);
        String accT=driver.getTitle();
        String exp="Web Orders";
        if (accT.equals(exp)){
            System.out.println("title verification passed");
        }else   {
            System.out.println("title verification failed");
        }
    }
}
