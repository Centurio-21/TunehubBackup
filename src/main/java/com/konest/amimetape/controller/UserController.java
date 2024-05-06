package com.konest.amimetape.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.konest.amimetape.entity.Song;
import com.konest.amimetape.entity.User;
import com.konest.amimetape.service.SongService;
import com.konest.amimetape.service.UserService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    SongService songService;

    @PostMapping("/login")
    public String postMethodName(@ModelAttribute User user) {
        userService.getData(user);
        return "login";
    }

    @PostMapping("/validate")
    public String postMethodName(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
    
        if (userService.getValidCredentials(email, password)) {
            session.setAttribute("email", email);
            String role = userService.getRole(email);
            if (role.equals("admin")) {
                return "adminhome";
            }
            else {
				
				User user = userService.getUser(email);
				boolean userstatus = user.isPremium();
				List<Song> fetchAllSongs = songService.fetchalldata();
				model.addAttribute("songs", fetchAllSongs);
				
				model.addAttribute("ispremium", userstatus);
				return "customerhome";
			}
        }
        
        else{
            return "login";
        }
    }
    
    
    

}
