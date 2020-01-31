package com.practice.copyConstructor;

public class Student {
    String name;
    int roll;

    public Student(String name , int roll){
        this.name = name;
        this.roll = roll;
    }

    // copy constructor
    public Student(Student student){
        this.name = student.name;
        this.roll = student.roll;
    }

    public void changeRoll(int roll){this.roll = roll;}
}
