package com.agarment.product.productservice.services;


import com.agarment.product.productservice.entity.Product;
import com.agarment.product.productservice.model.ProductRequest;
import com.agarment.product.productservice.model.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.beans.BeanUtils.*;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public ProductResponse updateProduct(ProductRequest productRequest) {
        ProductResponse productResponse = new ProductResponse();
        copyProperties(productRequest,productResponse);
        return productResponse;
    }
}
