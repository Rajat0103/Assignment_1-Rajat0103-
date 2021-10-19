package com.company;

public class Submission {
    private int assessment_id;
    private boolean pending = true;
    private String filename = "";
    private boolean graded = false;
    private int marks = 0;

    Submission(int id){
        this.assessment_id = id;
    }

    public int getAssessment_id() {
        return assessment_id;
    }
    public void setAssessment_id(int assessment_id) {
        this.assessment_id = assessment_id;
    }
    public boolean isGraded() {
        return graded;
    }
    public void setGraded(boolean graded) {
        this.graded = graded;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public boolean isPending() {
        return pending;
    }
    public void setPending(boolean pending) {
        this.pending = pending;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

}
