package com.OOPsAndClasses.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
