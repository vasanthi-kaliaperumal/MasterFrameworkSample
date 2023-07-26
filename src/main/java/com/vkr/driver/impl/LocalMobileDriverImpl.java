package com.vkr.driver.impl;

import com.vkr.driver.IMobileDriver;
import com.vkr.driver.entity.MobileDriverData;
import com.vkr.driver.factory.mobile.LocalMobileFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileFactory.getDriver();
    }
}
