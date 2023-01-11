package com.tnc.order.service.domain;

import lombok.Data;

@Data
public class OrderDomain {
    private Long id;
    private Long client_id;
    private Long product_id;
}
