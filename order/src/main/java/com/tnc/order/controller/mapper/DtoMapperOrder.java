package com.tnc.order.controller.mapper;

import com.tnc.order.controller.dto.OrderDto;
import com.tnc.order.service.domain.OrderDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapperOrder {
    OrderDto toDto(OrderDomain orderDomain);
    List<OrderDto> toDtoList(List<OrderDomain> orderDomainList);

    OrderDomain toDomain(OrderDto orderDto);
    List<OrderDomain> toDomainList(List<OrderDto> orderDtoList);
}
