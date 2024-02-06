package com.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        //While loop
        while (num <= 20) {
            System.out.println("The number using While loop is: " + num);
            num++;
        }

        // do while loop
        num = 5;
        do {
            System.out.println("Hello World! using while loop.");
        } while (num != 5);

        input.close();


    }
}
