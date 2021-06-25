package com.cybertek.tests.day10_webtables;

import com.cybertek.utillities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExample {

    @Test
    public void how_to_use_driver(){
        Driver.getDriver().get("http://www.google.com");
    }
}
