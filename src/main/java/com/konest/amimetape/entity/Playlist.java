package com.konest.amimetape.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String playlistname;

    @ManyToMany
    private List<Song> songs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaylistname() {
        return playlistname;
    }

    public void setPlaylistname(String playlistname) {
        this.playlistname = playlistname;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Playlist() {
    }

    public Playlist(int id, String playlistname, List<Song> songs) {
        this.id = id;
        this.playlistname = playlistname;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Playlist [id=" + id + ", playlistname=" + playlistname + ", songs=" + songs + "]";
    }
   
    
}
