package com.konest.amimetape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konest.amimetape.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

    Song findBySongname(String songname);

}
