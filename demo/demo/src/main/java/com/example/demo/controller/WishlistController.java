package com.example.demo.controller;

import com.example.demo.model.Wishlist;
import com.example.demo.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class WishlistController {
    @Autowired
    private final WishlistService wishlistService;

    @GetMapping("wishlists")
    public List<Wishlist> getAllWishlists(){
        return wishlistService.findAllWishlists();
    }
    @GetMapping("wishlists/id/{id}")
    public Optional<Wishlist> getWishlistById(@RequestParam Integer id){
        return wishlistService.findWishlistById(id);
    }
    @PostMapping("wishlists/add")
    public Wishlist addWishlist(@RequestBody Wishlist wishlist){
        return wishlistService.addWishlist(wishlist);
    }
}
