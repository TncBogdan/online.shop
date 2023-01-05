package com.tnc.client.controller.mapper;

import com.tnc.client.controller.dto.ClientDto;
import com.tnc.client.repository.entity.Client;
import com.tnc.client.service.domain.ClientDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapper {
    ClientDto toEntity(ClientDomain clientDomain);
    ClientDomain toDomain(ClientDto clientDto);
    List<ClientDto> toEntity(List<ClientDomain> clientDomainList);
    List<ClientDomain> toDomain(List<ClientDto> clientDtoList);
}
