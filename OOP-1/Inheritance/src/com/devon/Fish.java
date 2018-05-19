package com.devon;

public class Fish extends Animal {
    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int eyes, int gills, int fins) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    @Override
    public void move(int speed) {
        System.out.println("overriding animal class");
        swim(speed);
    }

    public void swim(int speed){
        System.out.println("just keep moving...");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
}
