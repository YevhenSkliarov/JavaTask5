package com.it.tests;

import com.it.App;
import com.it.letter.CreateLetter;
import com.it.letter.CreateLetterFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    static protected App app = new App();
    static protected User validUser = UserFactory.getValidUser();
    static protected CreateLetter letter = CreateLetterFactory.setLetterData();

    @BeforeSuite
    public void setUp() {
        app.login.login(validUser);
    }

    @AfterSuite
    public void tearDownSuite() {
        app.common.stopApp();
    }
}
