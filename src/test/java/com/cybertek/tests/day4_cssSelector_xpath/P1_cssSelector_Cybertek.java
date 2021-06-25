package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    /**
     * TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
     * 1. Open Chrome browser
     * 2. Go to http://practice.cybertekschool.com/forgot_password
     * 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
     * a. “Home” link
     * b. “Forgot password” header
     * c. “E-mail” text
     * d. E-mail input box
     * e. “Retrieve password” button
     * f. “Powered by Cybertek School” text
     * 4. Verify all WebElements are displayed.
     */
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(homeLink.isDisplayed());
        WebElement forgotPassword =driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println(forgotPassword.isDisplayed());
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(emailText.isDisplayed());
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println(emailInputBox.isDisplayed());
        WebElement headerh2=driver.findElement(By.tagName("h2"));
        System.out.println(headerh2.isDisplayed());
    }
}
