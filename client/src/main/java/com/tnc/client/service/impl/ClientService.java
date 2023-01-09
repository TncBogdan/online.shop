package com.tnc.client.service.impl;

import com.tnc.client.service.domain.ClientDomain;

import java.util.List;


public interface ClientService {
    ClientDomain add(ClientDomain userDomain);

    ClientDomain getById(Long id);

    List<ClientDomain> getAll();
    void delete(Long id);

}
