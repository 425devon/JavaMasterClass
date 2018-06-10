package com.devon;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn = false;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

        for(int i = 0; i < this.maxGears; i++){
            this.addGear(i,i*1.3);
        }
    }

    public boolean operateClutch(boolean in){
        if(in){
            this.clutchIsIn = true;
            return true;
        }else{
            this.clutchIsIn = false;
            return false;
        }
    }

    public void addGear(int number, double ratio){
        if((number > 0)&&(number <= this.maxGears)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >= 0) && (newGear <= this.maxGears) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.printf("Changed to %d gear\n", newGear);
            this.clutchIsIn = false;
        }else{
            System.out.println("Clutch must be in to change gears!");
        }
    }

    public double wheelSpeed(int revs){
        if(this.clutchIsIn){
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    //Inner Class
    //Has access to all methods/attributes of outer class
    private class Gear {
        private int gearNumber;
        private double ratio;


        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpreed(int revs){
            return revs *(this.ratio);
        }
    }


}
