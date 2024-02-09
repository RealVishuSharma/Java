package com.loops;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number: ");
        int num = input.nextInt();

        System.out.println("Enter the integer whose repetition you want to find: ");
        int rep = input.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == rep) {
                count++;
            }
            num = num/10;
        }

        System.out.println("The repetition of " + rep + " is : " + count);

    }
}
