package com.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;
// Arrays is a data structure used to store a fixed size of collection of elements of the same data type. It
// provides a convenient way of storing multiple values under the single name.

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] roll = new int[5];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < roll.length;  i++) {
            roll[i] = input.nextInt();
        }

        System.out.println("The output Array is: ");
        // This is  the for-each loop,  it directly accesses the elements , not the indexes of the elements.
        for (int num: roll) {       // for every element in the array, print the element
            System.out.println(num);        // here num represents the elements of the array
        }
        change(roll);
        System.out.println(Arrays.toString(roll));
    }

    static  void  change(int[] num) {
        num[4] = 47;
    }
}


