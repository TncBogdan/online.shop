package com.tnc.order.controller.dto;

public record ProductDto(
        Long id,
        String name,
        String description,
        Double price) {
}
