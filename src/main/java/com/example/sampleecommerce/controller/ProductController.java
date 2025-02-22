package com.example.sampleecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {

    @GetMapping("/products/{id}")
    public void getProductById(@PathVariable("id") Integer id) {

    }

    @PostMapping("/products")
    public void createProduct() {

    }
    @GetMapping("/products")
    public void getAllProducts() {

    }


    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable("id") Integer id) {

    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable("id") Integer id) {

    }


}
