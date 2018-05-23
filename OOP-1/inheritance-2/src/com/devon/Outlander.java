package com.devon;

public class Outlander extends Car {
    private int roadService;

    public Outlander(int roadService) {
        super("Outlander", "4WD", 4, 5,6, false);
        this.roadService = roadService;
    }

    public int getRoadService() {
        return roadService;
    }

    public void setRoadService(int roadService) {
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0){stop();
        } else if(newVelocity>0 && newVelocity <=10){
            setCurrentGear(1);
        }else if(newVelocity >10 && newVelocity <=20 ){
            setCurrentGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        }else if(newVelocity > 30 && newVelocity <= 40){
            setCurrentGear(4);
        }else if(newVelocity > 40 && newVelocity <= 50){
            setCurrentGear(5);
        }else{
            setCurrentGear(6);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
