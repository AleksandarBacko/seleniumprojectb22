package com.cybertek.tests.day10_webtables;

import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class addidasPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        String browser= ConfigurationReader.getProperty("browser");
        String url =ConfigurationReader.getProperty("dataTablesUrladidas");

        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void testAdidasDemo() throws InterruptedException {

//        List<WebElement> list=driver.findElements(By.xpath("//div[@class='col-lg-3']"));
//        WebElement laptop;
//        for (WebElement each:list){
//            System.out.println(each.getText());
//            if (each.getText().contains("Laptops")){
//                laptop=each;
//                laptop.click();
//            }
//        }
        WebElement laptop=driver.findElement(By.xpath("//a[.='Laptops']"));
        laptop.click();

        WebElement i5= driver.findElement(By.cssSelector("a[href='prod.html?idp_=8']"));
        i5.click();

        WebElement addToCart=driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
        addToCart.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

//        driver.navigate().to("https://www.demoblaze.com/index.html#");
//        driver.navigate().back();
//        driver.navigate().back();
        WebElement home=driver.findElement(By.xpath("//a[@class='nav-link']"));
        home.click();
        WebElement laptop1=driver.findElement(By.xpath("//a[.='Laptops']"));
        laptop1.click();
        Thread.sleep(3000);

        WebElement i7=driver.findElement(By.xpath("//a[@href='prod.html?idp_=9']"));
        i7.click();
        WebElement addToCart1=driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
        addToCart1.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        WebElement cart=driver.findElement(By.xpath("//a[@href='cart.html']"));
        cart.click();
        WebElement placetheorder=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        placetheorder.click();//input[@id='name']
        WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Aleksandar");
        WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
        country.sendKeys("California");
        WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("SantaBarbara");
        WebElement card=driver.findElement(By.xpath("//input[@id='card']"));
        card.sendKeys("2222222244445555");
        WebElement month=driver.findElement(By.xpath("//input[@id='month']"));
        month.sendKeys("11");
        WebElement year=driver.findElement(By.xpath("//input[@id='year']"));
        year.sendKeys("1994");
        WebElement purches=driver.findElement(By.xpath("//button[.='Purchase']"));
        purches.click();
        String expected="";
        WebElement text=driver.findElement(By.xpath("//p[@class='lead text-muted ']"));

        if(text.getText().contains("Amount: 1580 USD")){
            expected="Amount: 1580 USD";
            System.out.println(expected);
        }
        Assert.assertEquals(expected,"Amount: 1580 USD");

        //button[@class='confirm btn btn-lg btn-primary']
        WebElement okbutt=driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']"));
        okbutt.click();

    }

    @AfterMethod
    public void colssing() throws InterruptedException {

        Thread.sleep(3000);
        driver.close();
    }
}
