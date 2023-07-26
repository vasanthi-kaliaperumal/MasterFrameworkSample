package com.vkr.pages.pagelayers.adduserspage;

import com.vkr.fixtures.addusers.dataprovider.UserData;
import org.openqa.selenium.By;

import java.util.function.BiPredicate;

import static com.vkr.utils.PageActionsHelper.*;

public class AddUserLayer {
    private static final By DRP_DWN_USER_ROLE = By.xpath("//label[text()='User Role']/following-sibling::select");
    private static final By DRP_DWN_STATUS = By.xpath("//label[text()='Status']/following-sibling::select");
    private static final By TXT_EMPLOYEE_NAME = By.xpath("//label[text()='Employee Name']/following-sibling::input");
    private static final By TXT_USER_NAME = By.xpath("//label[text()='Username']/following-sibling::input");
    private static final By TXT_PASSWORD = By.xpath("//label[text()='Password']/following-sibling::input");
    private static final By TXT_CONFIRM_PASSWORD = By.xpath("//label[text()='Confirm Password']/following-sibling::input");
    private static final By ERR_MSG_EMPLOYEE_NAME = By.xpath("//span[@for='systemUser_employeeName_empName']");

    public AddUserLayer setDrpDwnUserRole(String userRole) {
        select(DRP_DWN_USER_ROLE, e -> e.selectByVisibleText(userRole));
        return this;
    }

    public AddUserLayer setDrpDwnStatus(String status) {
        select(DRP_DWN_STATUS, e -> e.selectByVisibleText(status));
        return this;
    }

    public AddUserLayer setTxtEmployeeName(String employeeName) {
        sendKeys(TXT_EMPLOYEE_NAME, employeeName);
        return this;
    }

    public AddUserLayer setTxtUserName(String userName) {
        sendKeys(TXT_USER_NAME, userName);
        return this;
    }

    public AddUserLayer setTxtPassword(String password) {
        sendKeys(TXT_PASSWORD, password);
        return this;
    }

    public AddUserLayer setTxtConfirmPassword(String password) {
        sendKeys(TXT_CONFIRM_PASSWORD, password);
        return this;
    }

    public boolean isErrMsgDisplayedForEmployeeName() {
        return getText(ERR_MSG_EMPLOYEE_NAME).equalsIgnoreCase("Employee does not exist");
    }

    public boolean isSuccessMsgDisplayed() {
        return true;
    }

    public boolean fillDetails(UserData userData, BiPredicate<UserData, AddUserLayer> predicate) { //pass the behavior
        return predicate.test(userData, this);
    }

}
