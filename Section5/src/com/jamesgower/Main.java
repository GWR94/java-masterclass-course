package com.jamesgower;

/**
 * Created by HP on 19/05/2017.
 */
public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 5, 20);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
