package com.devon;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = (CalculateScore(gameOver, score, levelCompleted, bonus));
        System.out.println(highScore);
        DisplayScorePosition("Mike", CalculateHighScore(highScore));
    }

    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 10;
            return finalScore;
        }
        return -1;
    }

    public static void DisplayScorePosition(String name, int position){
        System.out.println(name + " got to " + position + " position!");
    }

    public static int CalculateHighScore(int score){
        if(score >= 1000){
            return 1;
        }else if(score >= 500){
            return 2;
        }else if(score >= 100){
            return 3;
        }
        return 4;
    }
}
