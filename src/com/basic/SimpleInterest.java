package com.basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Principal Amount: ");
        float principal = input.nextFloat();

        System.out.print("Please Enter the Rate : ");
        float rate = input.nextFloat();

        System.out.print("Please Enter the time : ");
        float time = input.nextFloat();

        float si = (principal * rate * time) /100;
        System.out.println("The total Interest will be: " + si);
    }
}
