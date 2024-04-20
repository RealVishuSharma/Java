package com.PatternSolver;

import java.util.Scanner;

public class PatternQues4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();

        Pattern4(length);
    }

    static void Pattern4(int v) {
        for (int i = 0; i <= v; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
