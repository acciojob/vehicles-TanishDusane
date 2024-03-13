package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.seats = seats;

        currentGear = 1;
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

        currentGear = 1;
    }
    int currentSpeed, currentDirection;


    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.currentSpeed = newSpeed;
        this.currentDirection = newDirection;
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

<<<<<<< HEAD
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

=======
    int currentSpeed;
    int currentDirection;

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }
>>>>>>> bffc0b726c261f6fb97ee448cdc2f71c14fc754e
    public void setCurrentDirection(int direction) {
        this.currentDirection = direction;
    }

<<<<<<< HEAD
=======
    public int getCurrentGear() {
        return currentGear;
    }

>>>>>>> bffc0b726c261f6fb97ee448cdc2f71c14fc754e
    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

<<<<<<< HEAD
    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }
=======
    public int getSeats() {
        return seats;
    }

>>>>>>> bffc0b726c261f6fb97ee448cdc2f71c14fc754e
}
