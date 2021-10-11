package com.company;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setu setu = new setu();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Register Hospital");
        System.out.println("3. Register Citizen");
        System.out.println("4. Add Slot for Vaccination");
        System.out.println("5. Book Slot for Vaccination");
        System.out.println("6. List all slots for a hospital");
        System.out.println("7. Check Vaccination Status");
        System.out.println("8. Exit");
        System.out.println("----------------------------------------------------------------");
        while(true) {
            int n=sc.nextInt();
            if (n==1){
                setu.add_vacc();
            }
            else if(n==2){
                setu.register_hospital();

            }
            else if(n==3){
                setu.reg_citizen();

            }
            else if(n==4){
                setu.create_slot();

            }
            else if(n==5){
                setu.Book_slot();

            }
            else if(n==6){
                setu.available_slot();

            }
            else if(n==7){
                setu.status();

            }
            else if(n==8){
                break;
            }
            else{
                System.out.println("wrong choice");
            }

        }


    }
}