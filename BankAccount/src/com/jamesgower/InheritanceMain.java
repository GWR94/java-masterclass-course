package com.jamesgower;

/**
 * Created by james on 16/05/2017.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 1, 5);
        Dog dog = new Dog("Yorkie", 8, 5, 2, 1, 1, "Fury");
        dog.eat();
        dog.walk(10);
        Fish fish = new Fish("fish", 1, 1, 1, 1, 1, 2, 2);
        fish.swim(5);
    }

}
