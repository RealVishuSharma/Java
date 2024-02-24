package com.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int len = input.nextInt();

        int[] let = new int[len];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < len; i++) {
            let[i] = input.nextInt();
        }

        System.out.println("The Given Array is: " + Arrays.toString(let));
        reverse(let);
        System.out.println("The Reversed Array is: " + Arrays.toString(let));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int indexf, int indexs) {
        int temp = arr[indexf];
        arr[indexf] = arr[indexs];
        arr[indexs] = temp;
    }
}

