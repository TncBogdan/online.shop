package com.tnc.order.controller.dto;

public record OrderDto(
        Long id,
        Long client_id,
        Long product_id
) {
}
