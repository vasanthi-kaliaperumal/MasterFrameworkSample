package com.vkr.driver.manager.mobile;

import com.vkr.config.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IosManager {
    private IosManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPod touch (7th generation)");
        capabilities.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir")+"/ios-app.zip");
        return new RemoteWebDriver(ConfigFactory.getConfig().localIosServerURL(),capabilities);
    }
}
