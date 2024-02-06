package com.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Age: ");
        int age = input.nextInt();
        System.out.println("Your Age is: " + age);

    }
}