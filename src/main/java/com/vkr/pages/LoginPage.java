package com.vkr.pages;

import static com.vkr.utils.PageActionsHelper.*;

import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXT_USERNAME = By.id("txtUsername");
    private static final By TXT_PASSWORD = By.id("txtPassword");
    private static final By BTN_LOGIN = By.id("btnLogin");

    private LoginPage setUsername(String userName) {
        sendKeys(TXT_USERNAME, userName);
        return this;
    }
    private LoginPage setPassword(String password) {
        sendKeys(TXT_PASSWORD, password);
        return this;
    }

    private HomePage setLogin() {
        click(BTN_LOGIN);
        return new HomePage();
    }

    public HomePage loginToApplications(String userName,String password){
        return setUsername(userName)
                .setPassword(password)
                .setLogin();
    }



}

