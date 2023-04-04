package com.dennisobel.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;

        A obj = new A("ogembodennis");
        System.out.println(obj);
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}