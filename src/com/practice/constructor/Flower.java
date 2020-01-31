package com.practice.constructor;

public class Flower {
    String name;
    String color;
    int price;

    public Flower(){
        this.name = "rose";
        this.color = "red";
        this.price = 20;
    }
    public Flower(String n,String c,int p){
        this.name = n;
        this.color = c;
        this.price = p;
    }
    void display(){
        System.out.println("Name: " +this.name);
        System.out.println("Color: " +this.color);
        System.out.println("Price: " +this.price);
    }
    public static void main(String[] args){
        Flower f1 = new Flower();
        f1.display();
        Flower f2 = new Flower("jesmin","blue",40);
        f2.display();
    }
}
