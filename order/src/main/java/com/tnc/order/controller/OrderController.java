package com.tnc.order.controller;

import com.tnc.order.controller.dto.OrderDto;
import com.tnc.order.controller.mapper.DtoMapperOrder;
import com.tnc.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
    private final DtoMapperOrder dtoMapperOrder;
    private final OrderService orderService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from product microservice";
    }

    @PostMapping("/add")
    ResponseEntity<OrderDto>createOrder(@RequestBody OrderDto orderDto){
        var domain_order = dtoMapperOrder.toDomain(orderDto);
        var order = orderService.createOrder(domain_order);
        return ResponseEntity.ok(dtoMapperOrder.toDto(order));
    }
}
