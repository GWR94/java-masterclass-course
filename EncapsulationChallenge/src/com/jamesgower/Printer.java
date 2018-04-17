package com.jamesgower;

/**
 * Created by james on 23/05/2017.
 */
public class Printer {
    private int tonerLevel = 100;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public void fillToner(int cartridgeSize) {
        int newToner = tonerLevel + cartridgeSize;

            if (newToner <= 100 && newToner > 0) {
                this.tonerLevel = newToner;
                System.out.println("Successfully filled the cartridge. It is now " + newToner + "% filled.");
            }
            else {
                System.out.println("Error, you cannot overfill your cartridge! Reinserting old cartridge.");
            }
        }

    public void checkToner() {
        if(tonerLevel > 0) {
            System.out.println("The % of toner in the cartridge is " + tonerLevel);
        }
        else {
            System.out.println("Please refill the cartridge. It is completely empty");
        }
    }

    public void printPages(int pages) {
        if (tonerLevel - pages <= 0) {
            System.out.println("Error! Cannot complete task as there is not enough toner in the printer!");
        }
        else {
            this.tonerLevel -= pages;
            pagesPrinted += pages;
            if (duplex) {
                if (pages % 2 == 0) {
                    System.out.println("Pages printed on a duplex printer is " + pages / 2 + ". The new toner level is " + tonerLevel + ". The total amount of pages printed is " + pagesPrinted);
                } else {
                    System.out.println("Pages printed on a duplex printer is " + (pages / 2 + 1) + ". The new toner level is " + tonerLevel + ". The total amount of pages printed is " + pagesPrinted);
                }
            } else {
                System.out.println("Pages printed on a non duplex printer is " + pages);
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        System.out.println("Page count is " + pagesPrinted + " pages");
        return pagesPrinted;
    }
}

