package com.tnc.order.controller.mapper;

import com.tnc.order.controller.dto.ClientDto;
import com.tnc.order.service.domain.OrderClientDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapperClient {
    ClientDto toDto(OrderClientDomain orderClientDomain);

    OrderClientDomain toDomain(ClientDto clientDto);

    List<ClientDto> toDtoList(List<OrderClientDomain> orderClientDomainList);

    List<OrderClientDomain> toDomainList(List<ClientDto> clientDtoList);
}
