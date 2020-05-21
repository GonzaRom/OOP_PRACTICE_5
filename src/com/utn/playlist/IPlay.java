package com.utn.playlist;

import com.utn.music.Song;

public interface IPlay {

    String play();

    boolean addSong(Song song);

    String deleteSong();

    String printMyList();

    String changeSong();


}
