package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index: " + i);
            arr[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(arr));

        int output = Sorting(arr);
        System.out.println("The Duplicate no. is: " + output);
    }

    static int Sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }

        return -1;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
