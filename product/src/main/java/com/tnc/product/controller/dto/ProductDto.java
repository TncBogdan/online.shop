package com.tnc.product.controller.dto;

public record ProductDto(
        Long id,
        String name,
        String description,
        Double price) {
}
