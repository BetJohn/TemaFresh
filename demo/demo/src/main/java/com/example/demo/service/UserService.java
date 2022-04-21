package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(Integer id){
        return userRepository.getById(id);
    }
    public User insertUser(User user){
        return userRepository.save(user);
    }

}
