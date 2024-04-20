package com.PatternSolver;

import java.util.Scanner;

public class PatternQues3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern3(length);
    }

    static void Pattern3(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
