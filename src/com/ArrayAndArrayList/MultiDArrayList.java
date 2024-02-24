package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows in the Arraylist: ");
        int rows = input.nextInt();

        System.out.println("Enter the no. of Columns in the Arraylist: ");
        int columns = input.nextInt();
        ArrayList<ArrayList<Integer>> wis = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            wis.add(new ArrayList<>());
        }

        System.out.println("Enter the elements of the arraylist: ");
        // Add Elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                wis.get(i).add(input.nextInt());
            }
        }

        System.out.println(wis);
    }
}
