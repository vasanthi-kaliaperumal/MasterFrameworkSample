package com.vkr.driver.manager;

import com.vkr.config.ConfigFactory;
import com.vkr.config.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();
        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM){

        }
        return null;
    }
}
