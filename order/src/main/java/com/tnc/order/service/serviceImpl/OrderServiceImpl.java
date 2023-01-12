package com.tnc.order.service.serviceImpl;

import com.tnc.order.repository.OrderRepository;
import com.tnc.order.service.OrderService;
import com.tnc.order.service.domain.OrderDomain;
import com.tnc.order.service.feignClient.FeignClientProxy;
import com.tnc.order.service.feignClient.FeignProductProxy;
import com.tnc.order.service.mapper.DomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
//    private final OrderRepository orderRepository;
//    private final DomainMapper domainMapper;
//
//    @Override
//    public OrderDomain createOrder(OrderDomain orderDomain) {
//        var entity_order = domainMapper.toEntity(orderDomain);
//        orderRepository.save(entity_order);
//        return domainMapper.toDomain(entity_order);
//    }
    private final FeignClientProxy feignClientProxy;
    private final FeignProductProxy feignProductProxy;
    private final DomainMapper domainMapper;
    private final OrderRepository orderRepository;

    @Override
    public OrderDomain createOrder(OrderDomain orderDomain) {
        var o = feignClientProxy.getOne(orderDomain.getClient_id());
        var oi = feignProductProxy.getOne(orderDomain.getProduct_id());
        orderDomain.setClient_id(Objects.requireNonNull(o.getBody()).id());
        orderDomain.setProduct_id(Objects.requireNonNull(oi.getBody()).id());
        var saved_order = domainMapper.toEntity(orderDomain);
        orderRepository.save(saved_order);
        return domainMapper.toDomain(saved_order);
    }
//    public OrderDomain createOrder(OrderDomain orderDomain) {
//        var o = feignClientProxy.getOne().id();
//        var oi = feignProductProxy.getOne().id();
//        orderDomain.setClient_id(o);
//        orderDomain.setProduct_id(oi);
//        var saved_order = orderRepository.save(domainMapper.toEntity(orderDomain));
//        return domainMapper.toDomain(saved_order);
//    }
}
