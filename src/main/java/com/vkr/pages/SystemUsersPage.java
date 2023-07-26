package com.vkr.pages;

import com.vkr.pages.pagelayers.adduserspage.SearchLayer;
import com.vkr.pages.pagelayers.adduserspage.UsersActionsLayer;

public class SystemUsersPage {
    private final SearchLayer searchLayer;
    private final UsersActionsLayer userActionLayer;

    public SystemUsersPage(){
        this.userActionLayer = new UsersActionsLayer();
        this.searchLayer = new SearchLayer();
    }

    public UsersActionsLayer getUserActionLayer() {
        return userActionLayer;
    }
}
