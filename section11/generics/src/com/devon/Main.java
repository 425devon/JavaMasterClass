package com.devon;

public class Main {

    public static void main(String[] args) {
	    Team<BasketBallPlayer> bteam = new Team<>("SportsBalls");
	    Team<FootBallPlayer> fteam = new Team<>("FootsBalls");

	    SoccerBallPlayer sb1 = new SoccerBallPlayer("Ted",14);
        SoccerBallPlayer sb2 = new SoccerBallPlayer("bill",11);

        BasketBallPlayer testB =new BasketBallPlayer("Sean",44);

        FootBallPlayer fb1 = new FootBallPlayer("ryan", 22);
        FootBallPlayer fb2 = new FootBallPlayer("jill", 9);

        //bteam.addPlayer(sb1);
        bteam.addPlayer(testB);
        fteam.addPlayer(fb1);
        fteam.addPlayer(fb1);
    }
}
