package com.gametest;

import co.uk.jamesgower.ISaveObject;
import co.uk.jamesgower.Monster;
import co.uk.jamesgower.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by james on 26/06/2017.
 */
public class Main {

    public static void main(String[] args) {
        Player james = new Player("James", 10, 15);
        System.out.println(james.toString());
        saveObject(james);

        james.setHitPoints(8);
        System.out.println(james);
        james.setWeapon("Stormbringer");
        saveObject(james);
        // loadObject(james);
        System.out.println(james);

        ISaveObject werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength: " + ((Monster)werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n1. To enter a string\n0. To quit");

        while(!quit) {
            System.out.println("Choose an Option:");
            int choice = scanner.nextInt();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveObject objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveObject objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
