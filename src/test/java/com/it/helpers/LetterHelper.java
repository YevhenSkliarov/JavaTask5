package com.it.helpers;

import com.it.letter.Letter;
import com.it.pages.LetterPage;

public class LetterHelper extends LetterPage {
    public void sendLetter(Letter letter) {
        sendLetter(letter.to, letter.subject, letter.body);
    }
}
