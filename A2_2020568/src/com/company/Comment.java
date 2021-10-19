package com.company;

import java.util.Date;

public class Comment {
    String comment;
    Date date;
    String problem;
    public Comment(String problem_statement, String comment, Date date){
        this.comment = comment;
        this.date=date;
        this.problem=problem_statement;
    }
    public String toString(){
        return (problem+" - "+comment +"\n"+date);
    }
}
