package com.nostalgia.productservice.controller;

import com.nostalgia.productservice.dto.ProductRequest;
import com.nostalgia.productservice.dto.ProductResponse;
import com.nostalgia.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct( @RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> retrieveProducts(){
        return productService.retrieveProducts();
    }
}
