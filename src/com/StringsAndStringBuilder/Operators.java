package com.StringsAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        // When using System.out.println data-types other than Strings are first converted to Strings representations
        // And then the output is printed.

        // Characters
        System.out.println('a' + 'b');      // This will convert the Characters to ASCII value and add them.
        System.out.println('a' + 3);        // This will convert the character to its ASCII value and
        // add 3 to it.

        // Strings
        System.out.println("a" + "b");      // This will concatenate the Strings.
        System.out.println("a" + 1);          // This will first convert the integer to its Wrapper Class and then
        // call the .toString() method, and convert it to string, and concatenate them.

        System.out.println("Vishu" + new ArrayList<>());        // ArrayList is an object.

        // If an objects is Added with a Strings, the objects will first be converted to its string representation
        // And then will be concatenated.

        // The "+" operator in java can only be applied on primitives and if one of the operand is a String.
        // Otherwise, it will give error.

    }
}

