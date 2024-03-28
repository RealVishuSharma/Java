package com.StringsAndStringBuilder;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String para = "";
        System.out.println("Enter the paragraph: ");
        para = input.nextLine();

        String paragraph = "";

        for (int i = 0; i < para.length() ; i++) {
            char current  = para.charAt(i);
            if (i % 2 == 0 ) {
                current = Character.toUpperCase(current);
            } else if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                current = Character.toUpperCase(current);
            } else {
                current = Character.toLowerCase(current);
            }
            paragraph += current;
        }

        System.out.println(paragraph);
    }
}
