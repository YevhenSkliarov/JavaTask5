package com.it.letter;

import java.util.ResourceBundle;

public class LetterFactory {
    private static ResourceBundle resourceUser = ResourceBundle.getBundle("letter");

    public static Letter setLetterData() {
        return new Letter(resourceUser.getString("to"),
                resourceUser.getString("subject"),
                resourceUser.getString("body"));
    }
}
