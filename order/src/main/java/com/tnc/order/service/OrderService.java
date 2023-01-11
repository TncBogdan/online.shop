package com.tnc.order.service;

import com.tnc.order.service.domain.OrderDomain;

public interface OrderService {
    OrderDomain createOrder(OrderDomain orderDomain);
}
