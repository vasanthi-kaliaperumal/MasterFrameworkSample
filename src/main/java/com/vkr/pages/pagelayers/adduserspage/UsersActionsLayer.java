package com.vkr.pages.pagelayers.adduserspage;

import org.openqa.selenium.By;

import static com.vkr.utils.PageActionsHelper.*;

public class UsersActionsLayer {
    private static final By ADD_BUTTON = By.id("btnAdd");

    public AddUserLayer setAddButton() {
        click(ADD_BUTTON);
        return new AddUserLayer();
    }
}
