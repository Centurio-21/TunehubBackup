package com.konest.amimetape.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konest.amimetape.entity.User;
import com.konest.amimetape.repository.Userrepository;
import com.konest.amimetape.service.UserService;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    Userrepository userrepo;

    @Override
    public void getData(User user) {

        User existingUser = userrepo.findByEmail(user.getEmail());
        if (existingUser == null) {
            userrepo.save(user);
        }else{
            System.out.println("already present");
        }

    }

    @Override
    public boolean getValidCredentials(String email, String password) {
        User user = userrepo.findByEmail(email);
        String userPassword =  user.getPassword();
        if (password.equals(userPassword)) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String getRole(String email) {
        User user = userrepo.findByEmail(email);
        return user.getRole();
    }

    @Override
    public void updateUser(User user) {
        userrepo.save(user);
    }

    @Override
    public User getUser(String mail) {
        return userrepo.findByEmail(mail);
    }



}
