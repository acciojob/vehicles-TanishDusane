package com.driver;

// Vehicle class
public class Vehicle {

    // Private instance variables
    private String name;
    private int currentSpeed;
    private int currentDirection;

    // Constructor
    public Vehicle(String name) {
        // Initializing instance variables
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    // Method to change direction
    public void steer(int direction){
        // Adding direction to the current direction
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    // Method to move
    public void move(int speed, int direction){
        // Setting currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    // Method to stop
    public void stop(){
        // Setting currentSpeed to 0
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for current speed
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Getter method for current direction
    public int getCurrentDirection() {
        return currentDirection;
    }
}