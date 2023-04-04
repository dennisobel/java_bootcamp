package com.dennisobel.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.6, 7.9, 6.5);
//        Box box2 = new Box(box);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box4.l + " " + box4.weight + " " + box4.h);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.weight);

//        BoxPrice box = new BoxPrice(5,8,200);
//        System.out.println(box.weight);
        box.greeting();
    }
}