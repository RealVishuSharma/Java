package com.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        int[] sha = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < sha.length; i++) {
            sha[i] = input.nextInt();
        }

        System.out.println("Enter the first index to start searching from: ");
        int first = input.nextInt();

        System.out.println("Enter the last index to end  Searching: ");
        int last = input.nextInt();

        System.out.println("Enter the element you want to search: ");
        int element = input.nextInt();

       int found =  SearchRange(sha, first, last, element);
        System.out.println("Element found at index " + found);
    }

    static int SearchRange(int[] arr, int first, int  last, int search) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = first; i <= last; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;

    }
}
