package com.tnc.client.service.impl;

import com.tnc.client.repository.ClientRepository;
import com.tnc.client.service.domain.ClientDomain;
import com.tnc.client.service.mapper.DomainMapper;
//import com.tnc.client.service.validation.ClientValidation;
import com.tnc.client.service.validation.ClientValidation;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.rmi.ServerError;
import java.rmi.ServerException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
        private final ClientValidation clientValidation;
    private final ClientRepository clientRepository;
    private final DomainMapper domainMapper;

    @Override
    public ClientDomain findByEmail(String email) {
        return domainMapper.toDomain(clientRepository.findByEmail(email));
    }

    @Override
    public ClientDomain add(ClientDomain userDomain) throws Exception {
        clientValidation.checkIfEmailExist(userDomain.getEmail());
        var client = domainMapper.toEntity(userDomain);
        var saved_client = clientRepository.save(client);
        return domainMapper.toDomain(saved_client);
    }

//    public void checkIfEmailExist(String emailDto) throws Exception {
//        if (domainMapper.toDomain(clientRepository.findByEmail(emailDto))!= null) {
//            //   Add specific exception
//            throw new ServerException("Email exist");
//        }
//    }
//    public void checkIfEmailExist(String emailDto) throws Exception {
//        if(domainMapper.toDomain(clientRepository.findByEmail(emailDto))!= null){
//            System.out.println("Email exist");
//        }
//    }

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
