package com.OOPsAndClasses.Inheritance;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides : ");
//        int length = input.nextInt();
//        int width = input.nextInt();
//        int height = input.nextInt();

        Box first = new Box();
        System.out.println(first.length + " " + first.width + " " + first.height);

        BoxWeight second = new BoxWeight(5.6);
        System.out.println(second.width + " " + second.weight);

        BoxPrice third = new BoxPrice(5,8,6, 2.5, 8.6);
        System.out.println(third.height + " " + third .weight + " " + third.cost);

    }


}

// Types of Inheritance

// Single Inheritance
// Multi-level Inheritance
// Multiple Inheritance
// Hierarchical Inheritance
//Hybrid Inheritance
