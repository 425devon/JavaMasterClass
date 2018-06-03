package com.devon;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	    Album a1 = new Album("13 chambers", "Wu Tang");
	    Album a2 = new Album("Keep Hope Alive", "The Crystal Method");

	    a1.addSong("t1", 3.05);
        a1.addSong("t2", 4.55);
        a1.addSong("t3", 5.15);
        a1.addSong("t4", 6.25);
        //
        a1.addSong("t2", 4.55);
        albums.add(a1);


        a2.addSong("d1", 3.05);
        a2.addSong("d2", 4.55);
        a2.addSong("d3", 5.15);
        a2.addSong("d4", 6.25);
        //
        a2.addSong("d2", 4.55);
        albums.add(a2);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("t3", playList);
        albums.get(0).addToPlayList("t5", playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(0).addToPlayList("t4", playList);
        albums.get(1).addToPlayList(2, playList);

        play(playList);



    }
    private static void play(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        printMenu();

        ListIterator<Song> iterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("Playlist is empty!");
            return;
        }else{
            System.out.printf("\nNow Playing %s\n", iterator.next().getTitle());
        }

        while(!quit){
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if(iterator.hasNext()){
                        System.out.printf("\nNow Playing %s\n", iterator.next().getTitle());
                    }else{
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        forward = false;
                        if(iterator.hasPrevious()){
                            System.out.printf("\nNow playing %s\n", iterator.previous().getTitle());
                        }else{
                            System.out.println("At the beginning of the playlist");
                            forward = true;
                        }
                    }
                    break;
                case 3:
                    if(forward){
                        if(iterator.hasPrevious()){
                            System.out.printf("\nNow RePlaying %s\n",iterator.previous().getTitle());
                            forward = false;
                        }
                        else{
                            System.out.printf("\nNow RePlaying %s",iterator.next().getTitle());
                            forward = true;
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        iterator.remove();
                    }
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions \n press:");
        System.out.println("0 - to quit");
        System.out.println("1 - to skip to next track");
        System.out.println("2 - to play last track");
        System.out.println("3 - replay current song");
        System.out.println("4 - list songs in play list");
        System.out.println("5 - Display menu");
        System.out.println("6 - Delete current song");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        while (iterator.hasNext()){
            System.out.println("Track name: " + iterator.next().getTitle());
        }
    }


}
