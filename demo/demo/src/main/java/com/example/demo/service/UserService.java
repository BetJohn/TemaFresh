package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.model.User;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final CartRepository cartRepository;
    @Autowired
    private final WishlistRepository wishlistRepository;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }
    public User insertUser(User user){
        return userRepository.save(user);
    }
    public User getUserByName(String name){
        return userRepository.findByName(name);
    }
    public Optional<User> addCartToUserAndUserToCart(Integer UserId, Integer CartId){
      if(getUserById(UserId).isPresent()) {
          getUserById(UserId).get().setCart(cartRepository.getById(CartId));
          cartRepository.findById(CartId).get().setUser(getUserById(UserId).get());
          userRepository.save(getUserById(UserId).get());
          cartRepository.save(cartRepository.findById(CartId).get());
          return userRepository.findById(UserId);
      }
        return null;
    }
}
