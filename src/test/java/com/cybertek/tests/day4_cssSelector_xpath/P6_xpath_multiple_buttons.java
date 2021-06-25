package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_multiple_buttons {
//    TC #6: XPATH LOCATOR practice
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/multiple_buttons
//            3. Click on Button 1
//            4. Verify text displayed is as expected:
//    Expected: “Clicked on button one!”
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement buuton1=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        buuton1.click();

        String expe="Clicked on button one!";
        String acctual=driver.findElement(By.xpath("//p[@style='color:green']")).getText();
        if (expe.equals(acctual)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

    }
}
