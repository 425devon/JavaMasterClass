package com.devon;

public class Main {

    public static void main(String[] args) {
        System.out.printf(getDuration(652, 49));
        System.out.printf('\n' + getDuration(34567));
    }

    public static String getDuration(long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }else{
            long hours = 0;
            if(minutes >= 60){
                hours = (minutes / 60);
                minutes = (minutes % 60);
            }
            String result = String.format("%dh : %dm : %ds", hours, minutes, seconds);
            return result;
        }
    }

    public static String getDuration(long seconds){
        if(seconds <= 0){
            return "Invalid value";
        }else{
            long hours = 0;
            long minutes = 0;
            if(seconds >= 3600){
                hours = (seconds / 3600);
                seconds = (seconds % 3600);
            }
            if(seconds >= 60){
                minutes = (seconds / 60);
                seconds = (seconds % 60);
            }
            String result = String.format("%dh : %dm : %ds", hours, minutes, seconds);
            return result;
        }
    }
}
