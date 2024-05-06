package com.konest.amimetape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konest.amimetape.entity.User;

@Repository
public interface Userrepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

}
