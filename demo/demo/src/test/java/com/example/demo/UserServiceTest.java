package com.example.demo;

import com.example.demo.controller.UserConstroller;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserServiceTest {
    @Autowired
    private UserConstroller userConstroller;
    private User user;
    @BeforeAll
    public void setUp(){
        user = userConstroller.addUser(new User());
    }
    @Test
    public void givenUserId_WhenGetUserId_TheyVerifyUser(){
        Assertions.assertEquals(user.getId(),userConstroller.getUserById(1).get().getId());
    }
}
