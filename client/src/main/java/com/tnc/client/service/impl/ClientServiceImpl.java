package com.tnc.client.service.impl;

import com.tnc.client.repository.ClientRepository;
import com.tnc.client.service.domain.ClientDomain;
import com.tnc.client.service.mapper.DomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final DomainMapper domainMapper;

    @Override
    public ClientDomain add(ClientDomain userDomain) {
        var client = domainMapper.toEntity(userDomain);
        var saved_client = clientRepository.save(client);
        return domainMapper.toDomain(saved_client);
    }

    @Override
    public ClientDomain getById(Long id) {
        return domainMapper.toDomain(clientRepository.getReferenceById(id));
    }

    @Override
    public List<ClientDomain> getAll() {
        return domainMapper.toDomainList(clientRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
