package com.konest.amimetape.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String songname;
    private String songimagelink;
    private String songlink;
    private String genre;
    private String artist;
    private String songdescription;

    @ManyToMany
    private List<Playlist> Playlist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSongimagelink() {
        return songimagelink;
    }

    public void setSongimagelink(String songimagelink) {
        this.songimagelink = songimagelink;
    }

    public String getSonglink() {
        return songlink;
    }

    public void setSonglink(String songlink) {
        this.songlink = songlink;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongdescription() {
        return songdescription;
    }

    public void setSongdescription(String songdescription) {
        this.songdescription = songdescription;
    }

    public List<Playlist> getPlaylist() {
        return Playlist;
    }

    public void setPlaylist(List<Playlist> playlist) {
        Playlist = playlist;
    }

    public Song() {
    }

    public Song(int id, String songname, String songimagelink, String songlink, String genre, String artist,
            String songdescription, List<com.konest.amimetape.entity.Playlist> playlist) {
        this.id = id;
        this.songname = songname;
        this.songimagelink = songimagelink;
        this.songlink = songlink;
        this.genre = genre;
        this.artist = artist;
        this.songdescription = songdescription;
        Playlist = playlist;
    }

    @Override
    public String toString() {
        return "Song [id=" + id + ", songname=" + songname + ", songimagelink=" + songimagelink + ", songlink="
                + songlink + ", genre=" + genre + ", artist=" + artist + ", songdescription=" + songdescription
                + ", Playlist=" + Playlist + "]";
    }

   
}
