package com.devon.Models;

public class HealthyBurger extends Hamburger {
    private boolean hummus;
    private boolean avacado;

    public HealthyBurger(String bun, String meat, boolean hummus, boolean avacado, boolean cheese, boolean pickles,
    boolean tomatoes, boolean lettuce) {
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
