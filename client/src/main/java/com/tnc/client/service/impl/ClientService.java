package com.tnc.client.service.impl;

import com.tnc.client.service.domain.ClientDomain;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface ClientService {
    ClientDomain add(ClientDomain userDomain);

    ClientDomain getById(Long id);

    List<ClientDomain> getAll();
    String delete(Long id);

}
