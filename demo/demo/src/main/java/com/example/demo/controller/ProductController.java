package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductService productService;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("products/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("products/id/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }
    @GetMapping("products/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
}
