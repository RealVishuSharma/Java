package com.Methods;

import java.util.Scanner;

public class FunctionsUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //
        sum();
        //
        System.out.println("Please Enter your name: ");
        String naam = input.nextLine();
        String message = greet(naam);
        System.out.println(message);

    }

    static void sum() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        System.out.println("The Sum is: " + add);
    }

    // Returning same datatype as  of  functions

    static String greet(String name) {
        return "How are you, " + name + "!";
    }

}