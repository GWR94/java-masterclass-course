package com.jamesgower;

/**
 * Created by HP on 17/05/2017.
 */
public class Vehicle {
    private String name;
    private String size;
    private String colour;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size, String colour) {
        this.name = name;
        this.size = size;
        this.colour = colour;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        if(currentDirection > 360) {
            System.out.println("Error, cannot turn more than 360 degrees!");
            currentDirection -= direction;
        }
        else {
            System.out.println("Vehicle steering(): in direction " + currentDirection);
        }
    }



    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle is travelling at " + currentVelocity + " mph in " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
