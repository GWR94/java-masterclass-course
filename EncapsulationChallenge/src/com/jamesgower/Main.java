package com.jamesgower;

/**
 * Created by james on 23/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(600, true);
        duplexPrinter.checkToner();
        duplexPrinter.printPages(11);
        duplexPrinter.checkToner();
        duplexPrinter.printPages(30);
        duplexPrinter.printPages(58);
        duplexPrinter.printPages(1);
        duplexPrinter.printPages(1);
        duplexPrinter.checkToner();
        Printer nonDuplexPrinter = new Printer(100, false);
        nonDuplexPrinter.checkToner();
        nonDuplexPrinter.printPages(30);
        nonDuplexPrinter.checkToner();
        Printer noToner = new Printer(0, true);
        noToner.printPages(20);
        noToner.fillToner(101);
        noToner.checkToner();
        noToner.fillToner(100);
        noToner.printPages(10);
        noToner.checkToner();
        noToner.printPages(101);
        noToner.printPages(10);
    }
}
