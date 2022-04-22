package com.example.demo;

import com.example.demo.controller.ProductController;
import com.example.demo.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductServiceTest {
    @Autowired
    private ProductController productController;
    private Product product;
    @BeforeAll
    public void setUp(){
        product = productController.addProduct(new Product());
    }
    @Test
    public void givenProductId_WhenGetProductId_ThenVerifyProduct(){
        Assertions.assertEquals(product.getId(),productController.getProductById(1).get().getId());
    }
}
