package com.jamesgower;

/**
 * Created by james on 16/05/2017.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog Chew Chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog nom nom");
        chew();
        super.eat();
    }

    public void walk(int speed) {
        System.out.println("Dog walks at " + speed + "mph!");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog runs");
    }

    private void moveLegs(int speed) {
        System.out.println("Move legs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
