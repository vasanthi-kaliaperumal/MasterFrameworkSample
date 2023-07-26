package com.vkr.tests.web.users;


import com.vkr.pages.LoginPage;
import com.vkr.tests.web.base.WebBase;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

class AddUsersTest extends WebBase {

    @ParameterizedTest
    @EnumSource(value = AddUsersScenario.class)
    void testAddUsers(AddUsersScenario addUsersScenario){
        boolean isMsgDisplayed = new LoginPage()
                .loginToApplications("Admin","admin123")
                .navigateToAddUserPage()
                .getUserActionLayer()
                .setAddButton()
                .fillDetails(addUsersScenario.getUserData(),addUsersScenario.getPredicate());

        Assertions.assertThat(isMsgDisplayed)
                .withFailMessage(()->addUsersScenario.getUserData().getMessage())
                .isTrue();
    }
}
