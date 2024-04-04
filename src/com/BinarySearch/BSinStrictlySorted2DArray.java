package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSinStrictlySorted2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows in the Matrix:  ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of Columns in the Matrix: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter the value of element at index : (" + i + "," + j + ")");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The Current matrix is: ");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("Enter the element you want to find: ");
        int target = input.nextInt();

        int[] output = Search(matrix, target);
        System.out.println("The element is present at index: " + Arrays.toString(output));
    }

    // Will Search in the cols provided
    static int[] Search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[rows - 1].length;

        if (rows == 1) {
            return BinSearch(arr, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;

            if (arr[mid][cmid] == target) {
                return new int[] {mid, cmid};
            }
            if (arr[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // Check weather the target is in the cols of the two rows
        if (arr[rstart][cmid] == target) {
            return new int[] {rstart, cmid};
        }
        if (arr[rstart + 1][cmid] == target) {
            return new int[] {rstart + 1, cmid};
        }

        // Search in 1st part
        if (target <= arr[rstart][cmid - 1]) {
            return BinSearch(arr, rstart, 0, cmid - 1, target);
        }

        // Search in 2nd part
        if (target >= arr[rstart][cmid + 1] && target <= arr[rstart][cols - 1]) {
            return BinSearch(arr, rstart, cmid + 1, cols - 1, target);
        }

        // Search in 3rd part
        if (target <= arr[rstart + 1][cmid -1]) {
            return BinSearch(arr, rstart+ 1, 0, cmid - 1, target);
        }else {                         // Search in 4th part
            return BinSearch(arr, rstart +1, cmid + 1, cols - 1, target);
        }

    }

    // Will Search in the rows provided.
    static int[] BinSearch(int[][] arey, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;

            if(arey[row][mid] == target) {
                return new int[] {row, mid};
            }
            if (arey[row][mid] < target) {
                cstart = mid + 1;
            }else {
                cend = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
}
