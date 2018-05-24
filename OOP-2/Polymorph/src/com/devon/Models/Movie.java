package com.devon.Models;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String plot(){
        return "no plot here";
    }
}
