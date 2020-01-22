package com.it.letter;

import java.util.Objects;


public class Letter {
    public String to;
    public String subject;
    public String body;

    public Letter(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(to, letter.to) &&
                Objects.equals(subject, letter.subject) &&
                Objects.equals(body, letter.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, subject, body);
    }

    @Override
    public String toString() {
        return  ("to= " + to + ", subject= " + subject + ", body= " + body).trim();
    }
}
