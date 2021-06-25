package com.cybertek.tests.day9_propertis_browser_utils;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.LibraryUtils;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC1Practice {
  /**  ask #1: Library software link verification
1. Open browser
2. Go to website: http://library2.cybertekschool.com/login.html
            3. Enter username: “”
            4. Enter password: “”
            5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page
    username password
    student11@library tScBPCUr
    student12@library UC0LC9Hj
    student13@library zcVbvUWH
    librarian13@library 9rf6axdD
    Task #2:
            • Create a method called loginToLibrary in the same java class with the @Test
• This method simply logs in to Library app when you call it.
    Task #3:
            • Create a new class under ‘utilities’ package named “LibraryUtilities”
            • Move loginToLibrary method from the same java class to “LibraryUtilities”
            • Overcome the challenge so it works when you call from the other class. */

  WebDriver driver;

  @BeforeMethod
  public void setupMethod() {

    driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("http://library2.cybertekschool.com/login.html");

  }



  @Test
    public void Test1(){
    LibraryUtils.loginToLibrary(driver);

    BrowserUtils.sleep(10);
    List<WebElement> allLinks = driver.findElements(By.tagName("a"));

    System.out.println("allLinks.size() = " + allLinks.size());

    //7. Print out each link text on this page

    for (WebElement each : allLinks) {
      System.out.println(each.getText());
    }
//    List<WebElement> links =driver.findElements(By.xpath("//body//a"));
//    for (WebElement each: links){
//      System.out.println(each.getText());
//    }
//
//    int countNoText=0;
//    int countWithText=0;
//    for (WebElement each:links){
//      if(each.getText().isEmpty()){
//        countNoText++;
//      }else {
//        countWithText++;
//      }
//    }
//    System.out.println("Number of links with out of text = "+countNoText);
//    System.out.println("Number of links with  text = "+countWithText);
//    System.out.println("Total number of links = "+(countNoText+countWithText));

  }
}
