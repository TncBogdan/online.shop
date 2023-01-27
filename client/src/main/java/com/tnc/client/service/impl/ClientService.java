package com.tnc.client.service.impl;

import com.tnc.client.service.domain.ClientDomain;

import java.util.List;
import java.util.Optional;


public interface ClientService {
    ClientDomain findByEmail(String email);
    ClientDomain add(ClientDomain userDomain) throws Exception;

    ClientDomain getById(Long id);

    List<ClientDomain> getAll();
    void delete(Long id);

}
