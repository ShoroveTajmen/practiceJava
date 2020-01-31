package com.practice.inheritance;

public class Test {
    public static void main(String[] temp) {
        // 1
        Car car = new Car();
        car.brand = "Toyota";
        car.numberPlate = "Dhaka Ka 1234";
        car.seatNumber = 4;
        System.out.println("Test: " + car);

        //2
        Truck truck = new Truck();
        truck.brand = "Tata";
        truck.numberPlate = "Dhaka Kha 5678";
        truck.load = 2000.0;
        System.out.println("Test: " + truck);
    }
}






