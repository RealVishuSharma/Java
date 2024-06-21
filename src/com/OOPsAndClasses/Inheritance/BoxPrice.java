package com.OOPsAndClasses.Inheritance;


// This is an example of multi-level inheritance, the BoxPrice class is extending BoxWeight class and BoxWeight class
// itself is extending Box class.

public class BoxPrice  extends BoxWeight{
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(int l, int w, int h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
