package com.tnc.order.service.serviceImpl;

import com.tnc.order.repository.entity.OrderRepository;
import com.tnc.order.service.OrderService;
import com.tnc.order.service.domain.OrderDomain;
import com.tnc.order.service.feignClient.FeignClientProxy;
import com.tnc.order.service.feignClient.FeignProductProxy;
import com.tnc.order.service.mapper.DomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final FeignClientProxy feignClientProxy;
    private final FeignProductProxy feignProductProxy;
    private final DomainMapper domainMapper;
    private final OrderRepository orderRepository;

    @Override
    public OrderDomain createOrder(OrderDomain orderDomain) {
        orderDomain.setClient_id(feignClientProxy.getOne().id());
        orderDomain.setProduct_id(feignProductProxy.getOne().id());
        var saved_order = orderRepository.save(domainMapper.toEntity(orderDomain));
        return domainMapper.toDomain(saved_order);
    }
}
