package com.dennisobel.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career("Doctor");
        son.partner("Kimberly", 20);

        Daughter daughter = new Daughter(22);
        daughter.career("Software Dev");
        daughter.partner("Denzel", 33);

//        Parent mom = new Parent(35);
        Parent.hello();
        Parent daughter2 = new Daughter(34);
    }
}
