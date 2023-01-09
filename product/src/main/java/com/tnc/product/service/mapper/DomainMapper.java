package com.tnc.product.service.mapper;

import com.tnc.product.repository.entity.Product;
import com.tnc.product.service.domain.ProductDomain;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "spring")
public interface DomainMapper {
    Product toEntity(ProductDomain productDomain);
    ProductDomain toDomain(Product product);
    List<ProductDomain> toDomainList(List<Product> productList);
    List<Product> toEntityList(List<ProductDomain> productDomainList);
}
