package com.LinearSearch;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to find: ");
        int tar = input.nextInt();

        int res = LinearSearch(array, tar);
        System.out.println("The element is present in the array at index no." + res);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
