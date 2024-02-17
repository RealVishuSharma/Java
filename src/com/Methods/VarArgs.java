package com.Methods;

import java.util.Arrays;

// VarArgs are referred to as variable length arguments, they are used when we don't know the no. of arguments.
// Like => int...varia = 45, 78, 85, 96, 75, 4;
// Internally VarArgs are stored as arrays.
public class VarArgs {
    public static void main(String[] args) {

        fun(5, 8, 75, 78, 45, 85, 4, 8, 6, 9, 1);
    }

    static void fun(int... num) {
        System.out.println(Arrays.toString(num));
    }
}
