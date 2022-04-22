package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }
}
