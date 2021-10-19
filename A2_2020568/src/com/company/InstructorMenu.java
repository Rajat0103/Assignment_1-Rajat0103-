package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class InstructorMenu {
    private boolean continueInput = true;
    private ArrayList<Instructor> instructors = new ArrayList<>();

    InstructorMenu(){
        instructors.add(new Instructor("I0"));
        instructors.add(new Instructor("I1"));
    }

    public void run(ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments, StudentMenu studentMenu) {
        int instructor_id = chooseInstructor();
        runMenu(instructor_id, lectures, assessments, comments, studentMenu);
    }

    private void runMenu(int instructor_id, ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments, StudentMenu studentMenu) {
        continueInput = true;
        while(true){
            System.out.println("Welcome I"+instructor_id);
            display_menu();

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            handleInput(option, instructor_id, lectures, assessments, comments, studentMenu);
            if(!continueInput)
                return;
        }
    }

    private void handleInput(int option, int instructor_id, ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments, StudentMenu studentMenu){
        if (option == 1) {
            instructors.get(instructor_id).add_class_material(lectures, studentMenu);
        }
        else if (option == 2) {
            instructors.get(instructor_id).add_class_assessments(assessments, studentMenu);
        }
        else if (option == 3) {
            instructors.get(instructor_id).view_lecture(lectures);
        }
        else if (option == 4) {
            instructors.get(instructor_id).view_assessment(assessments);
        }
        else if (option == 5) {
//            System.out.println("grade assessments selected");
        }
        else if (option == 6) {
//            System.out.println("close assessments selected");
        }
        else if (option == 7) {
            Instructor.view_comment(comments);
        }
        else if (option == 8) {
            instructors.get(instructor_id).add_comment(comments);
        }
        else if (option == 9) {
//            System.out.println("logout selected");
            continueInput = false;
            return;
        }
        else {
//            System.out.println("wrong option selected");
            continueInput = false;
            return;
        }
    }

    private void display_menu() {
        System.out.println("1. Add class material");
        System.out.println("2. Add assessments");
        System.out.println("3. View lecture materials");
        System.out.println("4. View assessments");
        System.out.println("5. Grade assessments");
        System.out.println("6. Close assessment");
        System.out.println("7. View comments");
        System.out.println("8. Add comments");
        System.out.println("9. Logout");
    }

    private int chooseInstructor() {
        System.out.println("Instructors: ");
        for (int i = 0; i < instructors.size(); i++) {
            System.out.println(i + " - " + instructors.get(i).getId());
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Choose id: ");
        int instructor_id = input.nextInt();
        return instructor_id;
    }
}
