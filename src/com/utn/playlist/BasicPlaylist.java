package com.utn.playlist;

import com.utn.music.Song;

import java.util.Iterator;
import java.util.Stack;

public class BasicPlaylist implements IPlay {
    private String name;
    private Stack<Song> myList;

    public BasicPlaylist() {
        this.myList = new Stack<>();
    }

    public BasicPlaylist(String name) {
        this.name = name;
        this.myList = new Stack<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void addTopAtEnd() {
        if (!myList.empty()) {
            /*
             * Take the top song in the stack and send it to the
             * end of it.
             */
            Song auxSong = myList.pop(); //take the top element in the stack in an auxiliary song

            Stack<Song> aux = new Stack<>();

            aux.addAll(myList);  //copy the contain of the original myList in an auxiliary stack
            myList.clear();     //clear the original stack

            myList.add(auxSong); //with the original stack empty, place the song who was on the
                                // top and place it at the end
            myList.addAll(aux); //now move the entire Aux Stack back to myList
        }

    }

    @Override
    public String play() {
        String nowPlaying = myList.peek().toString();
        addTopAtEnd();
        return "Winamp Now Playing-->" + nowPlaying;
    }

    public boolean addSong(Song song) {
        return myList.add(song);
    }

    @Override
    public String deleteSong() {
        return "To access these options, purchase the PREMIUM package.";
    }

    @Override
    public String printMyList() {
        if (myList.empty()) return "E R R O R Empty playlist";
        else {
            Iterator<Song> i = myList.iterator();
            int count = myList.size();

            StringBuilder printMyList = new StringBuilder();
            while (i.hasNext()) {

                printMyList.append(count);
                printMyList.append(". ");
                printMyList.append(i.next().toString());
                printMyList.append("\n");
                count--;

            }
            return printMyList.toString();
        }
    }

    @Override
    public String changeSong() {
        return "To access these options, purchase the PREMIUM package.";
    }
}
