package com.SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSortAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] cycle = new int[length];

        for (int i = 0; i < cycle.length; i++) {
            System.out.println("Enter the element at index: " + i);
            cycle[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(cycle));

        Sorting(cycle);
        System.out.println("The Sorted Array is : " + Arrays.toString(cycle));
    }

    static void Sorting(int[] arr) {
        int i = 0;
        while ( i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
