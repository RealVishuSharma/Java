package com.PatternSolver;

import java.util.Scanner;

public class PatternQues8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Pattern: ");
        int length = input.nextInt();
        
        Pattern8(length);
    }
    
    static void Pattern8(int m) {
        m = 2 * m;
        int original = m;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= m; j++) {
                int toPrint = original - Math.min(Math.min(i, j), Math.min(m- i, m - j));
                System.out.print(toPrint + " ");
            }

            System.out.println();
        }
    }
}
