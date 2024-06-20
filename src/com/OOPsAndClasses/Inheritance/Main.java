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
        BoxWeight weight = new BoxWeight(5.6);
        System.out.println(first.length + " " + first.width + " " + first.height);
        System.out.println();
        System.out.println(weight.width + " " + weight.weight);
    }


}