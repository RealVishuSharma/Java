package com.Recursion;

import java.util.Scanner;

public class NumbersExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number from where you want to start printing: ");
        int n = input.nextInt();

        System.out.println("Enter the number where you want to end printing: ");
        int m = input.nextInt();

        System.out.println("Output: ");
        Recur(n, m);
    }

    static void Recur(int start, int end) {

        // Base Condition
        if (start == end) {
            System.out.println(start);
            return;
        }
        
        // Logic
        System.out.println(start);
        start++;

        // Recursive Call
        Recur(start, end);
    }
}
