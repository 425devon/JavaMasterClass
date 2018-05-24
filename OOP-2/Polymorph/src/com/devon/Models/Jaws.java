package com.devon.Models;

public class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A Shark eats people";
    }
}
