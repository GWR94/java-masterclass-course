package com.jamesgower;

/**
 * Created by HP on 17/05/2017.
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfSeats;
    private boolean isManual;
    private int gears;

    private int currentGear;

    public Car(String name, String size, String colour, int numberOfDoors, int numberOfSeats, boolean isManual, int gears) {
        super(name, size, colour);
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 0;
    }

    public void gearChange(int gear) {
        switch (gear) {
            case 0:
                System.out.println("Neutral gear selected");
                currentGear = 0;
                break;
            case 1:
                System.out.println("Switched to gear 1");
                currentGear = 1;
                break;
            case 2:
                System.out.println("Switched to gear 2");
                currentGear = 2;
                break;
            case 3:
                System.out.println("Switched to gear 3");
                currentGear = 3;
                break;
            case 4:
                System.out.println("Switched to gear 4");
                currentGear = 4;
                break;
            case 5:
                System.out.println("Switched to gear 5");
                currentGear = 5;
                break;
            default:
                System.out.println("Error. Must be gears 0 to 5");
                break;
        }
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + ". Direction: " + direction);
    }

    @Override
    public void stop() {
        super.stop();
        this.currentGear = 0;
        System.out.println("Car stopped. Current gear is " + currentGear);
    }
}
