package com.vkr.driver.factory;

import com.vkr.enums.RunModeType;
import com.vkr.driver.*;
import com.vkr.driver.impl.LocalMobileDriverImpl;
import com.vkr.driver.impl.LocalWebDriverImpl;
import com.vkr.driver.impl.RemoteMobileDriverImpl;
import com.vkr.driver.impl.RemoteWebDriverImpl;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    private DriverFactory(){}

    private static final Map<RunModeType, Supplier<IWebDriver>> WEB =
            new EnumMap<>(RunModeType.class);
    private static final Map<RunModeType, Supplier<IMobileDriver>> MOBILE =
            new EnumMap<>(RunModeType.class);

    static {
        WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunModeType.REMOTE, RemoteWebDriverImpl::new);
        MOBILE.put(RunModeType.LOCAL, LocalMobileDriverImpl::new);
        MOBILE.put(RunModeType.REMOTE, RemoteMobileDriverImpl::new);
    }
    public static IWebDriver getWebDriver(RunModeType runModeType){
        return WEB.get(runModeType).get();
    }
    public static IMobileDriver getMobileDriver(RunModeType runModeType){
        return MOBILE.get(runModeType).get();
    }
}
