package com.vkr.fixtures.addusers.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.vkr.fixtures.addusers.dataprovider.UserData;

public class AddUserTemplate implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(UserData.class).addTemplate("valid",new Rule(){{
            add("userRole",random("ESS","Admin"));
            add("employeeName",uniqueRandom("Ariya","Anusha"));
            add("userName",random("abcdef1234"));
            add("status",random("Enabled","Disabled"));
            add("password",random("Password@123"));
            add("message","Success message is not displayed");
        }});
        Fixture.of(UserData.class).addTemplate("just_employee",new Rule(){{
            add("userName",random("abcdef1234"));
        }});
    }
}
