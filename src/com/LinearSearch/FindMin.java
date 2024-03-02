package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] num = new int[length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("The Array is: " + Arrays.toString(num));

       int mini =  Min(num);
        System.out.println("The minimum number is " + mini);
    }

    static int Min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
