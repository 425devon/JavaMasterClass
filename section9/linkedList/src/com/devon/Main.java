package com.devon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
       addInAlpha(cities, "Chicago");
        addInAlpha(cities, "Albany");
        addInAlpha(cities, "Dallas");
        addInAlpha(cities, "Cairo");
        addInAlpha(cities, "LA");

        printList(cities);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now traveling to to " + i.next());
        }
        System.out.println("--------------");
    }

    private static boolean addInAlpha(LinkedList<String> linkedList, String newCity){
        ListIterator<String> i = linkedList.listIterator();

        while(i.hasNext()){
            int comparison = i.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add.
                return false;
            }else if(comparison > 0){
                //new city should appear before this one...
                i.previous();
                i.add(newCity);
                return true;
            }else if(comparison < 0){
                //move onto next city
            }
        }
        i.add(newCity);
        return true;
    }
}
