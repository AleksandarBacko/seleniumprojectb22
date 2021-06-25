package com.cybertek.tests.day7_alerts_iFrames_windows;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VYTruck {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

        WebElement login = driver.findElement(By.id("prependedInput"));
        login.sendKeys("user1");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement loginButton2 = driver.findElement(By.id("_submit"));
        loginButton2.click();
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement drop1=driver.findElement(By.xpath("//div[@id='main-menu']/ul/li/a"));
        drop1.click();
        Thread.sleep(3000);
        WebElement vi=driver.findElement(By.linkText("Vehicles"));
        vi.click();
        Thread.sleep(3000);
        WebElement licenseCLick = driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']"));
        licenseCLick.click();
        Thread.sleep(3000);
        WebElement addEvent = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
        addEvent.click();


        Thread.sleep(3000);
        WebElement text = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        text.sendKeys("group 1 practice");
        driver.switchTo().frame(0);
        WebElement dis = driver.findElement(By.xpath("//body[@id='tinymce']"));
        dis.sendKeys("group 1 practice");
        driver.switchTo().parentFrame();
//        WebElement drop = driver.findElement(By.xpath("//input[@id='s2id_autogen3']"));
//        drop.sendKeys("New Guest"+ Keys.ENTER);
//        drop.click();
        Thread.sleep(4000);
        WebElement newG = driver.findElement(By.xpath("//input[@type='checkbox']"));
        newG.click();
        WebElement textem = driver.findElement(By.name("oro_calendar_event_form[organizerDisplayName]"));
        textem.sendKeys("dnasdpsdnas");
        WebElement ematex = driver.findElement(By.name("oro_calendar_event_form[organizerEmail]"));
        ematex.sendKeys("dasd.@gmil.com");

        WebElement saveAndSubmitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        saveAndSubmitButton.click();



    }
    }

