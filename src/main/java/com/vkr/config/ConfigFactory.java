package com.vkr.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {
    private ConfigFactory(){}
    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
