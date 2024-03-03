package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows in  the Matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of Columns in the Matrix: ");
        int columns = input.nextInt();

        int [][] matrix = new int[rows][columns];

        System.out.println("Enter the value of the matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("Enter the Element you want to Search: ");
        int element = input.nextInt();

        for (int[] show: matrix) {
            System.out.println(Arrays.toString(show));
        }

    }

}
