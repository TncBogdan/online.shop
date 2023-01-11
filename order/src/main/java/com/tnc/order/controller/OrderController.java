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
@RequestMapping(name = "/order")
public class OrderController {
    private final DtoMapperOrder dtoMapperOrder;
    private final OrderService orderService;

    @PostMapping(name = "/add")
    ResponseEntity<OrderDto>createOrder(@RequestBody OrderDto orderDto){
        var order = orderService.createOrder(dtoMapperOrder.toDomain(orderDto));
        return ResponseEntity.ok(dtoMapperOrder.toDto(order));
    }
}
