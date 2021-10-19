package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
    private boolean continueInput = true;
    private final ArrayList<Student> students = new ArrayList<Student>();

    StudentMenu(){
        students.add(new Student("S0"));
        students.add(new Student("S1"));
        students.add(new Student("S2"));
    }

    public void run(ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments) {
        int student_id = chooseStudent();
        runMenu(student_id, lectures, assessments, comments);
    }

    private void runMenu(int student_id, ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments) {
        continueInput = true;
        while(true){
            System.out.println("Welcome S"+student_id);
            display_menu();

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            handleInput(option, student_id, lectures, assessments, comments);
            if(!continueInput)
                return;
        }
    }

    private void handleInput(int option, int student_id, ArrayList<Lecture_material> lectures, ArrayList<Assessment> assessments, ArrayList<Comment> comments) {
        if (option == 1){
            view_lecture_materials(lectures);
        }
        else if(option == 2){
            view_assessments(assessments);
        }
        else if(option == 3){
            students.get(student_id).submit_assessment(assessments);
        }
        else if(option == 4){
            students.get(student_id).view_grades(assessments);
        }
        else if(option == 5){
            Student.view_comments(comments);
        }
        else if(option == 6){
            students.get(student_id).add_comments(comments);
        }
        else if(option == 7){
            continueInput = false;
            return;
        }
        else{
            continueInput = false;
            return;
        }
    }

    private void view_assessments(ArrayList<Assessment> assessments) {
        for(int i=0; i< assessments.size(); i++){
            System.out.print("ID: " + i + " ");
            System.out.println(assessments.get(i) + " ");
            System.out.println("----------------");
        }
    }

    private void view_lecture_materials(ArrayList<Lecture_material> lectures) {
        for(Lecture_material material: lectures){
            System.out.println(material);
        }
    }

    private void display_menu() {
        System.out.println("1. View lecture materials");
        System.out.println("2. View assessments");
        System.out.println("3. Submit assessment");
        System.out.println("4. View grades");
        System.out.println("5. View comments");
        System.out.println("6. Add comments");
        System.out.println("7. Logout");
    }

    private int chooseStudent() {
        System.out.println("Students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + " - " + students.get(i).getId());
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Choose id: ");
        int student_id = input.nextInt();
        return student_id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
