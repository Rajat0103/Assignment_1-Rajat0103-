package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Instructor {
    private String id;

    public Instructor(String id) {
        this.id = id;
    }

    public static void view_comment(ArrayList<Comment> comments) {
        for(Comment comment: comments){
            System.out.println(comment);
        }
    }

    public String getId() {
        return id;
    }

    public void add_class_material(ArrayList<Lecture_material> lectures, StudentMenu studentMenu) {
        System.out.println("1. Add Lecture Slide");
        System.out.println("2. Add Lecture Video");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option == 1){
            System.out.println("add lecture slide selected");
            add_lecture_slide(lectures);
        }
        else if(option == 2){
            System.out.println("add lecture video selected");
            add_lecture_video(lectures);
        }
        else{
            System.out.println("wrong option selected");
            return;
        }
    }

    private void add_material_in__students_pending_list(ArrayList<Assessment> assessments, StudentMenu studentMenu) {
        int id = assessments.size()-1;
        for(Student student: studentMenu.getStudents()){
            student.getSubmissions().add(new Submission(id));
        }
    }

    private void add_lecture_slide(ArrayList<Lecture_material> lectures) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter topic of slides: ");
        String topic = input.nextLine();

        System.out.print("Enter number of slides: ");
        int number = input.nextInt();

        System.out.println("Enter content of slides");

        ArrayList<String> content=new ArrayList<>();
        for(int i=0; i<number; i++) {
            System.out.print("Content of slide " + i + ": ");
            Scanner in = new Scanner(System.in);
            String slide_content = in.nextLine();
            content.add(slide_content);
        }

        lectures.add(new Lecture_slide(topic,number,content,new Date(),id));
    }

    private void add_lecture_video(ArrayList<Lecture_material> lectures) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter topic of video: ");
        String topic = sc.nextLine();

        System.out.print("Enter filename of video: ");
        String file_name = sc.nextLine();

        if (file_name.substring(file_name.length() - 4, file_name.length()).equals(".mp4")) {
            lectures.add(new Lecture_video(topic, file_name, new Date(), id));
        }
        else{
            System.out.println("please upload in .mp4 type");
        }
    }

    public void add_class_assessments(ArrayList<Assessment> assessments, StudentMenu studentMenu) {
        System.out.println("1. Add Assignment");
        System.out.println("2. Add Quiz");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option == 1){
            System.out.println("add assignment selected");
            add_assignment(assessments);
            add_material_in__students_pending_list(assessments, studentMenu);
        }
        else if(option == 2){
            System.out.println("add quiz selected");
            add_quiz(assessments);
            add_material_in__students_pending_list(assessments, studentMenu);
        }
        else{
            System.out.println("wrong option selected");
            return;
        }
    }

    private void add_assignment(ArrayList<Assessment> assessments) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter problem statement: ");
        String problem_statement = input.nextLine();

        System.out.print("Enter max marks: ");
        int max_marks = input.nextInt();

        assessments.add(new Assignment(problem_statement, max_marks));
    }
    private void add_quiz(ArrayList<Assessment> assessments) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quiz question: ");
        String question = input.nextLine();

        assessments.add(new Quiz(question));
    }

    public void add_comment(ArrayList<Comment> comments){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter comment: ");
        String problem_statement = input.nextLine();

        comments.add(new Comment(problem_statement, id, new Date()));
    }

    public void view_lecture(ArrayList<Lecture_material> lectures) {
        for(Lecture_material lecture: lectures){
            System.out.println(lecture);
        }
    }
    public void view_assessment(ArrayList<Assessment> assessments) {
        for(Assessment assessment: assessments) {
            System.out.println(assessment);
        }
    }
}
