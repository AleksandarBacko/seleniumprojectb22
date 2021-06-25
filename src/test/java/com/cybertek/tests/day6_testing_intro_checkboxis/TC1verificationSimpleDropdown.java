package com.cybertek.tests.day6_testing_intro_checkboxis;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC1verificationSimpleDropdown {

//        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”


@Test
    public void test1(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement simpleDropdovn=driver.findElement(By.cssSelector("option[disabled='disabled']"));
    Assert.assertEquals(simpleDropdovn.getText(),"Please select an option");
    WebElement stateSelection=driver.findElement(By.xpath("//option[.='Select a State']"));
    Assert.assertEquals(stateSelection.getText(),"Select a State");

    WebElement simpleDropdovwn=driver.findElement(By.id("dropdown"));
    simpleDropdovwn.click();
    WebElement stateSelectionMain=driver.findElement(By.id("state"));
    stateSelectionMain.click();

    driver.close();
    }


    @Test
    public void test2(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement stateSelectionMain=driver.findElement(By.id("state"));
    stateSelectionMain.click();
    Select select=new Select(stateSelectionMain);

    select.selectByVisibleText("Illinois");

    stateSelectionMain.click();

    select.selectByIndex(47);

    stateSelectionMain.click();

    select.selectByValue("CA");

    WebElement curent=select.getFirstSelectedOption();
    Assert.assertEquals(curent.getText(),"California");

     driver.close();

    }
    @Test
    public void test3(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement year=driver.findElement(By.id("year"));
    Select select=new Select(year);
    select.selectByVisibleText("1922");

    WebElement mounth=driver.findElement(By.id("month"));
    Select select1=new Select(mounth);
    select1.selectByValue("11");

    WebElement day=driver.findElement(By.id("day"));
    Select select2=new Select(day);
    select2.selectByIndex(0);

    driver.close();
    }
    @Test
    public void test4() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement menu = driver.findElement(By.name("Languages"));
        Select select = new Select(menu);

        List<WebElement> all = select.getOptions();
        for (WebElement each : all) {
            each.click();
            System.out.println(each.getText());
        }
        for (WebElement each : all) {
            each.click();
        }

        driver.close();
    }
    @Test
    public void test5(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement nonselectDrop=driver.findElement(By.id("dropdownMenuLink"));
    nonselectDrop.click();
    WebElement facebook=driver.findElement(By.partialLinkText("Facebook"));
    facebook.click();

    Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
    driver.close();

    }

}
