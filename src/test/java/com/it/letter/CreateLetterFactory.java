package com.it.letter;

import java.util.ResourceBundle;

public class CreateLetterFactory {
    private static ResourceBundle resourceUser = ResourceBundle.getBundle("letter");

    public static CreateLetter setLetterData() {
        return new CreateLetter(resourceUser.getString("to"),
                resourceUser.getString("subject"),
                resourceUser.getString("body"));
    }
}
