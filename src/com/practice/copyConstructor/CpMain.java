package com.practice.copyConstructor;

public class CpMain {
    public static void main(String[] a){
        Student student1 = new Student("Rajesh", 102021);
        // student1 = 12357612;
        Student student2 = student1;
        // student2 = 12357612;
        System.out.println("Test1 :"+student1.roll + "    "+student2.roll);

        Student student1Clone =  new Student(student1);
        // student1Clone = 76677712
        // clone create korar jonno
        System.out.println("Test2: "+student1Clone.roll);


        ///
        ///
        student1.changeRoll(2);
        ///


        ///
        //student1 -> primary
        // student1clone
        System.out.println("Test1 :"+student1.roll + "    "+student2.roll);
        System.out.println("Test2: "+student1Clone.roll);


    }
}
