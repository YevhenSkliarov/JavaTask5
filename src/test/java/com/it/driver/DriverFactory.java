package com.it.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static com.it.common.Constants.*;

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriver driver = null;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if("remote".equals(driverSysProperty)){
            String USERNAME = "bsuser61791";
            String AUTOMATE_KEY = "rnSk16XZhoyg8rBCbxvW";
            String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Edge");
            caps.setCapability("browser_version", "79.0 beta");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1024x768");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
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
