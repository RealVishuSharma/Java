package com.loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

//        System.out.println("The fibonacci series till n is:");
//        System.out.println( first);
//        System.out.println(second);

        for(int i = 0; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
//            System.out.println(next);
        }

        System.out.println("The value in fibonacci Series at " + n + " is : " + second);
        input.close();

    }
}
