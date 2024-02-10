package com.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the Operation: ");
            char op = input.next().trim().charAt(0);

            System.out.print("Enter the Second number: ");
            int num2 = input.nextInt();

            if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*' ) {
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op == 'X') {
                break;
            }else{
                System.out.println("Invalid Operation!");
            }

            System.out.println("The Answer is: " + ans);

        }


    }
}
