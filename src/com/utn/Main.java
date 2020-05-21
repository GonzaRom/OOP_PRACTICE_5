package com.utn;

import com.utn.music.*;
import com.utn.playlist.BasicPlaylist;
import com.utn.playlist.PremiumPlaylist;

public class Main {

    public static void main(String[] args) {
        // Hello, World!//
        Artist art1 = new Artist("Metallica", 50, "EEUU");
        Album a1 = new Album(2015, "…And Justice for All", art1);
        Song s1 = new Song("Blackened",6,MusicGenre.ROCK,a1,null);
        Song s2 = new Song("…And Justice for All",9,MusicGenre.ROCK,a1,null);
        Song s3= new Song("Eye of the Beholder",6,MusicGenre.ROCK,a1,null);
        Song s4 = new Song("One",7,MusicGenre.ROCK,a1,null);
        Song s5 = new Song("The Shortest Straw",6,MusicGenre.ROCK,a1,null);
        Song s6 = new Song("Harvester of Sorrow",6,MusicGenre.ROCK,a1,null);
        Song s7 = new Song("The Frayed Ends of Sanity",6,MusicGenre.ROCK,a1,null);
        Song s8 = new Song("To Live Is to Die",6,MusicGenre.ROCK,a1,null);
        Song s9 = new Song("Dyers Eve",6,MusicGenre.ROCK,a1,null);

        /**TODO Menu**/
        
        PremiumPlaylist bplaylist1 = new PremiumPlaylist();
        System.out.println(bplaylist1.printMyList());
        bplaylist1.setName("Rock for Roll");
        bplaylist1.addSong(s1);
        bplaylist1.addSong(s2);
        bplaylist1.addSong(s3);
        bplaylist1.addSong(s4);
        bplaylist1.addSong(s5);
        bplaylist1.addSong(s6);

        System.out.println();
        System.out.println(bplaylist1.deleteSong());
        System.out.println(bplaylist1.printMyList());
    }
}
