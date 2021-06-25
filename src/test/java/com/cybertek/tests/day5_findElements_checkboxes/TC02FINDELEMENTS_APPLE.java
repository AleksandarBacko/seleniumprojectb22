package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC02FINDELEMENTS_APPLE {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts() .implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
        WebElement apple=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']"));
        apple.click();

        List<WebElement> links =driver.findElements(By.tagName("a"));
        for (WebElement each: links){
            System.out.println(each.getText());
        }

        int countNoText=0;
        int countWithText=0;
        for (WebElement each:links){
            if(each.getText().isEmpty()){
                countNoText++;
            }else {
                countWithText++;
            }
        }
        System.out.println("Number of links with out of text = "+countNoText);
        System.out.println("Number of links with  text = "+countWithText);
        System.out.println("Total number of links = "+(countNoText+countWithText));
    }
}
