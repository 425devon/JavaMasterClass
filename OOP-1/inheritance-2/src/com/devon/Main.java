package com.devon;

public class Main {

    public static void main(String[] args) {
	    Vehicle testVehicle = new Vehicle("VW", "Compact", 0, 0);
	    Car testCar = new Car("Honda","Compact",4,2,5,true);
	    Outlander testOutlander = new Outlander(24);
        //System.out.println(testVehicle.getName());
        //testVehicle.move(50,-25);
        //testCar.changeVelocity(45,30);
        testOutlander.steer(30);
        testOutlander.accelerate(60);
        testOutlander.getCurrentGear();
        testOutlander.accelerate(-50);
        testOutlander.getCurrentGear();
    }
}
