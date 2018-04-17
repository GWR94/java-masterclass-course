package com.jamesgower;

/**
 * Created by james on 23/05/2017.
 */
public class Main {
    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "James";
//        player1.health = 20;
//        player1.weapon = "Sword";
//
//        int damage = 10;
//        player1.loseHealth(damage);
//        System.out.println(player1.name + "'s remaining health is " + player1.healthRemaining());
        EnhancedPlayer player1 = new EnhancedPlayer("James", 400, "Sword");
        System.out.println(player1.getName() + "'s health is " + player1.getHealth());
    }

}
