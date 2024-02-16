package com.Methods;

/* Scoping can be referred to as the visibility and lifetime of variables within a program.
 It determines where in the code a variable can be accessed and how long it remains in memory. */
public class Scoping {
    public static void main(String[] args) {
        int a = 5;
        String b = "Vishu";

        // Scoping in block

        {           //  This is called a block scope, whatever initialized inside this scope can only be accessed in
            // this scope only, and if a variable is initialized outside the scope, it can be changed inside the
            // scope too.
            a = 8;
            int c = 4;
            System.out.println(a);
            System.out.println(c);
        }
//        System.out.println(c);
    }


    // Scoping in function.
    static void created() {
        // This is a function, and whatever initialized inside the function can only be accessed from inside the
        // function. If a variable is initialized inside the function, it cannot be accessed from another function,
        // or outside the function. This is called function scope.
        int c = 80;
        System.out.println(c);


        // Scoping in for loop
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
    }
}

// Anything that is initialized outside can be used or updated inside, but anything initialized inside can not be
// used outside.                    // This is applicable for all.

