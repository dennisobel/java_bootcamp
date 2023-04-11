package com.dennisobel.abstractdemo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("wagwan");
    }

    void normal(){
        System.out.println("Normal method");
    }
    abstract void career(String name);
    abstract void partner(String name, int age);
}
