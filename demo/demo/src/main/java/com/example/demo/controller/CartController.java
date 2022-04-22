package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CartController {
    @Autowired
    private final CartService cartService;

    @GetMapping("/carts")
    public List<Cart> getAll(){
        return cartService.getAllCarts();
    }
    @PostMapping("/carts/add")
    public Cart addCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }
    @GetMapping("carts/id/{id}")
    public Optional<Cart> getCartById(@RequestParam Integer id){
        return cartService.getCartById(id);
    }
    @PostMapping("carts/addProducts/{CartId}/{ProductId}")
    public Cart addProductToCart(@PathVariable Integer CartId, @PathVariable Integer ProductId){
        return cartService.addProductToCart(CartId,ProductId);
    }
}
