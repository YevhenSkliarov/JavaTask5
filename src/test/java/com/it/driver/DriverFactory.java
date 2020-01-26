package com.it.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import static com.it.common.Constants.*;

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriver driver;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(BASE_IMPLICITLY_WAIT, TimeUnit.SECONDS);
        //driver.switchTo().activeElement();//switchTo - working with iframe
        driver.get(BASE_URL);
        return driver;
    }
}
