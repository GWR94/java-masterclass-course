package com.jamesgower;

import java.util.Scanner;

/**
 * Created by james on 27/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        System.out.println("Average is " + getAverage(myIntegers));
    }

    private static Scanner scanner = new Scanner(System.in);
    int[] myIntegers = getIntegers(5);

    public static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + " integer values. \n");
        int[] values = new int[numbers];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
