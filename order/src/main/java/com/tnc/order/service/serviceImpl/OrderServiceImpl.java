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

    private final FeignClientProxy feignClientProxy;
    private final FeignProductProxy feignProductProxy;
    private final DomainMapper domainMapper;
    private final OrderRepository orderRepository;

    @Override
    public OrderDomain createOrder(OrderDomain orderDomain) {
        var clientProxy_id = feignClientProxy.getOne(orderDomain.getClient_id());
        var productProxy_id = feignProductProxy.getOne(orderDomain.getProduct_id());
        orderDomain.setClient_id(Objects.requireNonNull(clientProxy_id.getBody()).id());
        orderDomain.setProduct_id(Objects.requireNonNull(productProxy_id.getBody()).id());
        var saved_order = domainMapper.toEntity(orderDomain);
        orderRepository.save(saved_order);
        return domainMapper.toDomain(saved_order);
    }
}
