package com.utn.playlist;

import com.utn.music.Song;

import java.util.InputMismatchException;
import java.util.Iterator;

import java.util.LinkedList;
import java.util.Scanner;

public class PremiumPlaylist implements IPlay {
    private String name;
    private LinkedList<Song> myList;

    // Constructor//
    public PremiumPlaylist() {
        myList = new LinkedList<>();
    }

    public PremiumPlaylist(String name) {
        this.setName(name);
        this.myList = new LinkedList<>();
    }
    //////

    // Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ///

    public String play() {
        if (myList == null) return "E R R O R empty playlist";
        else {
            Scanner scan = new Scanner(System.in);
            int songNumber = 0;
            do {
                try {
                    System.out.println(printMyList());
                    System.out.println("Select a Song:");
                    songNumber = scan.nextInt();

                } catch (InputMismatchException ime) {
                    System.out.println("E R R O R! not a correct option. ");
                    scan.next();
                }
            } while (songNumber < 0 || songNumber > myList.size());
            return "Winamp Now Playing-->" + myList.get(songNumber - 1);
        }
    }

    public boolean addSong(Song song) {
        return myList.add(song);
    }

    public String deleteSong() {
        if (myList == null) return "E R R O R empty playlist";
        else {
            Scanner scan = new Scanner(System.in);
            int songNumber = 0;
            do {
                try {
                    System.out.println(printMyList());
                    System.out.println("Select a Song to Delete:");
                    songNumber = scan.nextInt();

                } catch (InputMismatchException ime) {
                    System.out.println("E R R O R! Input must be a number.");
                    scan.next();

                }/* catch (IndexOutOfBoundsException iobe) {
                    System.out.println("E R R O R! Input out of range.");
                    scan.next();

                }*/
            } while (songNumber < 0 || songNumber > myList.size());
            return myList.remove(songNumber - 1) + " <---Deleted";
        }
    }

    public String printMyList() {
        if (myList != null) {
            StringBuilder printMyList = new StringBuilder();
            Iterator<Song> i = myList.iterator();
            int count = 1;
            while (i.hasNext()) {
                printMyList.append(count);
                printMyList.append(". ");
                printMyList.append(i.next().toString());
                printMyList.append("\n");
                count++;
            }
            return printMyList.toString();
        } else
            return "E R R O R Empty playlist";
    }

    public String changeSong() {
        return play();
    }
}
