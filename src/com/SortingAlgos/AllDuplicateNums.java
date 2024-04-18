package com.SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllDuplicateNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array : ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at index: " + i);
            array[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(array));

        ArrayList<Integer> output = Sorting(array);
        System.out.println("The Duplicate numbers are: " + output);
    }

    static ArrayList<Integer> Sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> duplicate = new ArrayList<Integer>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                duplicate.add(arr[j]);
            }
        }
        return duplicate;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
