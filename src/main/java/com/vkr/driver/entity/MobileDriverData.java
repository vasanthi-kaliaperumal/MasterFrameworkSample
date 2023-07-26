package com.vkr.driver.entity;

import com.vkr.enums.MobilePlatformType;
import com.vkr.enums.MobileRemoteModeType;
import lombok.Getter;

@Getter
public final class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;

    public MobileDriverData(MobilePlatformType platformType, MobileRemoteModeType remoteModeType) {
        this.mobilePlatformType = platformType;
        this.mobileRemoteModeType = remoteModeType;
    }
}
