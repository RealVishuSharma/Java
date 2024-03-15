package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array: ");
        int length = input.nextInt();

        char[] letters = new char [length];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < letters.length; i++) {
          letters[i] = input.next().charAt(0);
        }

        System.out.println("Enter the element whose greatest you want to find: ");
        char target = input.next().charAt(0);

        System.out.println("The Current Array is: " + Arrays.toString(letters));

        char output = Search(letters, target);
        System.out.println("The Alphabet greater than the " + target + " is: " + output);
    }

    static char Search(char[] arr, char target) {
        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                if (arr[mid] == target) {
                    return arr[mid + 1];
                } else if (target == arr[arr.length - 1]) {
                    return arr[0];
                }
            }
        }


        char n = 0;
        return n;
    }
}
