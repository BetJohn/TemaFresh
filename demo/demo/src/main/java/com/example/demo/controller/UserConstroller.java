package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserConstroller {
    @Autowired
    private final UserService userService;
    @GetMapping("/users")
    public List<User>getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/users/add")
    public User addUser(@RequestBody User user){
        return userService.insertUser(user);
    }
}
