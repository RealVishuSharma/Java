package com.OOPsAndClasses.Inheritance;

// This is an example of single inheritance, in this, the BoxWeight class is extending Box class means it can access
// all the methods and properties of Box class, which are public.

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(int l, int w, int h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
