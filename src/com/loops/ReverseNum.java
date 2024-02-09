package com.loops;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number: ");
        int num = input.nextInt();
        int rev = 0;

        while (num > 0) {
            int calc = num % 10;
            rev = rev *10 + calc;
            num = num/10;
        }
        System.out.println("The Reverse of the number is: " + rev);
    }
}
