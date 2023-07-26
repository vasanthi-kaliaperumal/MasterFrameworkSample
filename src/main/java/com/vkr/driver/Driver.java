package com.vkr.driver;

import com.vkr.driver.entity.MobileDriverData;
import com.vkr.driver.entity.WebDriverData;
import com.vkr.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.vkr.config.ConfigFactory.getConfig;

public final class Driver {
    private Driver(){}

    public static void initDriverForWeb(){
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());

            WebDriver driver = DriverFactory
                    .getWebDriver(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
        }
    }

    public static void initDriverForMobile(){
        if(Objects.isNull(DriverManager.getDriver())) {
            MobileDriverData driverData = new MobileDriverData(getConfig().platform(), getConfig().mobileRemoteMode());

            WebDriver driver = DriverFactory
                    .getMobileDriver(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            loadURL();
        }
    }

    public static void loadURL(){
        DriverManager.getDriver().get(getConfig().webUrl());
    }
    public static void  quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }

    }
}
