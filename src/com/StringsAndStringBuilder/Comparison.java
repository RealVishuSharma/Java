package com.StringsAndStringBuilder;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*
        String a = "Vishu";
        String b = "Vishu";
*/
        System.out.println("Enter the first element: ");
        String n1 = input.next();
        System.out.println("Enter the second element: ");
        String n2 = input.next();

        System.out.println(n1 == n2);       // This will check if both the variables are referencing to the same data
        // in the heap memory. If yes will output true, otherwise false.

        // To check only the values, use .equals() method.
        System.out.println(n1.equals(n2));
    }
}
