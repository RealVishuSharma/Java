package com.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows in the matrix: ");
        int rows = input.nextInt();
        System.out.println("Enter the no. of columns in the matrix: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println();

        System.out.println("Enter the value of the Matrix: ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter the value of " + row + " row: ");
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }

        // OR this method can also be used to print the matrix.

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("The Array is stored!");
    }
}
