package com.example.demo.service;

import com.example.demo.model.Wishlist;
import com.example.demo.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishlistService {
    @Autowired
    private final WishlistRepository wishlistRepository;
    public Wishlist addWishlist(Wishlist wishlist){
        return wishlistRepository.save(wishlist);
    }
    public Optional<Wishlist> findWishlistById(Integer id){
        return wishlistRepository.findById(id);
    }
    public List<Wishlist> findAllWishlists(){
        return wishlistRepository.findAll();
    }
}
