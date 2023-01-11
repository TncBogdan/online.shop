package com.tnc.order.service.mapper;

import com.tnc.order.repository.entity.Order;
import com.tnc.order.service.domain.OrderDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomainMapper {
    Order toEntity(OrderDomain orderDomain);

    OrderDomain toDomain(Order order);
}
