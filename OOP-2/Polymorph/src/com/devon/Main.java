package com.devon;

import com.devon.Models.FightClub;
import com.devon.Models.Jaws;
import com.devon.Models.Movie;
import com.devon.Models.TrainingDay;

public class Main {

    public static void main(String[] args) {
        Movie movie = randomMovie();
        System.out.println(movie.getTitle() + " is about \n" + movie.plot());
    }

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 3) + 1;
        switch (randomNum){
            case 1:
                return new Jaws();
            case 2:
                return new FightClub();
            case 3:
                return new TrainingDay();
            default:
                return null;
        }
    }
}
