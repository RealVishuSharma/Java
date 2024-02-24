package com.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int len = input.nextInt();

        int[] sha = new int[len];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < len; i++) {
            sha[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sha));

        System.out.println("Enter the indexes to be swapped: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int[] swapped = swap(sha, first, second);
        System.out.println(Arrays.toString(swapped));
    }

    static int[] swap(int[] arr, int  indexf, int indexs) {
        int temp = arr[indexf];
        arr[indexf] = arr[indexs];
        arr[indexs] = temp;
        return arr;
    }
}
