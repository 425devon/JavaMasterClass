package com.devon;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(-5));
        System.out.println(area(5));
        System.out.println(area(5.0,4.0));
    }
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return (Math.PI * Math.pow(radius,2));
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return (x * y);
    }
}