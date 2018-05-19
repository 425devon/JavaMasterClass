package com.devon;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1,1,1,40);
	    Dog doggo = new Dog("Rocko", 1,1,25,35,2,4,12,"Short");
	    Fish fredderick = new Fish("Fredderick",0,1,25,2,6,4,1);

	    doggo.eat();
	    doggo.walk();
	    doggo.run();
	    doggo.eat();
	    fredderick.move(25);
    }


}
