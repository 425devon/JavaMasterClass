package com.devon.Models;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        this.theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        this.monitor.drawPixelAt(1200,50,"red");
    }


}
