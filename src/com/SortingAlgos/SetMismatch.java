package com.SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] set = new int[length];

        for (int i = 0; i < set.length; i++) {
            System.out.println("Enter the element at index: " + i);
            set[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(set));

        ArrayList<Integer> output = Sorting(set);
        System.out.println("The Set Mismatched is: " + output);
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

        ArrayList<Integer> res = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                res.add(arr[j]);
                res.add(arr[j] + 1);
            }
        }

        return res;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
