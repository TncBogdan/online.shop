package com.tnc.order.controller.mapper;

import com.tnc.order.controller.dto.ProductDto;
import com.tnc.order.service.domain.OrderProductDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapperProduct {
    ProductDto toDto(OrderProductDomain orderProductDomain);

    List<ProductDto> toDtoList(List<OrderProductDomain> orderProductDomainList);

    OrderProductDomain toDomain(ProductDto productDto);

    List<OrderProductDomain> toDomainList(List<ProductDto> productDtoList);
}
