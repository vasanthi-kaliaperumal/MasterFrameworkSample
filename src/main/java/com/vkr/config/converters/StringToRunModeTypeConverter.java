package com.vkr.config.converters;

import com.vkr.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeTypeConverter implements Converter<RunModeType> {

    @Override
    public RunModeType convert(Method method, String runMode) {

        return RunModeType.valueOf(runMode.toUpperCase());
    }
}
