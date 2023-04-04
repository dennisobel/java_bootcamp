package com.dennisobel.staticexample;

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Dennis");
        Test b = new Test("Obel");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
