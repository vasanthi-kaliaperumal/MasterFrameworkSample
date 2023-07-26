package com.vkr.driver.manager.web;

import com.vkr.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackDriverManager {

    private BrowserStackDriverManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browser", SelenoidDriverManager.getBrowserName());
        capabilities.setCapability("browser_version","latest");
        capabilities.setCapability("os","Windows");
        capabilities.setCapability("os_version","10");
        return new RemoteWebDriver(ConfigFactory.getConfig().browserStackURL(), capabilities);
    }
}
