package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to find: ");
        int element = input.nextInt();

        System.out.println("The Current Array is: ");
        System.out.println(Arrays.toString(nums));

        int[] output = TimesFound(nums, element);
        System.out.println("The first and last occurrence of " + element + " is: " + Arrays.toString(output));
    }

    static int[] TimesFound(int[] arr, int element) {
        int[] ans = {-1, -1};

        int first = search(arr, element, true);
        int last = search(arr, element, false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int search(int[] nums, int target, boolean found) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
               ans = mid;
               if (found) {
                   end = mid -1;
               }else{
                   start = mid + 1;
               }
            }
        }

        return ans;
    }
}
