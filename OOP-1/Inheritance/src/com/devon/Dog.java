package com.devon;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        //super.move(speed);
    }

    @Override
    public void eat() {
        System.out.println("Overide eat call");
        this.chew();
        //super.eat();
    }
    public void moveLegs(int speed){
        System.out.println("Move legs called overrides animal class");
    }

    public void chew(){
        System.out.println("Chewing on something I shouldn't be");
    }

    public void walk(){
        System.out.println("Dog Walk called");
        move(4);

    }

    public void run(){
        System.out.println("Dog Run called");
        move(10);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
}
