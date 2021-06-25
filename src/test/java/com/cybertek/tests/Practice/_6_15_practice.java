package com.cybertek.tests.Practice;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _6_15_practice {
    /**1. Go to http://thedemosite.co.uk/login.php page, check the page whether opened or not
     2. Check the following elements on login page;
     a. Tab Title = 'Login example page to test the PHP MySQL online system'
     b. Header = '4. Login'
     c. Status Message = No login attempted
     d. Info Message = 'Enter your login details you added on the previous page and test
     the login. The success or failure will be shown above.'
     e. Username field
     f. Password password field
     g. Test Login button
     3. Perform a successful login and check the status message change
     4. Perform a failed login and check the status message change

     }
*/

    WebDriver driver;
    @BeforeMethod
    public void setupPAGE(){
        String browser= ConfigurationReader.getProperty("browser");
        String url =ConfigurationReader.getProperty("dataPracticeUrl");

        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
            public void test1_checkTitle() {

        Assert.assertEquals(ExpectedResaults.expectedTitleBeforeLogin, driver.getTitle());
    }

    @Test
            public void test2_checkHeader() {
        WebElement pCheck = driver.findElement(By.xpath("//tbody/tr/td/p/big/strong"));
        Assert.assertEquals(ExpectedResaults.expectedHeader4Login,pCheck.getText());
    }
    @Test
            public void test3_checkStatusBeforeLogin(){

        WebElement noLoginAttempted=driver.findElement(By.xpath("//b[.='**No login attempted**']"));
        Assert.assertEquals(ExpectedResaults.expectedStatusBeforeLogin,noLoginAttempted.getText());
    }
    @Test
            public void test4_InfoMEssage(){
        WebElement infoMessage=driver.findElement(By.xpath("//td[@class='auto-style1']/blockquote//p"));
        Assert.assertEquals(ExpectedResaults.expectedInfoMessage,infoMessage.getText());
    }

    @Test
            public void test5_Username_field(){
        WebElement usernameField=driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.isDisplayed();
    }
    @Test
            public void test6_Password_field(){
        WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.isDisplayed();
    }
    @Test
            public void test7_LoginButton(){
        WebElement logInButton=driver.findElement(By.xpath("//input[@type='button']"));
        logInButton.isDisplayed();
    }

    @Test
            public void test8_logInSuccessful(){
        String urlForAcc=ConfigurationReader.getProperty("urlForMakingAcc");
        driver.get(urlForAcc);

        String username="dsakdksa";
        String password="sdamks";
        WebElement usernameField=driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys(username);
        WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys(password);
        WebElement save=driver.findElement(By.xpath("//input[@type='button']"));
        save.click();
        driver.navigate().refresh();
        BrowserUtils.sleep(3);
        String url =ConfigurationReader.getProperty("dataPracticeUrl");
        driver.get(url);
        WebElement usernameFieldlog=driver.findElement(By.xpath("//input[@name='username']"));
        usernameFieldlog.sendKeys(username);
        WebElement passwordFieldlog=driver.findElement(By.xpath("//input[@name='password']"));
        passwordFieldlog.sendKeys(password);
        WebElement login=driver.findElement(By.xpath("//input[@type='button']"));
        login.click();
        WebElement LoginAttempted=driver.findElement(By.xpath("//b[.='**Successful Login**']"));

        Assert.assertEquals(LoginAttempted.getText(),ExpectedResaults.expectedSuccessfulStatusAfterLogin);

    }

    @Test
    public void test9_loginFailed(){
        String urlForAcc=ConfigurationReader.getProperty("urlForMakingAcc");
        driver.get(urlForAcc);
        Faker faker=new Faker();
        String username=faker.name().username();
        String password=faker.name().username();
        WebElement usernameField=driver.findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys(username);
        WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys(password);
        WebElement save=driver.findElement(By.xpath("//input[@type='button']"));
        save.click();
        String url =ConfigurationReader.getProperty("dataPracticeUrl");
        driver.get(url);
        WebElement usernameFieldlog=driver.findElement(By.xpath("//input[@name='username']"));
        usernameFieldlog.sendKeys("username");
        WebElement passwordFieldlog=driver.findElement(By.xpath("//input[@name='password']"));
        passwordFieldlog.sendKeys(password);
        WebElement login=driver.findElement(By.xpath("//input[@type='button']"));
        login.click();
        WebElement LoginAttempted=driver.findElement(By.xpath("//b[.='**Failed Login**']"));

        Assert.assertEquals(LoginAttempted.getText(),ExpectedResaults.getExpectedFailedStatusAfterLogin);

    }

    @AfterMethod
            public void closeBrow(){
        driver.close();
    }
}