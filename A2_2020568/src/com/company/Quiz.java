package com.company;

public class Quiz extends Assessment implements Printable{
    private final String question;

    public Quiz(String question) {
        super();
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
    @Override
    public String toString() {
        return "Question: " + question;
    }
}
