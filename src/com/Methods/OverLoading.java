package com.Methods;


// Function Overloading refers to the ability to define multiple methods in a class with the same name but with
// different parameter list. And the function will be selected on the basis of parameter.
public class OverLoading {
    public static void main(String[] args) {
        // Here, int is given, so function with int parameter will be selected.
        fun(58);
        // Here, String is given, so function with string parameter will be selected.
        fun("Vishu Sharma");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
