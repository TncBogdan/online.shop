package com.tnc.client.service.validation;

import com.tnc.client.repository.ClientRepository;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.rmi.ServerException;

@Data
@Configuration
public class ClientValidation {

    private final ClientRepository clientRepository;

    protected void validateClient(String firstnameDto, String lastNameDto, String emailDto, String passwordDto, String phoneNumberDto, String cityDto) throws Exception{
        checkIfEmailExist(emailDto);
    }

    public void checkIfEmailExist(String emailDto) throws Exception {
//        ClientDomain clientDomain = new ClientDomain();
//        clientDomain.setFirstname(firstnameDto);
//        clientDomain.setLastName(lastNameDto);
//        clientDomain.setEmail(emailDto);
//        clientDomain.setCity(cityDto);
//        clientDomain.setPassword(passwordDto);
//        clientDomain.setPhoneNumber(phoneNumberDto);
        if (clientRepository.findByEmail(emailDto) != null) {
            throw new ServerException("Email exist");
        }
    }

    public void checkIfPhoneNumberExist(String phoneNumber) {

    }


}