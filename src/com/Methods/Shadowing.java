package com.Methods;

// Shadowing is a practice, when the scope overlaps, and the same variable is initialized again. Shadowing is only
// available for class scope.
public class Shadowing {
    static int a = 45;      // this will be shadowed at line 7.
    public static void main(String[] args) {
        System.out.println(a);  // 45
        int a = 5;      // the class variable at line 4 is shadowed by this.
        // The scope of shadowed variable will begin from the line it is declared. here, from line 7.

        System.out.println(a);  // 5
        avg();
    }

    static void avg() {
        System.out.println(a);  //45
    }
}
