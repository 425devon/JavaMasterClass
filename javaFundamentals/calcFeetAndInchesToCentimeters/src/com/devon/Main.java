package com.devon;

public class Main {

    public static void main(String[] args) {
        double test1 = calcFeetAndInchesToCentimeters(0,0);
        double test2 = calcFeetAndInchesToCentimeters(40,5);
        double test3 = calcFeetAndInchesToCentimeters(0);
        double test4 = calcFeetAndInchesToCentimeters(40);

        System.out.println("test 1: " + test1);
        System.out.println("test 2: " + test2);
        System.out.println("test 3: " + test3);
        System.out.println("test 4: " + test4);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <= 0 && inches <= 0){
            return -1;
        }
        double centimeters = ((feet * 30.48) + (inches * 2.54));
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <= 0){
            return -1;
        }
        double centimeters = (inches * 2.54);
        return centimeters;
    }
}
