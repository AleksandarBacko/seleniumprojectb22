package com.cybertek.tests.day10_webtables;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utillities.ConfigurationReader;
import com.cybertek.utillities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_Tables extends TestBase {


    @Test
    public void task3_return_tims_due_amount() {
        //This line returns String : http://practice.cybertekschool.com/tables#edit
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        ////table[@id='table1']//td[.='Tim'] --> this locator locates Tim's cell regardless
        // of which row he is in

        //2.	Locate first table and verify Tim has due amount of “$50”

        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tim's cell is not returning as expected.");


        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
    }
        @Test
        public void task4_verify_order_method(){
            String url = ConfigurationReader.getProperty("dataTablesUrl");
            driver.get(url);
            TableUtils.verifyOrder(driver, "Tim");

        }



}
