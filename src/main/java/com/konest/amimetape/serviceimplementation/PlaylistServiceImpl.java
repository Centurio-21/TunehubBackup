package com.konest.amimetape.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konest.amimetape.repository.PlaylistRepository;

@Service
public class PlaylistServiceImpl {

    @Autowired
    PlaylistRepository playlistrepo;
}
