package com.devxschool;

// TODO SETUP THIS CLASS
public class TestBase {
    String appName = "DevXSchool Application Test Base";
    String configurations = "Base Test Configurations";
    int testId = 100;

    public String getAppName(){
        this.appName = appName;
        return appName;
    }

    public void initializeTestConfiguration(){
        System.out.println(configurations);
    }

    public int getTestId() {
        return testId;
    }

    public int hashCode(){
        return getTestId();
    }

}
