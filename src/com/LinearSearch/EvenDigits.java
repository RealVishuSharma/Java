package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The current Array is: ");
        System.out.println(Arrays.toString(array));

        int output = even(array);
        System.out.println("The no. of elements having even length is : " + output);
    }

    static int even(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (check(j)) {
                count++;
            }
        }
        return count;
    }

    static boolean check(int num) {
        String converted = Integer.toString(num);
        return converted.length() % 2 == 0;
    }
}
