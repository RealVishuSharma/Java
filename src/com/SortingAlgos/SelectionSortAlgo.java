package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;



public class SelectionSortAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] seq = new int[length];

        for (int i = 0; i < seq.length; i++) {
            System.out.println("Enter the value of element at index: " + i);
            seq[i] = input.nextInt();
        }

        System.out.println("The Current Array is: ");
        System.out.println(Arrays.toString(seq));

        Sorting(seq);
        System.out.println("The new Sorted Array is: ");
        System.out.println(Arrays.toString(seq ));

    }

    static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxim(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

     static int getMaxim(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i <= end ; i++) {
             if (arr[max] < arr[i]) {
                 max = i;
             }
         }
         return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
