package com.vkr.driver.factory.web;

import com.vkr.config.ConfigFactory;
import com.vkr.driver.manager.web.DriverManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}
    public static WebDriver getDriver() {
        switch (ConfigFactory.getConfig().browser()) {
            case FIREFOX : {
                return DriverManager.getFirefoxDriver();
            }
            default : {
                return DriverManager.getChromeDriver();
            }
        }
    }


}
