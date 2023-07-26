package com.vkr.config.converters;

import com.vkr.enums.MobilePlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToMobileTypeConverter implements Converter<MobilePlatformType> {

    @Override
    public MobilePlatformType convert(Method method, String platform) {
        Map<String, MobilePlatformType> stringBrowserTypeMap =
                Map.of("ANDROID", MobilePlatformType.ANDROID,
                "IOS", MobilePlatformType.IOS);

        return stringBrowserTypeMap.getOrDefault(platform.toUpperCase(),MobilePlatformType.ANDROID);
    }
}
