package com.vkr.driver.factory.web;

import com.vkr.config.ConfigFactory;
import com.vkr.enums.BrowserRemoteModeType;
import com.vkr.driver.manager.web.BrowserStackDriverManager;
import com.vkr.driver.manager.web.SeleniumGridDriverManager;
import com.vkr.driver.manager.web.SelenoidDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    private static final Map<BrowserRemoteModeType, WebDriver> MAP =
            new EnumMap<>(BrowserRemoteModeType.class);
    static {
        MAP.put(BrowserRemoteModeType.SELENIUM,SeleniumGridDriverManager.getDriver());
        MAP.put(BrowserRemoteModeType.SELENOID,SelenoidDriverManager.getDriver());
        MAP.put(BrowserRemoteModeType.BROWSER_STACK,BrowserStackDriverManager.getDriver());
    }
    public static WebDriver getDriver(){
        return MAP.get(ConfigFactory.getConfig().browserRemoteMode());
    }

}
