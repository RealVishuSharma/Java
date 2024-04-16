package com.SortingAlgos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] missing = new int[length];

        for (int i = 0; i < missing.length; i++) {
            System.out.println("Enter the element at index " + i);
            missing[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(missing));

        int misno = found(missing);
        System.out.println("The missing number is: " + misno);
    }

    static int found(int[] arr) {
        int i = 0;
         while (i < arr.length) {
             int correct = arr[i];
             if (arr[i] < arr.length && arr[i]  != arr[correct]) {
                 swap(arr, i, correct);
             } else {
                 i++;
             }
         }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
