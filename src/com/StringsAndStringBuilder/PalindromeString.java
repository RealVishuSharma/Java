package com.StringsAndStringBuilder;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String elements = "";
        System.out.println("Enter the value of String: ");
        elements = input.next();


        boolean out = Palindrome(elements);
        if (out) {
            System.out.println("The given string is Palindrome!");
        } else {
            System.out.println("The Given String is not Palindrome!");
        }
    }

    static boolean Palindrome(String element) {
        element = element.toLowerCase();
        for (int i = 0; i < element.length() / 2; i++) {
            char start = element.charAt(i);
            char end = element.charAt(element.length() - 1 - i) ;

            if (start != end) {
                return false;
            }
        }
       return true;
    }
}
