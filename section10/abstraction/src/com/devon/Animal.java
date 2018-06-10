package com.devon;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void walk();

    public String getName(){
        return this.name;
    }
}
