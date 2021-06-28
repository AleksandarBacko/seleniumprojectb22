package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.TelerikPage;
import com.cybertek.utillities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractice {
    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        TelerikPage telerikPage=new TelerikPage();
        Actions actions=new Actions(Driver.getDriver());
        telerikPage.acceptCookiesButton.click();

        //2. Drag and drop the small circle to bigger circle.

        actions.dragAndDrop(telerikPage.smallCircle,telerikPage.bigCircle).perform();
        //3. Assert:
        String expected = "You did great!";
        String actual = telerikPage.bigCircle.getText();

        Assert.assertEquals(actual, expected);

        //-Text in big circle changed to: “You did great!”
    }



}
