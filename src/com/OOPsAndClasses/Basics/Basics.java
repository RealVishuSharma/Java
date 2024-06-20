package com.OOPsAndClasses.Basics;

public class Basics {
    public static void main(String[] args) {

        Student Vishu = new Student();
        Vishu.greeting();

        Student Aum = new Student("Aum Bhardwaj", 22,  71.3f);
        Aum.greeting();
        

    }
}

 class Student{
    String name;
    int roll;
    float marks;


    Student(){
        name = "Vishu Sharma";
        roll = 21;
        marks = 73.5f;
    }

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void greeting() {
        System.out.println("Hello, I'm " + this.name);
    }

}
