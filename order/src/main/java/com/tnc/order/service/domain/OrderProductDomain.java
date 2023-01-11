package com.tnc.order.service.domain;

import lombok.Data;

@Data
public class OrderProductDomain {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
