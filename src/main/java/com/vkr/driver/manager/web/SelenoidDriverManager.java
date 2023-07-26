package com.vkr.driver.manager.web;

import com.vkr.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidDriverManager {

    private SelenoidDriverManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName",getBrowserName());
        capabilities.setCapability("browserVersion","97.8");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }
    public static String getBrowserName(){
        switch (ConfigFactory.getConfig().browser())
        {
            case FIREFOX : {return "firefox";}
            default : {return "chrome";}
        }
    }
}
