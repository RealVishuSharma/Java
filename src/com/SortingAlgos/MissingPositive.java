package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class MissingPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] pos = new int[length];

        for (int i = 0; i < pos.length; i++) {
            System.out.println("Enter the element at index: " + i);
            pos[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(pos));

        int output = Sorting(pos);
        System.out.println("The Missing Positive number is: " + output);
    }

    static int Sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length - 1 && arr[i] != arr[correct] ) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr[arr.length - 1];
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
