package com.OOPsAndClasses.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();

        square.Area();
        square1.Area();
    }
}

// Types of Polymorphism

// Static Polymorphism (Compile-time)
// Dynamic Polymorphism (Run-time)

