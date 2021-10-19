package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String id;
    private ArrayList<Submission> submissions;

    public Student(String id) {
        this.id = id;
        submissions = new ArrayList<>();
    }

    public static void view_comments(ArrayList<Comment> comments) {
        for(Comment comment: comments){
            System.out.println(comment);
        }
    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }
    public String getId() {
        return id;
    }

    public void submit_assessment(ArrayList<Assessment> assessments) {
        int count = 0;
        System.out.println("Pending assessments");
        for(int i=0; i<assessments.size(); i++){
            if(submissions.get(i).isPending()){
                System.out.println("ID: " + i + " " + assessments.get(i));
                count++;
            }
        }

        if(count == 0)
            return;

        System.out.print("Enter ID of assessment: ");

        Scanner input = new Scanner(System.in);
        int id = input.nextInt();

        Assessment assessment = assessments.get(id);
        if(assessment.getClass().equals(new Assignment().getClass())){
            System.out.println("Enter filename of assignment: ");
        }
        else{
            System.out.println(((Quiz)assessment).getQuestion());
        }

        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();

        Submission submission = submissions.get(id);
        submission.setPending(false);
        submission.setFilename(filename);
    }

    public void view_grades(ArrayList<Assessment> assessments) {
        System.out.println("Graded Submissions");
        for(Submission submission: submissions){
            if(!submission.isPending() && submission.isGraded()){
                System.out.println("Submission: "+submission.getFilename());
            }
        }
        System.out.println("\nUngraded Submissions");
        for(Submission submission: submissions){
            if(!submission.isPending() && !submission.isGraded()){
                System.out.println("Submission: "+submission.getFilename());
            }
        }
    }

    public void add_comments(ArrayList<Comment> comments) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter comment: ");
        String problem_statement = input.nextLine();

        comments.add(new Comment(problem_statement, id, new Date()));
    }
}
