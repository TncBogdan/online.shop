package com.tnc.client.repository.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "clients")
@EqualsAndHashCode(of = "id")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;

}
