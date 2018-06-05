package com.devon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Integer integer = new Integer(54);

        ArrayList<Integer> intList = new ArrayList<Integer>();

//        //Old Deprecated
//        for(int i = 0; i< 10; i++){
//            intList.add(Integer.valueOf(i));
//        }
//        for(int i : intList){
//            System.out.println(intList.get(i).intValue());
//        }

        for(int i = 0; i< 10; i++){
            intList.add(i);
        }
        for(int i : intList){
            System.out.println(intList.get(i));
        }

        ArrayList<Double> dblMint = new ArrayList<Double>();
        for(Double d=0.0; d<=10; d+=0.5){
            dblMint.add(d);
        }
        for(double d : dblMint){
            System.out.println(d);
        }
    }
}
