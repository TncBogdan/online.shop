package com.tnc.client.service.mapper;

import com.tnc.client.repository.entity.Client;
import com.tnc.client.service.domain.ClientDomain;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface DomainMapper {
    Client toEntity(ClientDomain clientDomain);
    ClientDomain toDomain(Client client);
    List<Client> toEntityList(List<ClientDomain> clientDomainList);
    List<ClientDomain> toDomainList(List<Client> clientList);

    ClientDomain toDomainOptional(Optional<Client> byId);

    Client toEntity(String userEmail);
}
