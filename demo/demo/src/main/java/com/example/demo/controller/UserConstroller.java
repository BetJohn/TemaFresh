package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/users/{name}")
    public User getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
    @GetMapping("/users/search/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
    @PostMapping("users/setCart/{UserId}/{CartId}")
    public Optional<User> setCart(@PathVariable Integer UserId, @PathVariable Integer CartId){
        return userService.addCartToUserAndUserToCart(UserId,CartId);
    }
}
