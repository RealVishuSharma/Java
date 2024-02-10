package com.SwitchNested;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a fruit: ");
        String fruit = input.next();

        switch (fruit) {
            case "Mango" ->
                System.out.println("The king of fruits.");

            case "Orange" ->
                System.out.println("A fruit which matches its color.");

            case "Grapes" ->
                System.out.println("Grapes are good but only when they are sweet.");

            case "Banana" ->
                System.out.println("Good to increase weight.");

            default ->
                System.out.println("Please Enter a valid fruit.");

        }
    }
}
