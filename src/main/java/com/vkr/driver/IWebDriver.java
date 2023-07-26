package com.vkr.driver;

import com.vkr.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {

    WebDriver getDriver(WebDriverData driverData);
}
