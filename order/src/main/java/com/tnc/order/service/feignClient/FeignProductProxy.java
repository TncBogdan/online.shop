package com.tnc.order.service.feignClient;

import com.tnc.order.controller.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product.microservice")
public interface FeignProductProxy {
    @GetMapping("/product/getOne/{id}")
    ProductDto getOne();
}
