package com.practice.constructor.Encapsulation;

public class Student {
    private int age;
    private  double cgpa;

    public void setAge(int a){
        int age = a;
    }
    public void setCgpa(double b){
        double cgpa = b;
    }
    public int getAge(){
        return this.age;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    
}
