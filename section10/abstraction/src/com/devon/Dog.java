package com.devon;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating.");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking.");
    }
}
