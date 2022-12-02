package com.devxschool;

import java.util.Random;

// TODO SETUP THIS CLASS
public class UIConfig extends TestBase {
    Random random = new Random();
    private int testId = random.nextInt(1000);
    private String configurations = "UI Test Configurations";

    public void initializeTestConfiguration() {
        System.out.println(this.configurations);
        System.out.println("Here I would add some cool UI configurations for browser.");
    }

    public int hashCode(){
        return testId;
    }

    public String toString(){
        return "\nApp name: " + getAppName() + "\nTest ID: " + testId + " is randomly generated in TestBase class;" + "\n Config: " + configurations + ".";
    }
}