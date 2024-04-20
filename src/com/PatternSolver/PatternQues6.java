package com.PatternSolver;

import java.util.Scanner;

public class PatternQues6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern6(length);
    }

    static void Pattern6(int a) {
        for (int i = 0; i < a; i++) {
            if (i < a /2) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < a - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            if (i >= a / 2) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < a - i + 1; j++) {
                    System.out.println(" ");
                }

                System.out.println();
            }
        }
    }
}
