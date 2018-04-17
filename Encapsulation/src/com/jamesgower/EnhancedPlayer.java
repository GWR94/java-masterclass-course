package com.jamesgower;

/**
 * Created by james on 23/05/2017.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;
    private int lives = 10;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

        public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked down!");
            lives -= 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }


    public int getLives() {
        return lives;
    }
}
