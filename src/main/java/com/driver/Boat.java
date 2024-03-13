<<<<<<< HEAD
=======
// Boat.java
>>>>>>> bffc0b726c261f6fb97ee448cdc2f71c14fc754e
package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
<<<<<<< HEAD
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }
=======
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
>>>>>>> bffc0b726c261f6fb97ee448cdc2f71c14fc754e
}
