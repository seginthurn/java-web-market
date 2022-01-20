package com.devinhouse.javawebmarket.service;

import com.devinhouse.javawebmarket.model.persistence.Product;
import com.devinhouse.javawebmarket.model.repository.ProductRepository;
import com.devinhouse.javawebmarket.model.transport.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ResponseEntity<HttpStatus> create(ProductDTO productDTO){

        if(productDTO == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Product product = new Product(productDTO);
        productRepository.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
