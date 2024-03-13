package com.driver;

public abstract class Car extends Vehicle {
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
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.currentSpeed = newSpeed;
        this.currentDirection = newDirection;
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    int currentSpeed;
    int currentDirection;

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }
    public void setCurrentDirection(int direction) {
        this.currentDirection = direction;
    }

    public int getCurrentGear() {
        return currentGear;
    }

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

    public int getSeats() {
        return seats;
    }

    public abstract void accelerate(int rate);
}
