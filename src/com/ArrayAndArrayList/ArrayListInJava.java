package com.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> var = new ArrayList<>(10);

        var.add(85);
        var.add(74);
        var.add(96);

        System.out.println(var);

        System.out.println(var.contains(74));
    }
}
