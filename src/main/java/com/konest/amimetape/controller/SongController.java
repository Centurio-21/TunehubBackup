package com.konest.amimetape.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.konest.amimetape.entity.Song;
import com.konest.amimetape.service.SongService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SongController {

    @Autowired
    SongService songService;

    @PostMapping("/upload")
    public String uploadsongs(@ModelAttribute Song songs) {
        
        songService.getuploadsongs(songs);
        return "uploaddata";
    }
    

    @GetMapping("/viewdata")
    public String viewData(Model model){
        List<Song>  songlist = songService.fetchalldata();
        model.addAttribute("songs", songlist);
        return "viewdata";
    }
}
