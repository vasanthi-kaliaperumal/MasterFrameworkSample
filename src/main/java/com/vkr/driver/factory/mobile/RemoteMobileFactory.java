package com.vkr.driver.factory.mobile;

import com.vkr.config.ConfigFactory;
import com.vkr.enums.MobileRemoteModeType;
import com.vkr.driver.manager.mobile.BrowserStackMobileManager;
import com.vkr.driver.manager.mobile.SauceLabsMobileManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public final class RemoteMobileFactory {
    private RemoteMobileFactory(){}

    private static final Map<MobileRemoteModeType, WebDriver> MAP =
            new EnumMap<>(MobileRemoteModeType.class);
    static {
        MAP.put(MobileRemoteModeType.SAUCE_LABS,SauceLabsMobileManager.getDriver());
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileManager.getDriver());
    }
    public static WebDriver getDriver(){
        return MAP.get(ConfigFactory.getConfig().mobileRemoteMode());
    }

}
