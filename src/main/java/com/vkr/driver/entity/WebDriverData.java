package com.vkr.driver.entity;

import com.vkr.enums.BrowserRemoteModeType;
import com.vkr.enums.BrowserType;
import lombok.Getter;

@Getter
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;

    public WebDriverData(BrowserType browser, BrowserRemoteModeType browserRemoteMode) {
        this.browserType = browser;
        this.browserRemoteModeType = browserRemoteMode;
    }
}
