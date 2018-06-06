package com.devon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player devon = new Player("Devon", 100, 12);
//        saveObject(devon);
//        devon.setWeapon("glock");
//        System.out.println(devon);
//        saveObject(devon);
        loadObject(devon);
        System.out.println(devon);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        String[] options = new String[]{"Enter Name: ", "Enter hitPoints: ", "Enter Strength: ", "Enter weapon: "};

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (index < options.length && !quit) {

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print(options[index]);
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    System.out.println(index);
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i =0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String>values=readValues();
        objectToLoad.read(values);
    }
}
