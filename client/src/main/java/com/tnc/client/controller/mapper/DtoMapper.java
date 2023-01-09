package com.tnc.client.controller.mapper;

import com.tnc.client.controller.dto.ClientDto;
import com.tnc.client.service.domain.ClientDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DtoMapper {
    ClientDto toDto(ClientDomain clientDomain);
    ClientDomain toDomain(ClientDto clientDto);
    List<ClientDto> toDtoList(List<ClientDomain> clientDomainList);
    List<ClientDomain> toDomainList(List<ClientDto> clientDtoList);
}
