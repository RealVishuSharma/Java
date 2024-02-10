package com.SwitchNested;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Employee ID: ");
        int EmpID = input.nextInt();
        System.out.print("Please Enter your Department: ");
        String dep = input.next();

        switch (EmpID) {
            case 1 -> System.out.println("Abhay Sharma");
            case 2 -> System.out.println("Vidit Tyagi");
            case 3 -> {
                System.out.println("Vishu Sharma");
                switch (dep) {
                    case "IT" -> System.out.println("from IT Department");
                    case "Management" -> System.out.println("from Management Department");
                    default -> System.out.println("Please Enter a valid Department.");
                }
            }
            default -> System.out.println("No ID found!");
        }
    }
}
