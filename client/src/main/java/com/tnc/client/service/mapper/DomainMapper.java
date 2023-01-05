package com.tnc.client.service.mapper;

import com.tnc.client.repository.entity.Client;
import com.tnc.client.service.domain.ClientDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DomainMapper {
    Client toEntity(ClientDomain clientDomain);
    ClientDomain toDomain(Client client);
    List<Client> toEntity(List<ClientDomain> clientDomainList);
    List<ClientDomain> toDomain(List<Client> clientList);
}
