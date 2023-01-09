package com.tnc.product.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.mapstruct.ap.internal.model.GeneratedType;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Positive(message = "Just positive number")
    private Long id;
    private String name;
    private String description;
    private Double price;
}
