package com.utn.music;

public class Song {
    private String title;
    private Integer length;
    private MusicGenre genre;
    private Album album;
    private Artist coArtist;

    public Song() {
    }

    public Song(String title, Integer length, MusicGenre genre, Album album, Artist coArtist) {
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.album = album;
        this.coArtist = coArtist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setCoArtist(Artist coArtist) {
        this.coArtist = coArtist;
    }

    public String toString() {
        if (album == null) {
            return "{ " +
                    '\'' + title + "' " + genre +
                    "\t" + length +":00"+
                    '}';
        } else {
            return  '\'' + title + "' - " +
                    album.getArtistName() + " - " +
                    album.getTitle()+
                    ((coArtist != null) ? (", Co: " + coArtist.getName()) : "") +
                    "\t\t" + length +":00";
        }
    }
}
