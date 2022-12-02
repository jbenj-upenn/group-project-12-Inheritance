package com.devxschool;

// TODO SETUP THIS CLASS
public class BackendConfig extends TestBase {
    private String configurations = "Backend Test Configurations";

    public void initializeTestConfiguration(){
        System.out.println(configurations);
        System.out.println("Here I would add some backend configurations for database and other connections.");
    }

    @Override
    public int hashCode(){
        return super.testId;
    }

    public String toString(){
        return "\n App name: " + getAppName() + "\n Test ID: " + testId + "\n Config: " + configurations + ".";
    }






}