package com.devon.Models;

public class FightClub extends Movie {
    public FightClub(){
        super("Fight Club");
    }

    @Override
    public String plot(){
        return "A movie about a mentally ill man facing his demons";
    }
}
