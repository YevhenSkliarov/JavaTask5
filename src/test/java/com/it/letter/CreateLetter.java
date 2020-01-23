package com.it.letter;

import java.util.Objects;


public class CreateLetter {
    public String to;
    public String subject;
    public String body;

    public CreateLetter(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateLetter createLetter = (CreateLetter) o;
        return Objects.equals(to, createLetter.to) &&
                Objects.equals(subject, createLetter.subject) &&
                Objects.equals(body, createLetter.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, subject, body);
    }

    @Override
    public String toString() {
        return ("to= " + to + ", subject= " + subject + ", body= " + body).trim();
    }
}
