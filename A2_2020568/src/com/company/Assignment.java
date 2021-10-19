package com.company;

public class Assignment extends Assessment implements Printable{
    private final String problem_statement;
    private final int maxmarks;

    public Assignment(String problem_statement, int maxmarks) {
        super();
        this.problem_statement = problem_statement;
        this.maxmarks = maxmarks;
    }
    public Assignment() {
        this.problem_statement = "";
        this.maxmarks = 0;
    }

    @Override
    public String toString() {
        return "Assignment: " + problem_statement + ' ' +
                "Max Mark: " + maxmarks;
    }
}
