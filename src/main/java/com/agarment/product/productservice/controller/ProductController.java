package com.agarment.product.productservice.controller;


import com.agarment.product.productservice.entity.Product;
import com.agarment.product.productservice.model.ProductRequest;
import com.agarment.product.productservice.model.ProductResponse;
import com.agarment.product.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    /**
     * addProduct method is used to create a product
     * @param productRequest
     * @return
     */
    @PostMapping()
    public ResponseEntity<Product> addProdcut(@RequestBody ProductRequest productRequest){
        Product product = new Product();
        product.setProductId(1);
        product.setProductName("agarment");
        product.setQuantity(1);
        product.setPrice(500);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


    @GetMapping()
    public ResponseEntity<Product> getProduct(@RequestBody ProductRequest productRequest){
        Product product = new Product();
        product.setProductId(1);
        product.setProductName("agarment");
        product.setQuantity(1);
        product.setPrice(500);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}
