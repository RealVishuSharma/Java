package com.PatternSolver;

import java.util.Scanner;

public class PatternQues5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern5(length);
    }

    static void Pattern5(int n) {
        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            if (i >= n/2) {
                for (int j = 1; j < n - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
