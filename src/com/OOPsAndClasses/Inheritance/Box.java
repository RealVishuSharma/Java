package com.OOPsAndClasses.Inheritance;

import java.util.Scanner;

class Box {
    int length;
    int width;
    int height;

    Box  () {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    Box( Box old) {
        this.length  = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box!!!");
    }

}
