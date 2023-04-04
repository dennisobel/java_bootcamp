package com.dennisobel.introduction;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student dennis = new Student(13,"Dennis",9.8f);
        dennis.changeName("Shem");
        dennis.greeting();
        Student shem = new Student();
        Student Ogembo = shem;

        shem.name = "kijits";
        System.out.println(Ogembo.name);
    }
}

class  Student {
    int rno;
    String name;
    float marks;

    public void greeting(){
        System.out.println("Hi, my name is " + name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student(){
        // call constructor from another constructor
        this(14, "shem", 100.0f);
    }

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}