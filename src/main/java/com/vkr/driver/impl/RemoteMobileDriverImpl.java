package com.vkr.driver.impl;

import com.vkr.driver.IMobileDriver;
import com.vkr.driver.entity.MobileDriverData;
import com.vkr.driver.factory.mobile.RemoteMobileFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileFactory.getDriver();
    }
}
