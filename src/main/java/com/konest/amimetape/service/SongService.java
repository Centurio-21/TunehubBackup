package com.konest.amimetape.service;

import java.util.List;

import com.konest.amimetape.entity.Song;

public interface SongService {

    void getuploadsongs(Song songs);

    List<Song> fetchalldata();

}
