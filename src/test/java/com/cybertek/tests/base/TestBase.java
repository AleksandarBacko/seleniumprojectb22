package com.cybertek.tests.base;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : chrome
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // below code is same as above
//        driver.get(ConfigurationReader.getProperty("dataTablesUrl"));

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
