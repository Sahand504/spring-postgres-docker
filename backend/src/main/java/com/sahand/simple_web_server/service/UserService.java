package com.sahand.simple_web_server.service;

import com.sahand.simple_web_server.model.User;
import com.sahand.simple_web_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();

    }
}
