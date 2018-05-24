package com.devon.Models;

public class Player {
// No encapsulation
//    public String name;
//    public int health;
//    public String weapon;
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        try {
            if (health > 0 && health <= 100) {
                this.health = health;
            } else {
                throw new Exception("invalid health");
            }
        }
        catch(Exception e){
                System.out.println("Invalid Health Value");
                this.health = -1;
            }
        this.weapon = weapon;
    }


    public void looseHealth(int dmg){
        this.health -= dmg;
        if(this.health <= 0){
            System.out.println("Game Over");
        }
    }

    public int getHealth(){
        System.out.printf("%d Health remaining \n",this.health);
        return this.health;
    }


}
