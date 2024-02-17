package com.Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        int num = input.nextInt();

        boolean ans = Arm(num);
        if (ans) {
            System.out.println(num + " is a ArmStrong Number.");
        } else {
            System.out.println(num + " is not a ArmStrong Number.");
        }

    }

    static boolean Arm(int n) {
        int ans = n;
        int sum = 0;
        int count = 0;

        while (n != 0) {
            n = n /10;
            count++;
        }
        n = ans;
        while (n> 0) {
            int  digit = n % 10;
            digit = (int) Math.pow(digit, count);
            sum += digit;
            n = n / 10;
        }
//        System.out.println(sum);
        return sum == ans;
    }

}
