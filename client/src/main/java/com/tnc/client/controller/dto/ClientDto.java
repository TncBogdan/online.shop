package com.tnc.client.controller.dto;

public record ClientDto(
        Long id,
        String firstname,
        String lastName,
        String email,
        String password,
        String phoneNumber,
        String city) {
}
