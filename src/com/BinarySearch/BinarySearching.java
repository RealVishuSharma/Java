package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// Binary Searching for Sorted Arrays only (Ascending or Descending).

public class BinarySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] wish = new int[length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < wish.length; i++) {
            wish[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to search: ");
        int search = input.nextInt();

        System.out.println(Arrays.toString(wish));

        int ans = Searching(wish, search);
        System.out.println("The element is found at index: " + ans);
    }

    static int Searching(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] < arr[end]) {
                if (element < arr[mid]) {
                    end = mid - 1;
                } else if (element > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }else if (arr[start] >= arr[end]) {
                if (element < arr[mid]) {
                    start = mid + 1;
                } else if (element > arr[mid]) {
                    end = mid -1;
                } else {
                    return mid;
                }
            }else {
                return mid;
            }
        }
        return -1;
    }
}
