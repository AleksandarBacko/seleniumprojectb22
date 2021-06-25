package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC03FINDELEMENTS_APPLE {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "https://www.apple.com";
        driver.get(url);
        WebElement mac = driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-mac']"));
        mac.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> macLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("macLinks.size() = " + macLinks.size());
        List<WebElement> mackLinkTOTAL = new ArrayList<>();
        String targetWord = "total";
        for (WebElement macLink : macLinks) {
            if (!macLink.getText().isEmpty()) {
                mackLinkTOTAL.add(macLink);
            }
        }
        System.out.println("Number of Links includes \"TOTAL\" = " + (mackLinkTOTAL.size()));
        System.out.println("Number of Links missing \"TOTAL\" = " + (macLinks.size() - mackLinkTOTAL.size()));

        // Thread.sleep(2000);
        WebElement iPad = driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-ipad']"));
        iPad.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> ipadLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("ipadLinks.size() = " + ipadLinks.size());
        List<WebElement> iPadLinkTOTAL = new ArrayList<>();
        for (WebElement ipad : ipadLinks) {
            if (!ipad.getText().isEmpty()) {
                iPadLinkTOTAL.add(ipad);
            }
        }
        System.out.println("Number of Links includes \"TOTAL\" = " + (iPadLinkTOTAL.size()));
        System.out.println("Number of Links missing \"TOTAL\" = " + (ipadLinks.size() - iPadLinkTOTAL.size()));


        WebElement iPhone = driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> iPhoneLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("iPhoneLinks.size() = " + iPhoneLinks.size());

        List<WebElement> iPhoneLinkTOTAL = new ArrayList<>();
        for (WebElement iphone : iPhoneLinks) {
            if (!iphone.getText().isEmpty()) {
                iPhoneLinkTOTAL.add(iphone);
            }
        }
        System.out.println("Number of Links includes \"TOTAL\" = " + (iPhoneLinkTOTAL.size()));
        System.out.println("Number of Links missing \"TOTAL\" = " + (iPhoneLinks.size() - iPhoneLinkTOTAL.size()));

        WebElement watch = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']"));
        watch.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> watchLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("watchLinks.size() = " + watchLinks.size());

        List<WebElement> watchLinkTOTAL = new ArrayList<>();
        for (WebElement eachWatch : watchLinks) {
            if (!eachWatch.getText().isEmpty()) {
                watchLinkTOTAL.add(eachWatch);
            }
        }
        System.out.println("Number of watchLinks includes \"TOTAL\" = " + (watchLinkTOTAL.size()));
        System.out.println("Number of watchLinks missing \"TOTAL\" = " + (watchLinks.size() - watchLinkTOTAL.size()));

        //  Thread.sleep(2000);
        WebElement tv = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']"));
        tv.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> tvLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("tvLinks.size() = " + tvLinks.size());
        List<WebElement> tvLinkTOTAL = new ArrayList<>();
        for (WebElement eachTv : tvLinks) {
            if (!eachTv.getText().isEmpty()) {
                tvLinkTOTAL.add(eachTv);
            }
        }
        System.out.println("Number of tvLinks includes \"TOTAL\" = " + (tvLinkTOTAL.size()));
        System.out.println("Number of tvLinks missing \"TOTAL\" = " + (tvLinks.size() - tvLinkTOTAL.size()));


        WebElement music = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']"));
        music.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> musicLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("musicLinks.size() = " + musicLinks.size());
        List<WebElement> musicLinkTOTAL = new ArrayList<>();
        for (WebElement eachmusic : musicLinks) {
            if (!eachmusic.getText().isEmpty()) {
                musicLinkTOTAL.add(eachmusic);
            }
        }
        System.out.println("Number of musicLinks includes \"TOTAL\" = " + (musicLinkTOTAL.size()));
        System.out.println("Number of musicLinks missing \"TOTAL\" = " + (musicLinks.size() - musicLinkTOTAL.size()));

        WebElement support = driver.findElement(By.xpath("//a[@href='https://support.apple.com']"));
        support.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        List<WebElement> supportLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("supportLinks.size() = " + supportLinks.size());

        List<WebElement> supportLinkTOTAL = new ArrayList<>();
        for (WebElement eachSupport : supportLinks) {
            if (!eachSupport.getText().isEmpty()) {
                supportLinkTOTAL.add(eachSupport);
            }
        }
        System.out.println("Number of supportLinks includes \"TOTAL\" = " + (supportLinkTOTAL.size()));
        System.out.println("Number of supportLinks missing \"TOTAL\" = " + (supportLinks.size() - supportLinkTOTAL.size()));
        driver.quit();







//        WebDriver driver= WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("https://www.apple.com");
//        WebElement mac=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-mac']"));
//        WebElement iPad=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-ipad']"));
//        WebElement iPhone=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']"));
//        WebElement watch=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-watch']"));
//        WebElement tv=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-tv']"));
//        WebElement music=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-music']"));
//        WebElement support=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-support']"));
//
//        List<WebElement> headers=new ArrayList<>();
//        headers.add(mac);
//        headers.add(iPad);
//        headers.add(iPhone);
//        headers.add(watch);
//        headers.add(tv);
//        headers.add(music);
//        headers.add(support);
//        System.out.println(headers.size());
//        System.out.println(driver.getTitle());
//        WebElement click;
//        for (int i =0;i<headers.size();i++) {
//            click=headers.get(i);
//            if(driver.getTitle().equals("Apple")) {
//                click.click();
//                System.out.println(driver.getTitle());
//                List<WebElement> links = driver.findElements((By.cssSelector("a")));
//                System.out.println(links.size());
//                int countNoText = 0;
//                int countWithText = 0;
//                for (WebElement element : links) {
//                    if (element.getText().isEmpty()) {
//                        countNoText++;
//                    } else {
//                        countWithText++;
//                    }
//                }
//                System.out.println("Number of links with out of text = " + countNoText);
//                System.out.println("Number of links with  text = " + countWithText);
//
//                driver.navigate().back();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            }
//        }=================================================================================throws exeption
//       ===================================== stale element reference: element is not attached to the page document

//The Element is not Attached to the DOM
//A common technique used for simulating a tabbed UI in a web app is to prepare DIVs for each tab, but only attach
//one at a time, storing the rest in variables. In this case, it's entirely possible that your code might have a reference
//to an element that is no longer attached to the DOM (that is, that has an ancestor which is "document.documentElement").
//
//If WebDriver throws a stale element exception in this case, even though the element still exists, the reference
//is lost. You should discard the current reference you hold and replace it, possibly by locating the element again
//once it is attached to the DOM.








//        for (WebElement each:headers){
//            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//            each.click();
//            System.out.println(driver.getTitle());
//            List<WebElement> links=driver.findElements((By.cssSelector("a")));
//            System.out.println(links.size());
//            int countNoText=0;
//            int countWithText=0;
//            for (WebElement element:links){
//                if(element.getText().isEmpty()){
//                    countNoText++;
//                }else {
//                    countWithText++;
//                }
//            }
//            System.out.println("Number of links with out of text = "+countNoText);
//            System.out.println("Number of links with  text = "+countWithText);
//
//            driver.navigate().back();

        }

    }

