package com.vkr.driver.impl;

import com.vkr.driver.IWebDriver;
import com.vkr.driver.entity.WebDriverData;
import com.vkr.driver.factory.web.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver();
    }
}
