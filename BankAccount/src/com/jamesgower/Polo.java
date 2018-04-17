package com.jamesgower;

/**
 * Created by james on 19/05/2017.
 */
public class Polo extends Car {
    private int roadServiceMonths;

    public Polo(int roadServiceMonths) {
        super("Polo", "FWD", "White", 3, 5, true, 5);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            gearChange(0);
        }
        else if (newVelocity > 0 && newVelocity <= 15) {
            gearChange(1);
        }
        else if (newVelocity > 15 && newVelocity <= 25) {
            gearChange(2);
        }
        else if (newVelocity > 25 && newVelocity <= 35) {
            gearChange(3);
        }
        else if (newVelocity > 35 && newVelocity <= 45) {
            gearChange(4);
        }
        else {
            gearChange(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
