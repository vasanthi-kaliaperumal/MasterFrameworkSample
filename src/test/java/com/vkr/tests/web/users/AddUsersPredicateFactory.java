package com.vkr.tests.web.users;

import com.vkr.fixtures.addusers.dataprovider.UserData;
import com.vkr.pages.pagelayers.adduserspage.AddUserLayer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class AddUsersPredicateFactory {

    private static final Map<String, BiPredicate<UserData,AddUserLayer>> MAP =
            new HashMap<>();
    private static final BiPredicate<UserData, AddUserLayer> JUST_EMPLOYEE_NAME_PREDICATE =
            (userData, addUserLayer) -> {
                addUserLayer.setTxtEmployeeName(userData.getEmployeeName());
                return addUserLayer.isErrMsgDisplayedForEmployeeName();
            };
    private static final BiPredicate<UserData, AddUserLayer> VALID_PREDICATE =
            (userData, addUserLayer) -> {
                addUserLayer.setDrpDwnUserRole(userData.getUserRole())
                        .setTxtUserName(userData.getUserName())
                        .setTxtPassword(userData.getPassword())
                        .setTxtConfirmPassword(userData.getPassword())
                        .setDrpDwnStatus(userData.getStatus())
                        .setTxtEmployeeName(userData.getEmployeeName());
                return addUserLayer.isSuccessMsgDisplayed();
            };
    static {
        MAP.put("valid",VALID_PREDICATE);
        MAP.put("just_employee",JUST_EMPLOYEE_NAME_PREDICATE);
    }
    public static BiPredicate<UserData, AddUserLayer> getPredicate(String value) {
        return MAP.get(value);
    }
}
