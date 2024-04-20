package com.PatternSolver;

import java.util.Scanner;

public class PatternQues2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern2(length);
    }

    static void Pattern2(int l) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
