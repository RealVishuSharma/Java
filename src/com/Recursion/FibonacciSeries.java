package com.Recursion;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number till which you want to print the Fib series: ");
        int n = input.nextInt();


       int output =  Fibonacci(n);
        System.out.println("The Fibonacci number at 6 is : " + output);
    }

    static int Fibonacci(int num) {

        if (num < 2) {
            return num;
        }

        return   Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}
