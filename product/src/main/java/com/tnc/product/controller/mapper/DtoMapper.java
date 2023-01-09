package com.tnc.product.controller.mapper;

import com.tnc.product.controller.dto.ProductDto;
import com.tnc.product.service.domain.ProductDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapper {
    ProductDto toDto(ProductDomain productDomain);

    ProductDomain toDomain(ProductDto productDto);
    List<ProductDomain> toDomainList(List<ProductDto> productDtoList);
    List<ProductDto> toDtoList(List<ProductDomain> productDomainList);
}
