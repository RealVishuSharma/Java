package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of Rows in the matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of Columns in the matrix: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter the value of matrix at (" + i + " ," + j + ")");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the target element you want to find: ");
        int target = input.nextInt();

        System.out.println("The Current matrix is: ");

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        int[] output = Search(matrix, target);
        System.out.println("The Element is found at index : " + Arrays.toString(output));

    }

    public static int[] Search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && end >= 0) {
            if (target == arr[start][end]) {
                return new int[]{start, end};
            }
            if (arr[start][end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {-1, -1};
    }
}
