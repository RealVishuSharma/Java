package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array : ");
        int length = input.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter the Element you want to search: ");
        int element = input.nextInt();

        System.out.println("The Current Array is : ");
        System.out.println(Arrays.toString(array));

        int output = Search(array, element);
        System.out.println("The Ceiling Value of the Given Element is: " + output);

    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[mid + 1];
    }
}
