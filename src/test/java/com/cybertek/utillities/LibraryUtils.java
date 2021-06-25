package com.cybertek.utillities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {
    public static void loginToLibrary(WebDriver driver){
        WebElement username=driver.findElement(By.xpath("//input[@id='inputEmail']"));
        username.sendKeys("student11@library");
        WebElement password=driver.findElement(By.xpath("//input[@id='inputPassword']"));
        password.sendKeys("tScBPCUr");
        WebElement clickLog=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        clickLog.click();
    }
}
