package com.goRest.stepDefs;


import com.goRest.utilities.ConfigurationReader;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println(":::::::::TEST INFORMATION:::::::::");
        System.out.println("URL :: " + ConfigurationReader.getProperty("url"));
        System.out.println("Environment :: " + ConfigurationReader.getProperty("environment"));
        System.out.println("Test Scenario :: " + scenario.getName());
    }

}
