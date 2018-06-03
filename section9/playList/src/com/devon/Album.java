package com.devon;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song song : this.songs) {
            if (song.getTitle() == title) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && (index < this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.printf("\nThis album does not have a track %d", trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song>playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.printf("\nSong with %s title is not on the album", title);
        return false;
    }

}
