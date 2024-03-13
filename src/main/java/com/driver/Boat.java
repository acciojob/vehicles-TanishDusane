package com.driver;

// Boat class implementing WaterVehicle interface
public class Boat implements WaterVehicle {
    // Private instance variables
    private String name;
    private int capacity;

    // Constructor
    public Boat(String name, int capacity) {
        // Initializing instance variables
        this.name = name;
        this.capacity = capacity;
    }

    // Overridden method from WaterVehicle interface to get vehicle capacity
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    // Overridden method from WaterVehicle interface to get vehicle name
    @Override
    public String getVehicleName() {
        return name;
    }

    // Getter method for capacity
    public int getCapacity() {
        return capacity;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}