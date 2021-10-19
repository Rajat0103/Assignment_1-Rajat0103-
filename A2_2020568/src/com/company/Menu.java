package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements  RunMenu{
    public ArrayList<Lecture_material> lectures = new ArrayList<>();
    public ArrayList<Assessment> assessments = new ArrayList<>();
    public ArrayList<Comment> comments = new ArrayList<>();
    public StudentMenu studentMenu = new StudentMenu();
    public InstructorMenu instructorMenu = new InstructorMenu();
    private boolean continueInput = true;

    public void run() {
        runMenu();
    }

    public void runMenu() {
        while(true){
            display_menu();

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            handleInput(option);
            if(!continueInput)
                return;
        }
    }

    private void handleInput(int option) {
        if(option == 1){
            instructorMenu.run(lectures, assessments, comments, studentMenu);
        }
        else if(option == 2){
            studentMenu.run(lectures, assessments, comments);
        }
        else if (option == 3){
            return;
        }
        else{
            return;
        }
    }

    private void display_menu() {
        System.out.println("Welcome to Backpack");
        System.out.println("1. Enter as instructor");
        System.out.println("2. Enter as student");
        System.out.println("3. Exit");
    }

}
