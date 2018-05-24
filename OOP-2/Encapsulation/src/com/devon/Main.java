package com.devon;

import com.devon.Models.Player;

public class Main {

    public static void main(String[] args) {
//	    Player noEncapPlayer = new Player();
//	    public access to all variables....
//	    noEncapPlayer.name = "Mike";
//	    noEncapPlayer.health = 60;
//	    noEncapPlayer.weapon = "potato";
//	    noEncapPlayer.looseHealth(55);
//	    noEncapPlayer.getHealth();
//	    noEncapPlayer.looseHealth(10);

		Player privatePlayer2 = new Player("Joe", 195, "Bug Spray");
		privatePlayer2.getHealth();
    }
}
