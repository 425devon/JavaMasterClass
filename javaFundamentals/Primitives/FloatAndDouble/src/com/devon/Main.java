package com.devon;

public class Main {

    public static void main(String[] args) {
	// Floating point numbers
        //width of int = 32 (4 bytes)
        int myInt =  5/3;
        //width of float = 32 (4 bytes)
        float myFloat = 5f / 3;
        //width of double = 64 (8 bytes)
        //generally default to double over float
        //often faster on modern computers + more precise
        double myDouble = 5d / 3;
        System.out.println("my int = " + myInt);
        System.out.println("my float = " + myFloat);
        System.out.println("my double = " + myDouble);

        //convert pounds to kg
        int myPounds = 15;
        double kiloGram = 0.45359237;
        System.out.println("My pounds to kg = " + myPounds * kiloGram);

    }
}
