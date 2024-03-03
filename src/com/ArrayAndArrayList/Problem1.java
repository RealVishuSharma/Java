package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rows of the matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the columns of the matrix: ");
        int cols = input.nextInt();

        int [][] matrix = new int[rows][cols];
        int counter = cols;
        System.out.println("Enter the elements of the Matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            counter--;
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = input.nextInt();
                    while (matrix[row][col] %2 != 0) {
                        System.out.println("Not Saved, Please Enter Even no. at this index: ");
                        matrix[row][col] = input.nextInt();
                    }
                } else if (col == counter) {
                    matrix[row][col] = input.nextInt();
                    while (matrix[row][col] %2 != 0) {
                        System.out.println("Not saved, Please Enter a Even no. at this index (Column wala): ");
                        matrix[row][col] = input.nextInt();
                    }
                } else{
                    matrix[row][col] = input.nextInt();
                }
            }
        }

        System.out.println("The Current Array is: ");
        for (int[] elements : matrix) {
            System.out.println(Arrays.toString(elements));
        }
    }
}
