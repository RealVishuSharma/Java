package com.LinearSearch;

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows in the matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of columns in the matrix: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        int output = wealth(matrix);
        System.out.println("The Maximum Wealth is : " + output);
    }

    static int wealth(int[][] arr) {
        int out = 0;

        for (int[] ints : arr) {
            int total = 0;
            for (int anInt : ints) {
                total += anInt;
            }
            System.out.println(total);
            if (total > out) {
                out = total;
            }
        }
        return out;
    }
}
