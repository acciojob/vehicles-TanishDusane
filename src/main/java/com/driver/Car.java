package com.driver;

// Car class extending Vehicle class
public class Car extends Vehicle {
    // Private instance variables
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    // Constructor
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        // Calling superclass constructor
        super(name);
        // Initializing instance variables
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.seats = seats;
        // Setting default current gear to 1
        this.currentGear = 1;
    }

    // Method to change gear
    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    // Method to change speed and direction
    public void changeSpeed(int newSpeed, int newDirection) {
        // Call to move method inherited from Vehicle class
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    // Getter method for current gear
    public int getCurrentGear() {
        return currentGear;
    }

    // Getter method for number of wheels
    public int getWheels() {
        return wheels;
    }

    // Getter method for type of car
    public String getType() {
        return type;
    }

    // Getter method for number of doors
    public int getDoors() {
        return doors;
    }

    // Getter method for number of gears
    public int getGears() {
        return gears;
    }

    // Method to check if car is manual
    public boolean isManual() {
        return isManual;
    }

    // Getter method for number of seats
    public int getSeats() {
        return seats;
    }
}