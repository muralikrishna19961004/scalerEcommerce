package com.example.sampleecommerce.controller;

import com.example.sampleecommerce.Service.FakeStoreProductService;
import com.example.sampleecommerce.model.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController

public class ProductController {

    private FakeStoreProductService service;

    public ProductController(FakeStoreProductService service) {
        this.service = service;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Integer id) {
        Product response = service.getProductById(id);
        return response;
    }

    @PostMapping("/products")
    public void createProduct() {

    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {

        return service.getAllProducts();

    }


    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable("id") Integer id) {

    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable("id") Integer id) {

    }

}