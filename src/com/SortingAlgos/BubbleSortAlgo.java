package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int length = input.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter  the elements of the Array at index " + i);
            arr[i] = input.nextInt();
        }

        System.out.println("The Current Array is: ");
        System.out.println(Arrays.toString(arr));

        Sorting(arr);
        System.out.println("The sorted Array is: ");
        System.out.println(Arrays.toString(arr));

    }

    static  void Sorting(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j- 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
