package com.dennisobel.abstractdemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("Fitna be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " she is " + age);
    }
}
