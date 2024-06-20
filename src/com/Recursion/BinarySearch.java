package com.Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index: " + i);
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to find: ");
        int target = input.nextInt();

        int start = 0;
        int end = arr.length - 1;

        int output = Searching(arr, target, start, end);
        System.out.println("The element is present at index: " + output);
    }

    static int Searching(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        if (start > end){
            return -1;
        }

        if (target < arr[mid]) {
            return Searching(arr, target, start, mid - 1);
        } else if (target > arr[mid]) {
            return Searching(arr, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}
