package com.tnc.api.gateway.imported.domain;

import lombok.Data;

@Data
public class OrderClientDomain {
    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;
}
