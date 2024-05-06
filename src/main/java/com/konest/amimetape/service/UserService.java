package com.konest.amimetape.service;

import com.konest.amimetape.entity.User;

public interface UserService {

    void getData(User user);

    boolean getValidCredentials(String email, String password);

    String getRole(String email);

    void updateUser(User user);

    User getUser(String mail);

}
