package com.it.helpers;

import com.it.letter.CreateLetter;
import com.it.pages.CreateLetterPage;

public class CreateCreateLetterHelper extends CreateLetterPage {
    public void sendLetter(CreateLetter createLetter) {
        sendLetter(createLetter.to, createLetter.subject, createLetter.body);
    }
}
