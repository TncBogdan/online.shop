package com.tnc.product.service;

import com.tnc.product.service.domain.ProductDomain;

import java.util.List;

public interface ProductService {
    ProductDomain add(ProductDomain productDomain);

    ProductDomain getById(Long id);

    List<ProductDomain> getAll();

    void delete(Long id);


}
