package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lblUserEmail;

    @FindBy(xpath = "//p[@class='make_message']")
    private WebElement newLetter;

    @FindBy(xpath = "//li[@class='new']")
    private WebElement income;
    @FindBy(xpath = "(//div[@class='row new'])[1]")
    private WebElement lastLetter;

    public String getLblUserEmail() {
        BASE_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(lblUserEmail));
        return lblUserEmail.getText();
    }

    public void createLetter() {
        newLetter.click();
    }

    public void openLastIncomeMessage() {
        income.click();
        lastLetter.click();
    }
}
