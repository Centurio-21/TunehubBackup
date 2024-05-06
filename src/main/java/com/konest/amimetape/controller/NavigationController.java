package com.konest.amimetape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/home")
    public String gethome(){
        return "index";
    }

    @GetMapping("/register")
    public String getRegister(){
        return "registration";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/upload")
    public String getUpload(){
        return "uploaddata";
    }

    @GetMapping("/adminhome")
    public String getadminhome(){
        return "adminhome";
    }


}
