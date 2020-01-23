package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {


    @Test
    public void testLogin() {
        Assert.assertEquals(app.dashboard.getLblUserEmail(), validUser.email);
    }

    @Test
    public void testSendLetter() {
        app.dashboard.createLetter();
        app.letter.sendLetter(letter);
        app.dashboard.openLastIncomeMessage();
        Assert.assertEquals(app.incomeLetter.getLetterData(), letter);
    }
}
