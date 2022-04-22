package com.example.demo;

import com.example.demo.controller.CartController;
import com.example.demo.model.Cart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CartServiceTest {
    @Autowired
    private CartController cartController;
    private Cart cart;
    @BeforeAll
    public void setUp(){
        cart = cartController.addCart(new Cart());
    }
    @Test
    public void givenCartId_WhenGetCartId_ThenVerifyCart(){
        Assertions.assertEquals(cart.getId(),cartController.getCartById(1).get().getId());
    }
}
