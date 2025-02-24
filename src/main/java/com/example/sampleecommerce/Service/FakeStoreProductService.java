package com.example.sampleecommerce.Service;

import com.example.sampleecommerce.dto.FakeStoreResponseDTO;
import com.example.sampleecommerce.model.Category;
import com.example.sampleecommerce.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.ArrayList;


import java.util.ArrayList;

@Service
public class FakeStoreProductService {

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product getProductById(Integer id) {

        Product product = new Product();

        //call fake store api, to call we need to use rest template
        ResponseEntity<FakeStoreResponseDTO> fakeStoreResponse =
        restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, FakeStoreResponseDTO.class);

        //get the response
        FakeStoreResponseDTO response = fakeStoreResponse.getBody();

        //convert the response to product model
        product = convertFakeStoreResponseToProduct(response);

        //return the model
        return product;
    }

    private Product convertFakeStoreResponseToProduct(FakeStoreResponseDTO response) {

        Product product = new Product();
        Category category = new Category();

        category.setTitle(response.getTitle());
        product.setId(response.getId());
        product.setCategory(category);
        product.setDescription(response.getDescription());
        product.setImageURL(response.getImage());
        product.setTitle(response.getTitle());
        return product;

    }

    public List<Product> getAllProducts() {
        List<Product> response = new ArrayList<>();
        FakeStoreResponseDTO[] fakeStoreProducts =
                restTemplate.getForObject("http://fakestoreapi.com/products", FakeStoreResponseDTO[].class);
        return response;
    }
}