package com.it.pages;

import com.it.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    static protected WebDriver driver = DriverFactory.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
