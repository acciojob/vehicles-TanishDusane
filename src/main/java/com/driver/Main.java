package com.driver;
public class Main {
    public static void main(String[] args) {
        // Create an instance of F1 car named mercedes
        F1 mercedes = new F1("mercedes", false);

        // Move the mercedes F1 car with speed 40 and direction 0 degrees
        mercedes.move(40, 0);

        // Accelerate the mercedes F1 car by 20 units
        mercedes.accelerate(20);

        // Decelerate the mercedes F1 car by 60 units
        mercedes.accelerate(-60);
    }
}
