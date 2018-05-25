package com.devon;

import com.devon.Models.Hamburger;
import com.devon.Models.HealthyBurger;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White", "beef");
        //System.out.println(hamburger.getPrice());
        hamburger.setCheese(true);
        hamburger.setPickles(true);
        hamburger.setLettuce(true);
        //System.out.println(hamburger.getPrice());
        HealthyBurger hbug = new HealthyBurger("Salmon");
        System.out.println("hbug price " + hbug.getPrice());
        hbug.setCheese(true);
        hbug.setAvacado(true);
        System.out.println("hbug price " + hbug.getPrice());
    }
}
