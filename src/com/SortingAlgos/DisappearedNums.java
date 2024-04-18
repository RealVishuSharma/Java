package com.SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DisappearedNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the Array : ");
        int length = input.nextInt();
        
        int[] disno = new int[length];

        for (int i = 0; i < disno.length; i++) {
            System.out.println("Enter the element at index: " + i);
            disno[i] = input.nextInt();
        }

        System.out.println("The Current Array is: " + Arrays.toString(disno));
        
        ArrayList<Integer> output = Dissapear(disno);
        System.out.println("The Disappeared numbers in the Array is: " + output);
    }
    
    static ArrayList<Integer> Dissapear(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                res.add(j  + 1);
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
