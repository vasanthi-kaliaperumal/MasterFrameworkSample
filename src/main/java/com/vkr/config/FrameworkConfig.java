package com.vkr.config;


import com.vkr.config.converters.StringToBrowserTypeConverter;
import com.vkr.config.enums.BrowserRemoteModeType;
import com.vkr.config.enums.BrowserType;
import com.vkr.config.enums.BrowserRunModeType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("browserRunMode")
    BrowserRunModeType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();
}
