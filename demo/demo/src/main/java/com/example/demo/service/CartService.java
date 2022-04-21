package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    @Autowired
    private final CartRepository cartRepository;
}
