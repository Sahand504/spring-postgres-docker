package com.sahand.simple_web_server.controller;

import com.sahand.simple_web_server.model.User;
import com.sahand.simple_web_server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {

        logger.info("Hello World API triggered!");
        return ResponseEntity.ok("Hello World2!");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {

        logger.info("Users API triggered!");
        return ResponseEntity.ok(userService.findAllUsers());
    }

}
