package com.vkr.driver;

import com.vkr.config.ConfigFactory;
import com.vkr.config.enums.BrowserType;
import com.vkr.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}
    public static WebDriver getDriver(){
        WebDriver driver = null;
        if(isBrowserEquals(BrowserType.CHROME)){
            driver = DriverManager.getChromeDriver();
        }
        else if(isBrowserEquals(BrowserType.FIREFOX)){
            driver = DriverManager.getFirefoxDriver();
        }
        return driver;
    }

    private static boolean isBrowserEquals(Object browserName){
        return ConfigFactory.getConfig().browser() == browserName;
    }
}
