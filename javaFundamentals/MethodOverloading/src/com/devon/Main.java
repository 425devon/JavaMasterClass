package com.devon;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("devon", 500);
        System.out.println("new score is " + newScore);
        calculateScore(45);
        calculateScore();

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Player Scored no points");
        return 0;
    }


}
