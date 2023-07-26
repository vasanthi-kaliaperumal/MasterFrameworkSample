package com.vkr.driver.manager.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverManager {
    private DriverManager(){}

    public static WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver getFirefoxDriver(){
        WebDriverManager.chromedriver().setup();
        return new FirefoxDriver();
    }

    public static WebDriver getEdgeDriver(){
        WebDriverManager.chromedriver().setup();
        return new EdgeDriver();
    }
}
