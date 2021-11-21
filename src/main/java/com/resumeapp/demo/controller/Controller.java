package com.resumeapp.demo.controller;

import java.util.Map;

import com.resumeapp.demo.entity.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Controller {

    @Autowired
    private com.resumeapp.demo.service.UserService userService;

    @PostMapping("/createUser")
    public Users createUser(@RequestBody Users users) throws Exception {

        Users userResponse = userService.createUser(users);
        return userResponse;
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/validateLogin")
    public Users validateUser(@RequestBody Users users) {

        Users validUser = userService.validateUser(users);
        return validUser;
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/getUserData/{userId}")
    public Map<String, Object> getUserResumeData(@PathVariable(name = "userId") Long userId) {

        Map<String, Object> resp = userService.getUserResumeData(userId);
        return resp;

    }
}
