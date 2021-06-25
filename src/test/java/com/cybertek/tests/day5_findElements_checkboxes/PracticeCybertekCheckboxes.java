package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeCybertekCheckboxes {
    public static void main(String[] args) {
        /**1. Go	to	http://practice.cybertekschool.com/checkboxes
         2. Confirm	checkbox	#1	is	NOT	selected	by	default
         3. Confirm	checkbox	#2	is	SELECTED	by	default.
         4. Click	checkbox	#1	to	select	it.
         5. Click	checkbox	#2	to	deselect	it.
         6. Confirm	checkbox	#1	is	SELECTED.
         7. Confirm	checkbox	#2	is	NOT	selected.*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");
        List<WebElement> boxs=driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(boxs.size());

        for (WebElement each:boxs){
            System.out.println(each.isSelected());
        }
        for (WebElement each:boxs){
            each.click();
        }
        for (WebElement each:boxs){
            System.out.println(each.isSelected());
        }


//        WebElement box1=driver.findElement(By.xpath("//input[@text=' checkbox 1']"));
//        WebElement box2=driver.findElement(By.xpath("//input[@text=' checkbox 2\n" +
//                "  ']"));
//
//        System.out.println(box1.isSelected());
//        System.out.println(box2.isSelected());
    }
}
