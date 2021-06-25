package com.cybertek.utillities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*creating private constractor so this class object is not reachable from outside*/
    private Driver(){ }
    /*making our driver instance private so that is not reachable from outside of the class
    * we make it static because we want to run before everything else and we will use it in static method */
    private static WebDriver driver;
/* creating re-usable utility method that will return same drivet instance everytime we call it  */
    public static WebDriver getDriver() {
       if (driver==null){
       /* we read our brwser type from configuration.properties file using .getProperty method we creating in ConfigurationReader class*/
           String browserType=ConfigurationReader.getProperty("browser");
           switch (browserType){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   driver.manage().window().maximize();
                   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                   break;

               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   driver.manage().window().maximize();
                   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                   break;
           }
       }
        return driver;
    }


    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
