package com.devon;

import com.devon.Models.Hamburger;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White", "beef");
        System.out.println(hamburger.getPrice());
        hamburger.setCheese(true);
        hamburger.setPickles(true);
        hamburger.setLettuce(true);
        System.out.println(hamburger.getPrice());
    }
}
