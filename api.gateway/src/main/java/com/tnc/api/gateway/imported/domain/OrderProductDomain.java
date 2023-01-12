package com.tnc.api.gateway.imported.domain;

import lombok.Data;

@Data
public class OrderProductDomain {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
