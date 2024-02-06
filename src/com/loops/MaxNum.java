package com.loops;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float first = input.nextFloat();
        System.out.println("Enter the Second number: ");
        float second = input.nextFloat();
        System.out.println("Enter the third number");
        float third = input.nextFloat();

        float max = first;
        if(second > max) {
            max = second;
        }
        if(third > max) {
            max = third;
        }

        System.out.println("The Greatest number is: " + max);
    }
}
