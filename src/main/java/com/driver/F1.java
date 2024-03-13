package com.driver;

// F1 class extending Car class
public class F1 extends Car {

    // Constructor
    public F1(String name, boolean isManual) {
        // Using arbitrary values for parameters not mentioned
        super(name, 4, 2, 6, isManual, "F1", 2);
    }

    // Method to accelerate
    public void accelerate(int rate) {
        // Calculate new speed by adding rate to currentSpeed
        int newSpeed = this.getCurrentSpeed() + rate;

        // Handling different speed ranges to change gears
        if (newSpeed == 0) {
            stop();
            changeGear(1); // Stop the car, set gear as 1
        } else if (newSpeed > 0 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed > 50 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed > 100 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed > 150 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed > 200 && newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        // Update speed and direction if speed is greater than 0
        if (newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }
    }
}
