package com.it.pages;

import com.it.letter.Letter;
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

    @FindBy(xpath = "(//div[@class='field_value'])[2]")
    private WebElement to;
    @FindBy(xpath = "//div[@class='message_header clear']/h3")
    private WebElement subject;
    @FindBy(xpath = "//div[@class='message_body']")
    private WebElement body;

    public void sendLetter(String to, String subject, String body) {
        inputTo.sendKeys(to);
        inputSubject.sendKeys(subject);
        inputBody.sendKeys(body);
        send.click();
    }

    public String getSubject() {
        return subject.getText();
    }

    public String getTo() {
        return to.getText();
    }

    public String getBody() {
        return body.getText();
    }

    public Letter getLetterData() {
        return new Letter(getTo(), getSubject(), getBody());
    }

}
