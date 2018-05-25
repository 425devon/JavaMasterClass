package com.devon.Models;

public class HealthyBurger extends Hamburger {
    private boolean hummus = false;
    private boolean avacado = false;

    public HealthyBurger(String meat) {
        super("Rye", meat);
        this.hummus = hummus;
        this.avacado = avacado;
    }

    public void setHummus(boolean hummus) {
        this.hummus = hummus;
        if(hummus == true){
            double price = this.getPrice();
            price += .75;
            this.setPrice(price);
        }
    }

    public void setAvacado(boolean avacado) {
        this.avacado = avacado;
        if(avacado == true){
            double price = this.getPrice();
            price += .75;
            this.setPrice(price);
        }
    }
}
