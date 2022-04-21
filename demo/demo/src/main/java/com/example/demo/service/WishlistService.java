package com.example.demo.service;

import com.example.demo.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishlistService {
    @Autowired
    private final WishlistRepository wishlistRepository;
}
