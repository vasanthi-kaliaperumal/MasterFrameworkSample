package com.vkr.config;


import com.vkr.config.converters.*;
import com.vkr.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("browserRunMode")
    @ConverterClass(StringToRunModeTypeConverter.class)
    RunModeType browserRunMode();

    @Key("mobileRunMode")
    @ConverterClass(StringToRunModeTypeConverter.class)
    RunModeType mobileRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToBrowserRemoteModeTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @Key("browserStackUserName")
    String browserStackUsername();

    String browserStackKey();

    @DefaultValue("https://${browserStackUsername}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();

    @DefaultValue("ANDROID")
    @ConverterClass(StringToBrowserTypeConverter.class)
    MobilePlatformType platform();

    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL localAppiumServerURL();

    URL localIosServerURL();
}
