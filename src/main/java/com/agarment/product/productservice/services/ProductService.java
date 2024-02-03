package com.agarment.product.productservice.services;


import com.agarment.product.productservice.model.ProductRequest;
import com.agarment.product.productservice.model.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductResponse updateProduct(ProductRequest productRequest);

}
