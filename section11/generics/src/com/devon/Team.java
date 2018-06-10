package com.devon;

import java.util.ArrayList;


public class Team<T extends Player> {
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (this.members.contains(player)) {
            System.out.println("Player already on team");
            return false;
        }
        members.add(player);
        System.out.println(player.getName() + " added to team.");
        return true;
    }
}
