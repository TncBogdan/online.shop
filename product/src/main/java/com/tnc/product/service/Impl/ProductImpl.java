package com.tnc.product.service.Impl;

import com.tnc.product.repository.ProductRepository;
import com.tnc.product.service.ProductService;
import com.tnc.product.service.domain.ProductDomain;
import com.tnc.product.service.mapper.DomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {
    private final DomainMapper domainMapper;
    private final ProductRepository productRepository;


    @Override
    public ProductDomain add(ProductDomain productDomain) {
        var product = domainMapper.toEntity(productDomain);
        var product_saved = productRepository.save(product);
        return domainMapper.toDomain(product_saved);
    }

    @Override
    public ProductDomain getById(Long id) {
        return domainMapper.toDomain(productRepository.getReferenceById(id));
    }

    @Override
    public List<ProductDomain> getAll() {
        return domainMapper.toDomainList(productRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
