package com.tnc.product.service.domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
public class ProductDomain {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
