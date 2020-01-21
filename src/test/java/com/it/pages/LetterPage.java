package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LetterPage extends BasePage {
    public String sendingTime;
    @FindBy(id = "to")
    private WebElement inputTo;

    @FindBy(name = "subject")
    private WebElement inputSubject;

    @FindBy(id = "text")
    private WebElement inputBody;

    @FindBy(name = "send")
    private WebElement send;

    @FindBy(xpath = "(//div[@class='received']/div[@class='field_value']/span)[1]")
    private WebElement time;
    @FindBy(xpath = "//div[@class='message_header clear']/h3")
    private WebElement subject;

    public void sendLetter(String to, String subject, String body) {
        inputTo.sendKeys(to);
        inputSubject.sendKeys(subject);
        inputBody.sendKeys(body);
        send.click();
        sendingTime = new SimpleDateFormat("HH:mm").format(new Date());
    }

    public String getLetterSubject() {
        return subject.getText();
    }

    public String getLetterTime() {
        return time.getText();
    }

}
