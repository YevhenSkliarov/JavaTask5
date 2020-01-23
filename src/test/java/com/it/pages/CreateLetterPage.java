package com.it.pages;

import com.it.letter.CreateLetter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetterPage extends BasePage {
    public String sendingTime;
    @FindBy(id = "to")
    private WebElement to;

    @FindBy(name = "subject")
    private WebElement subject;

    @FindBy(id = "text")
    private WebElement body;

    @FindBy(name = "send")
    private WebElement send;

    public void sendLetter(String letterTo, String letterToSubject, String letterToBody) {
        to.sendKeys(letterTo);
        subject.sendKeys(letterToSubject);
        body.sendKeys(letterToBody);
        send.click();
    }

}
