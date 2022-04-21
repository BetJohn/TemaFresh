package com.example.demo.controller;

import com.example.demo.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WishlistController {
    @Autowired
    private final WishlistService wishlistService;
}
