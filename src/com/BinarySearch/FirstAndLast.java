package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to find: ");
        int element = input.nextInt();

        System.out.println("The Current Array is: ");
        System.out.println(Arrays.toString(nums));

        TimesFound(nums, element);
    }

    static int TimesFound(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (element < arr[mid]) {
                end = mid - 1;
            } else if (element > arr[mid]) {
                start = mid + 1;
            } else {
                
            }
        }
    }
}
