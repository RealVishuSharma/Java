package com.PatternSolver;

import java.util.Scanner;

public class PatternQues7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern7(length);
    }

    static void Pattern7(int b) {
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j < b - i ; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
