package com.cybertek.tests.day6_testing_intro_checkboxis;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice {
    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.loropiana.com");

        WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();

        WebElement woomen=driver.findElement(By.linkText("Woman"));
        System.out.println( woomen.getText());
        woomen.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement clach=driver.findElement(By.cssSelector("a[href='https://us.loropiana.com/en/c/woman/leather-goods/totes']"));
        clach.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement bag=driver.findElement(By.cssSelector("span[class='t-h3']"));
        bag.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement addTocart=driver.findElement(By.cssSelector("button[class='main-button t-cta sticky-mobile gold']"));
        addTocart.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement process=driver.findElement(By.cssSelector("button[aria-label='proceed to checkout']"));
        process.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement email=driver.findElement(By.cssSelector("input[id='j_username']"));
        email.sendKeys("batch22@yahoo.com");
        WebElement pass=driver.findElement(By.cssSelector("input[id='j_password']"));
        pass.sendKeys("Feb21@2021");

        WebElement log=driver.findElement(By.cssSelector("button[aria-label='login']"));
        log.click();

        driver.close();
    }
}
