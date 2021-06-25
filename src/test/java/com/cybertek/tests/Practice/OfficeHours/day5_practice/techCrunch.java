package com.cybertek.tests.Practice.OfficeHours.day5_practice;

import com.cybertek.utillities.BrowserUtils;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class techCrunch {
    // arthur locator (//article[@class='post-block post-block--image post-block--unread'])[1]//a[contains(@aria-label,'Posts by')]
    // pictures locator (//article[@class='post-block post-block--image post-block--unread'])[1]//img[contains(@sizes,'min-width: 1024px')]
    @Test
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("techCrunchUrl"));

        List<WebElement> lastestNews=Driver.getDriver().findElements(By.xpath("//article[@class='post-block post-block--image post-block--unread']"));
        System.out.println(lastestNews.size());
        for (int i = 1; i < lastestNews.size(); i++) {
            String authorLocator="(//article[@class='post-block post-block--image post-block--unread'])["+i+"]//a[contains(@aria-label,'Posts by')]";
            WebElement authorElement=Driver.getDriver().findElement(By.xpath(authorLocator));
            System.out.println("authorElement.getText() = " + authorElement.getText());
            Assert.assertTrue(authorElement.isDisplayed());

            String pictureLocator="(//article[@class='post-block post-block--image post-block--unread'])["+i+"]//img[contains(@sizes,'min-width: 1024px')]";
            WebElement pictureElement=Driver.getDriver().findElement(By.xpath(pictureLocator));
            Assert.assertTrue(pictureElement.isDisplayed());

        }

        Random random=new Random();
        int newsNumber=random.nextInt(lastestNews.size())+1;
        lastestNews.get(newsNumber).click();
        BrowserUtils.sleep(2);
        String expectedTitle=Driver.getDriver().findElement(By.xpath("//h1")).getText();
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        List<WebElement> listAtags=Driver.getDriver().findElements(By.xpath("//h2[.='The Latest']/../div/div/article[\"+randomNum+\"]/div[2]/div/div[2]//a"));
        for(WebElement each:listAtags){
            System.out.println(each.getAttribute("href"));
        }




    }
}
