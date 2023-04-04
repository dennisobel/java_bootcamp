package com.dennisobel.staticexample;

// demo to show initialization of static variables
public class StaticInt {
    static int a = 4;
    static int b;

    static {
        System.out.println("inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
        StaticInt.b += 3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
