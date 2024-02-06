package com.loops;

import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Word: ");
        char first = input.next().trim().charAt(0);

        if(first >= 'a' && first <= 'z') {
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }

    }
}
