package com.tnc.client.service.domain;

import lombok.Data;

@Data
public class ClientDomain {
    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;
}
