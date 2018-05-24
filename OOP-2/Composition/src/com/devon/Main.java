package com.devon;

public class Main {

    public static void main(String[] args) {
        Dimension dimensions = new Dimension(10,30,14);
        MotherBoard motherBoard = new MotherBoard("12345","Asus",4,"roksus");
        Resolution nativeResolution = new Resolution(1920,1200);
        Monitor monitor = new Monitor("12dw3","Acer",24, nativeResolution);
	    Case theCase = new Case("22b","Dell","120v",dimensions);
	    PC myAwesomePC = new PC(theCase,monitor,motherBoard);

	   myAwesomePC.powerUp();
    }
}
