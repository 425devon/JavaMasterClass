package com.devon.Models;

public class IntArray {
    private int[] intArray;

    public IntArray() {
    }

    public void initArray(int size){
        this.intArray = new int[size];
    }

    public void getArrayLength(){
        try{
            int length = this.intArray.length;
            System.out.println(length);
        }catch (NullPointerException e){
            System.out.println("Array has no length \nplease use initArray()");
        }

    }

    public int[] getIntArray(){
        return this.intArray;
    }

    public void insert(int index, int value){
        try{
            intArray[index] = value;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public void createRange(int start, int stop){
        int length = (stop - start);
        this.initArray(length+1);
        int count = start;
        for(int i = 0; i < this.intArray.length; i++){
            this.intArray[i] = count;
            count++;
        }
    }

    public void printArray(){
        for(int val: this.intArray){
            System.out.println(val);
        }
    }

}
