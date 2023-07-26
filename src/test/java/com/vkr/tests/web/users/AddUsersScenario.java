    package com.vkr.tests.web.users;

    import br.com.six2six.fixturefactory.Fixture;
    import com.vkr.fixtures.addusers.dataprovider.UserData;
    import com.vkr.pages.pagelayers.adduserspage.AddUserLayer;
    import lombok.Getter;

    import java.util.function.BiPredicate;

    @Getter
    public enum AddUsersScenario {
        VALID(AddUsersPredicateFactory.getPredicate("valid"),
                Fixture.from(UserData.class).gimme("valid")),

        JUST_EMPLOYEE_NAME(AddUsersPredicateFactory.getPredicate("just_employee"),
                Fixture.from(UserData.class).gimme("just_employee"));

        private final BiPredicate<UserData, AddUserLayer> predicate;
        private final UserData userData;

        AddUsersScenario(BiPredicate<UserData, AddUserLayer> predicate, UserData userData) {
            this.predicate = predicate;
            this.userData = userData;
        }

    }