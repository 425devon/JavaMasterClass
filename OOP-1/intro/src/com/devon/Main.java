package com.devon;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    porsche.setColor("red");
	    porsche.setDoors(2);
	    porsche.setEngine("2.8L");
	    porsche.setModel("911");
	    porsche.setNumberOfWheels(4);

        System.out.println(porsche.getColor());
		System.out.println(porsche.getDoors());
		System.out.println(porsche.getEngine());
		System.out.println(porsche.getModel());
		System.out.println(porsche.getNumberOfWheels());
    }
}
