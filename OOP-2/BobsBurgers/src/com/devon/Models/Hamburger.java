package com.devon.Models;

public class Hamburger {
    private String bun;
    private String meat;
    private double price = 4.95;
    private boolean cheese = false;
    private boolean pickles = false;
    private boolean tomatoes = false;
    private boolean lettuce = false;

    public Hamburger(String bun, String meat) {
        this.bun = bun;
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
        if(cheese == true){this.price += .5;}
    }

    public boolean isPickles() {
        return pickles;
    }

    public void setPickles(boolean pickles) {
        this.pickles = pickles;
        if(pickles == true){this.price += .25;}
    }

    public boolean isTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
        if(tomatoes == true){this.price += .25;}
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        if(lettuce == true){this.price += .25;}
    }

}
