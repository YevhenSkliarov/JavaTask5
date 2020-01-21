package com.it.tests;

import com.it.App;
import com.it.letter.Letter;
import com.it.letter.LetterFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    static protected App app = new App();
    static protected User validUser = UserFactory.getValidUser();
    static protected Letter letter = LetterFactory.setLetterData();

    @BeforeSuite
    public void setUp() {
        app.login.login(validUser);
    }

    @AfterSuite
    public void tearDownSuite() {
        app.common.stopApp();
    }
}
