package com.vkr.config.converters;

import com.vkr.enums.MobileRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteModeTypeConverter implements Converter<MobileRemoteModeType> {

    @Override
    public MobileRemoteModeType convert(Method method, String remoteMode) {
        return MobileRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
