package com.devinhouse.javawebmarket.controller;

import com.devinhouse.javawebmarket.model.transport.ProductDTO;
import com.devinhouse.javawebmarket.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductREST {

    private ProductService productService;

    public ProductREST(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> create (@RequestBody ProductDTO productDTO){
        productService.create(productDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
