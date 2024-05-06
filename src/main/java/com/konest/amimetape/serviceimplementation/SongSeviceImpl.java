package com.konest.amimetape.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konest.amimetape.entity.Song;
import com.konest.amimetape.repository.SongRepository;
import com.konest.amimetape.service.SongService;

@Service
public class SongSeviceImpl implements SongService {

    @Autowired
    SongRepository songrepo;

    @Override
    public void getuploadsongs(Song songs) {
        
       Song exisistingSong = songrepo.findBySongname(songs.getSongname());
       if (exisistingSong == null) {
            songrepo.save(songs);
       }else{
        System.out.println("song already present");
       }
    }

    @Override
    public List<Song> fetchalldata() {
        List<Song>  fetcheddata = songrepo.findAll();
        return fetcheddata;
    }

}
