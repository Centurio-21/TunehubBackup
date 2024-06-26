package com.konest.amimetape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konest.amimetape.entity.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

}
