package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at index: " + i);
            array[i] = input.nextInt();
        }

        System.out.println("The Current Array is: ");
        System.out.println(Arrays.toString(array));

        Sorting(array);
        System.out.println("The Sorted Array is: " + Arrays.toString(array));
    }

    static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }
    }
}
