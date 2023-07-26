package com.vkr.pages.enums.homepage;

public enum SubMenuText {
    USER_MANAGEMENT("User Management"),
    USERS("Users");


    private final String name;
    SubMenuText(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
