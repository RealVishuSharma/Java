package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values of matrix: ");
        System.out.println("Enter the no. of rows of the matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of Columns of the matrix: ");
        int cols = input.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
        }

        System.out.println("Enter the Values of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(input.nextInt());
            }
        }

        System.out.println(matrix);
    }

    static void odd(ArrayList<Integer> num) {
        
    }
}
