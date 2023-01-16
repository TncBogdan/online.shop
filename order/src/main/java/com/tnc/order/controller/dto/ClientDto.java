package com.tnc.order.controller.dto;

public record ClientDto(
        Long id,
        String firstname,
        String lastName,
        String email) {
}
