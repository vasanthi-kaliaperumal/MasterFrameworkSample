package com.vkr.pages.enums.homepage;

public enum TopMenuText {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time");

    private final String name;
    TopMenuText(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
