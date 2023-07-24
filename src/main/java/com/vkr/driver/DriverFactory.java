package com.vkr.driver;

import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory(){}

    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("");
    }
    public static void  quitDriver(){

    }
}
