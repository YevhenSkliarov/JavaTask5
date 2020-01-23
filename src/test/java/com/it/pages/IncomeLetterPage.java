package com.it.pages;

import com.it.letter.CreateLetter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomeLetterPage extends BasePage{

    @FindBy(xpath = "(//div[@class='field_value'])[2]")
    private WebElement to;
    @FindBy(xpath = "//div[@class='message_header clear']/h3")
    private WebElement subject;
    @FindBy(xpath = "//div[@class='message_body']")
    private WebElement body;

    public String getSubject() {
        return subject.getText();
    }

    public String getTo() {
        return to.getText();
    }

    public String getBody() {
        return body.getText();
    }

    public CreateLetter getLetterData() {
        return new CreateLetter(getTo(), getSubject(), getBody());
    }
}
