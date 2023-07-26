package com.vkr.driver;

import com.vkr.enums.DriverType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

import static com.vkr.enums.DriverType.MOBILE;
import static com.vkr.enums.DriverType.WEB;
import static java.lang.ThreadLocal.withInitial;

public final class DriverManager {

    private DriverManager(){}

    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILE_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<DriverType> CONTEXT = withInitial(()->WEB);
    private static final Map<DriverType,ThreadLocal<WebDriver>> DRIVER_MAP =
            new EnumMap<>(DriverType.class);
    public static WebDriver getDriver(){
        return CONTEXT.get() == WEB
                ? WEB_DRIVER_THREAD_LOCAL.get()
                : MOBILE_DRIVER_THREAD_LOCAL.get();
    }

    public static void setDriver(WebDriver driver){
        if(driver instanceof AndroidDriver || driver instanceof IOSDriver) {
            MOBILE_DRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(MOBILE, MOBILE_DRIVER_THREAD_LOCAL);
            CONTEXT.set(MOBILE);
        }
        else {
            WEB_DRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(MOBILE,MOBILE_DRIVER_THREAD_LOCAL);
            CONTEXT.set(WEB);
        }
    }

    public static void unload(){
        WEB_DRIVER_THREAD_LOCAL.remove();
        MOBILE_DRIVER_THREAD_LOCAL.remove();
        CONTEXT.remove();
    }
}
