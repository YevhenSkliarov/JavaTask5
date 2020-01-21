package com.it.helpers;

import com.it.pages.BasePage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonHelper extends BasePage {
    public void stopApp() {
        driver.quit();
    }

    public String getCurrentTime() {
        return new SimpleDateFormat("HH:mm").format(new Date());
    }
}
