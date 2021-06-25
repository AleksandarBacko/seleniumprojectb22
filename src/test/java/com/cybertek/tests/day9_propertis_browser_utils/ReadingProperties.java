package com.cybertek.tests.day9_propertis_browser_utils;

import com.cybertek.utillities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {


    @Test
    public void reading_from_properties() throws IOException {

        //#1-Creat object of Properties class(coming from Java lib)

        Properties properties =new Properties();


        //#2-Open the file using FileInputStream
        // we are trying to open a file so we need to pass the path

        FileInputStream file=new FileInputStream("configuration.properties");

        //#3 load the properties object with our file
        properties.load(file);

        //#4 reading from configuraton.properties
        properties.getProperty("username");

        String userName=properties.getProperty("username");
        System.out.println(userName);

    }

    @Test
    public void using_properties_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));



    }
}
