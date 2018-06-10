package com.devon;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is pecking");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking");
    }

    public abstract void fly();
}
