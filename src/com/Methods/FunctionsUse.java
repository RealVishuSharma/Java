package com.Methods;

import java.util.Scanner;

public class FunctionsUse {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        System.out.println("The Sum is: " + add);
    }
}
