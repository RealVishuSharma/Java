package com.ArrayAndArrayList;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Length of the Array: ");
        int len = input.nextInt();

        System.out.println("Enter the elements of the Array: ");
        int[] var = new int[len];
        for (int i = 0; i < len; i++) {
            var[i] = input.nextInt();
        }

        int  maxVal = var[0];
        for (int i = 0; i < len; i++) {
            if (var[i] > maxVal) {
                maxVal = var[i];
            }
        }

        System.out.println("The maximum value is: " + maxVal);

    }
}
