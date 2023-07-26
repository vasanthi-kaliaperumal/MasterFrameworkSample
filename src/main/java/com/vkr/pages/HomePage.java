package com.vkr.pages;

import com.vkr.pages.enums.homepage.SubMenuText;
import com.vkr.pages.enums.homepage.TopMenuText;
import com.vkr.pages.pagelayers.homepage.TopMenuLayer;

public class HomePage{
    private TopMenuLayer topMenuLayer;
    public HomePage(){
        this.topMenuLayer = new TopMenuLayer();
    }

    public TopMenuLayer getTopMenuLayer(){
        return topMenuLayer;
    }

    public SystemUsersPage navigateToAddUserPage(){
        topMenuLayer
                .clickMenuItem(TopMenuText.ADMIN)
                .clickSubMenuItem(SubMenuText.USER_MANAGEMENT)
                .clickSubMenuItem(SubMenuText.USERS);
        return new SystemUsersPage();
    }
}
