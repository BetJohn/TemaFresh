package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {
    @Autowired
    private final CartRepository cartRepository;
    @Autowired
    private final ProductRepository productRepository;
    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }
    public List<Cart> getAllCarts(){
        return cartRepository.findAll();
    }
    public Optional<Cart> getCartById(Integer id){
        return cartRepository.findById(id);
    }
    public Cart addProductToCart(Integer CartId, Integer ProductId){
        if(getCartById(CartId).isPresent()) {
            getCartById(CartId).get().addProduct(productRepository.getById(ProductId));
            cartRepository.save(cartRepository.getById(CartId));
            productRepository.getById(ProductId).setCart(getCartById(CartId).get());
            productRepository.save(productRepository.getById(CartId));
            return cartRepository.getById(CartId);
        }
        return null;
    }
}
