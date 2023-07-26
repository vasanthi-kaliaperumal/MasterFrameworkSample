package com.vkr.pages.pagelayers.homepage;

import com.vkr.pages.enums.homepage.SubMenuText;
import com.vkr.pages.enums.homepage.TopMenuText;
import org.openqa.selenium.By;

import static com.vkr.utils.PageActionsHelper.*;

public class TopMenuLayer {

    private static final String MENU = "//b[text()='%s']/parent::a";
    private static final String SUB_MENU = "//b[text()='%s']/parent::a";

    public TopMenuLayer clickMenuItem(TopMenuText menuName){
        String xpath = String.format(MENU,menuName.getName());
        click(By.xpath(xpath));
        return this;
    }
    public TopMenuLayer clickSubMenuItem(SubMenuText subMenuName){
        String xpath = String.format(SUB_MENU,subMenuName.getName());
        click(By.xpath(xpath));
        return this;
    }

}
