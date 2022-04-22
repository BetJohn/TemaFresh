package com.example.demo;

import com.example.demo.controller.WishlistController;
import com.example.demo.model.Wishlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WishlistServiceTest {
    @Autowired
    private WishlistController wishlistController;
    private Wishlist wishlist;
    @BeforeAll
    public void setUp(){
        wishlist = wishlistController.addWishlist(new Wishlist());
    }
    @Test
    public void givenWishlistId_WhenGetWishlistId_ThenVerifyWishlist(){
        Assertions.assertEquals(wishlist.getId(),wishlistController.getWishlistById(1).get().getId());
    }
}
