package com.dennisobel.interfaces.extendDemo;

public interface A {
    static void greeting(){
        System.out.println("static method cannot be overridden, so has to have a body");
    }
    default void fun(){
        System.out.println("hi, i'm in A");
    }
}
