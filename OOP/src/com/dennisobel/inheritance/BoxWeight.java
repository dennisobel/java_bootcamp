package com.dennisobel.inheritance;

public class BoxWeight extends Box{
    double weight;

//    @Override
    static void greeting () {
        System.out.println("Hey, I'm in box");
    }

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
