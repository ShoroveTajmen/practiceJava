package com.practice;

public class Student {
    String name;
    String id;
    double cgpa;

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("CGPA: " + this.cgpa);
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.name = "xyz";
        S1.id = "191-15-2370";
        S1.cgpa = 3;
        S1.display();

        S2.name = "ejs";
        S2.id = "123-23-45";
        S2.cgpa = 3.50;
        S2.display();
    }
}
