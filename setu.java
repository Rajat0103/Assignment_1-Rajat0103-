package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class setu {
    int uniq = 100000;
    Scanner sc = new Scanner(System.in);
    public String[][] vacc = new String[100][];
    public String[][] hosp = new String[100][3];
    public String[][] citizen = new String[10000000][];
    public String[][][] slot_create = new String[100000000][][];
    public String[][] book_slot = new String[100000000][];

    public void add_vacc() {
        System.out.println("enter the vaccine name");
        String name = sc.next();
        System.out.println("enter the number of doses");
        String nod = sc.next();
        String gap="0";
        if (!nod.equals("1")){
            System.out.println("enter the gap between doses");
            gap = sc.next();
        }
        String[] t = {name, nod, gap};
        for (int i = 0; i < vacc.length; i++) {
            if (vacc[i] == null) {
                vacc[i] = t;
                System.out.print("Vaccine name: ");
                System.out.print(vacc[i][0]);
                System.out.print(", ");
                System.out.print("Number of doses: ");
                System.out.print(vacc[i][1]);
                System.out.print(", ");
                System.out.print("Gap between doses: ");
                System.out.println(vacc[i][2]);
                break;
            }
        }

    }

    public void register_hospital() {
        System.out.println("enter the hospital name");
        String name = sc.next();
        System.out.println("enter the pincode");
        String pin = sc.next();
        String[] t = {name, pin, String.valueOf(uniq)};
        uniq = uniq + 1;
        for (int i = 0; i < hosp.length; i++) {
            if (hosp[i][0] == null) {
                hosp[i] = t;
                System.out.print("Hospital Name: ");
                System.out.print(hosp[i][0]);
                System.out.print(", ");
                System.out.print("PinCode: ");
                System.out.print(hosp[i][1]);
                System.out.print(", ");
                System.out.print("Unique ID: ");
                System.out.println(hosp[i][2]);
                break;
            }
        }

    }

    public void reg_citizen() {
        System.out.println("enter the name");
        String name = sc.next();
        System.out.println("enter the age");
        String age = sc.next();
        System.out.println("enter the unique id");
        String id = sc.next();
        String shot = "0";
        String vaccine = "";
        String[] t = {name, age, id, shot, vaccine};
        if (id.length() == 12) {
            if (Integer.parseInt(age) >= 18) {
                for (int i = 0; i < citizen.length; i++) {
                    if (citizen[i] == null) {
                        citizen[i] = t;
                        System.out.print("Citizen Name: ");
                        System.out.print(name);
                        System.out.print(", ");
                        System.out.print("Age: ");
                        System.out.print(age);
                        System.out.print(", ");
                        System.out.print("Unique ID: ");
                        System.out.println(id);
                        break;
                    }
                }
            }
            else{
                System.out.print("Citizen Name: ");
                System.out.print(name);
                System.out.print(", ");
                System.out.print("Age: ");
                System.out.print(age);
                System.out.print(", ");
                System.out.print("Unique ID: ");
                System.out.println(id);
                System.out.println("Only above 18 are allowed");

            }
        }
        else {
            System.out.println("wrong Unique ID");
        }
    }
    public void create_slot() {
        System.out.println("enter the hospital id");
        String idh = sc.next();
        if(idh.length()==6) {
            if (hosp[0][0] == null) {
                System.out.println("not register");
            } else {
                for (int i = 0; i < hosp.length; i++) {
                    if (hosp[i][2] != null) {
                        System.out.println("enter number of slots to be added");
                        int p = sc.nextInt();
                        if (slot_create[0] != null) {
                            for (int j = 0; j < p; j++) {
                                System.out.println("enter the day number");
                                String day = sc.next();
                                System.out.println("enter quantity");
                                String quantity = sc.next();
                                System.out.println("select vaccine");
                                for (int g = 0; g < vacc.length; g++) {
                                    if (vacc[g] == null) {
                                        break;
                                    }
                                    System.out.print(g);
                                    System.out.print(".");
                                    System.out.println(vacc[g][0]);
                                }
                                String vac = sc.next();
                                String[][] t = {{idh, day}, {quantity, vac}};
                                for (int o = 0; o < slot_create.length; o++) {
                                    if (slot_create[o] == null) {
                                        slot_create[o] = t;
                                        System.out.print("Slot added by Hospital ");
                                        System.out.print(idh);
                                        System.out.print(" for day ");
                                        System.out.print(day);
                                        System.out.print(", ");
                                        System.out.print("Available Quantity: ");
                                        System.out.print(quantity);
                                        System.out.print("of vaccine ");
                                        System.out.println(vac);
                                        break;
                                    } else if (slot_create[o][0][0].equals(idh)) {
                                        slot_create[o] = t;
                                        System.out.print("Slot added by Hospital ");
                                        System.out.print(idh);
                                        System.out.print(" for day ");
                                        System.out.print(day);
                                        System.out.print(", ");
                                        System.out.print("Available Quantity: ");
                                        System.out.print(quantity);
                                        System.out.print("of vaccine ");
                                        System.out.println(vac);
                                        break;
                                    }
                                }

                            }
                        } else {

                            for (int j = 0; j < p; j++) {
                                System.out.println("enter the day number");
                                String day = sc.next();
                                System.out.println("enter quantity");
                                String quantity = sc.next();
                                System.out.println("select vaccine");
                                for (int g = 0; g < vacc.length; g++) {
                                    if (vacc[g] == null) {
                                        break;
                                    }
                                    System.out.print(g);
                                    System.out.print(".");
                                    System.out.println(vacc[g][0]);
                                }
                                String vac = sc.next();
                                String[][] t = {{idh, day}, {quantity, vac}};
                                for (int g = 0; g < slot_create.length; g++) {
                                    if (slot_create[g] == null) {
                                        slot_create[g] = t;
                                        System.out.print("Slot added by Hospital ");
                                        System.out.print(idh);
                                        System.out.print(" for day ");
                                        System.out.print(day);
                                        System.out.print(", ");
                                        System.out.print("Available Quantity: ");
                                        System.out.print(quantity);
                                        System.out.print("of vaccine ");
                                        System.out.println(vac);
                                        break;
                                    }

                                }
                            }

                        }
                    }
                    break;
                }

            }
        }
        else{
            System.out.println("wrong Unique id of hospital");
        }
    }

    public void Book_slot() {
        System.out.println("enter your unique id");
        String idc = sc.next();
        if (idc.length()==12) {
            int w = 0;
            System.out.println("1. search by area \n" +
                    "2. search by Vaccine \n" +
                    "3. exit ");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("enter the pincode of your area");
                String pin = sc.next();
                int x = 0;
                for (int v = 0; v < hosp.length; v++) {
                    if (hosp[v][1] != null) {
                        if (hosp[v][1].equals(pin)) {
                            System.out.print(hosp[v][2]);
                            System.out.print(" ");
                            System.out.println(hosp[v][0]);
                            x++;
                        }
                    }
                }
            } else if (n == 2) {
                System.out.println("enter vaccine name");
                String va = sc.next();
                for (int i = 0; i < slot_create.length; i++) {
                    if (this.slot_create[i] == null) {
                        break;
                    } else {

                        if (slot_create[i][1][1].equals(va)) {
                            for (int j = 0; j < hosp.length; j++) {
                                if (slot_create[i][0][0].equals(hosp[j][2])) {
                                    System.out.print(hosp[j][2]);
                                    System.out.print(" ");
                                    System.out.println(hosp[j][0]);
                                }
                            }
                        } else {
                            System.out.println("not available");

                        }

                    }
                }
            } else if (n == 3) {
                return;
            } else {
                System.out.println("enter wrong option");
            }
            System.out.println("enter the Hospital ID");
            String idq = sc.next();
            for (int i = 0; i < slot_create.length; i++) {
                if (slot_create[i] != null) {
                    if (!slot_create[i][1][0].equals("0")) {
                        if (slot_create[i][0][0].equals(idq)) {

                            System.out.print(i);
                            System.out.print("-> ");
                            System.out.print("Day: ");
                            System.out.print(slot_create[i][0][1]);
                            System.out.print(" Vaccine: ");
                            System.out.print(slot_create[i][1][1]);
                            System.out.print(" Available Qty: ");
                            System.out.println(slot_create[i][1][0]);
                        }
                    } else {
                        System.out.println("No slot available");
                        return;
                    }
                }
            }
            System.out.println(citizen[0][0]);
            System.out.println(" choose slot:");
            int s = sc.nextInt();
            for (int i = 0; i < citizen.length; i++) {
                if (citizen[i] != null) {

                    if (citizen[i][2].equals(idc)) {
                        int z = Integer.parseInt(citizen[i][3]) + 1;
                        citizen[i][3] = String.valueOf(z);
                        citizen[i][4] = slot_create[s][1][1];
                        System.out.print(citizen[i][0]);
                        System.out.print(" vaccinated with ");
                        System.out.println(slot_create[s][1][1]);
                        int c = Integer.parseInt(slot_create[s][1][0]);
                        slot_create[s][1][0] = String.valueOf(c - 1);
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("wrong Unique id");
        }
    }

    public void available_slot(){
        System.out.println("enter the Hospital ID");
        String  idq=sc.next();
        if(idq.length()==6) {
            for (int i = 0; i < slot_create.length; i++) {
                if (slot_create[i] != null) {
                    if (slot_create[i][0][0].equals(idq)) {
                        System.out.print("Day: ");
                        System.out.print(slot_create[i][0][1]);
                        System.out.print(" Vaccine: ");
                        System.out.print(slot_create[i][1][1]);
                        System.out.print(" Available Qty: ");
                        System.out.println(slot_create[i][1][0]);
                    }
                }
            }
        }
        else{
            System.out.println("wrong ID of hospital");
        }
    }

    public void status(){
        System.out.println("enter patient ID");
        String id=sc.next();
        if(id.length()==12) {
            for (int i = 0; i < citizen.length; i++) {
                if (citizen[i] != null) {
                    if (citizen[i][3].equals("0")) {
                        System.out.println("registered");
                        break;
                    } else {
                        for (int k = 0; k < vacc.length; k++) {
                            if (vacc[k] != null) {
                                if (vacc[k][0].equals(citizen[i][4])) {
                                    if (vacc[k][1].equals(citizen[i][3])) {
                                        System.out.println("FULLY VACCINATED");
                                        System.out.print("Vaccine Given: ");
                                        System.out.println(citizen[i][4]);
                                        System.out.print("Number of dose given: ");
                                        System.out.println(citizen[i][3]);
                                        break;
                                    } else {
                                        System.out.println("PARTIALLY VACCINATED");
                                        System.out.print("Vaccine Given: ");
                                        System.out.println(citizen[i][4]);
                                        System.out.print("Number of dose given: ");
                                        System.out.println(citizen[i][3]);
                                        System.out.println("Next Dose due date: ");
                                        int w=Integer.parseInt(vacc[k][2])+1;
                                        System.out.println(String.valueOf(w));
                                        break;
                                    }

                                }
                            }
                        }
                    }
                }
                break;
            }
        }
        else{
            System.out.println("wrong Unique id");
        }
    }
}
