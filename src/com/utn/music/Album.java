package com.utn.music;

public class Album {
    private Integer year;
    private String title;
    private Artist artist;

    public Album () {}

    public Album(Integer year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getArtistName() {
        return artist.getName();
    }

    @Override
    public String toString() {
        return "Album{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
