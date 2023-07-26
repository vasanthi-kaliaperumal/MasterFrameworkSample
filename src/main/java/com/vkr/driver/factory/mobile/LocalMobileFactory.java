package com.vkr.driver.factory.mobile;

import com.vkr.config.ConfigFactory;
import com.vkr.enums.MobilePlatformType;
import com.vkr.driver.manager.mobile.AndroidManager;
import com.vkr.driver.manager.mobile.IosManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileFactory {

    private LocalMobileFactory(){}

    private static final Map<MobilePlatformType, Supplier<WebDriver>>MAP =
            new EnumMap<>(MobilePlatformType.class);
    static {
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, IosManager::getDriver);
    }
    public static WebDriver getDriver() {
       return MAP.get(ConfigFactory.getConfig().platform()).get();
    }


}
