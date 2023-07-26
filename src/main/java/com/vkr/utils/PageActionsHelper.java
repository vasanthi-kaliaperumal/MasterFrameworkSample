package com.vkr.utils;

import com.vkr.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Consumer;

public class PageActionsHelper {
    private PageActionsHelper(){}

    public static void click(By by){
        DriverManager.getDriver().findElement(by).click();
    }
    public static void sendKeys(By by,String value){
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }
    public static void select(By by, Consumer<Select> consumer) {
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
    }
    public static String getText(By by) {
        return DriverManager.getDriver().findElement(by).getText();
    }
}
