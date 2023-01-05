package com.tnc.order.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "order")
public class Order {
    @Id
    @Positive
    private Long id;
    private Client client;
    private List<Product> orderedProducts;
    private Double finalPrice;
    private OrderStatus status;
    private Timestamp timestamp;
}
