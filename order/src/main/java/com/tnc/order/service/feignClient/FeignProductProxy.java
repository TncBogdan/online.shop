package com.tnc.order.service.feignClient;

import com.tnc.order.controller.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product.microservice", url = "http://localhost:8901")
public interface FeignProductProxy {
    @GetMapping("/product/getOne/{id}")
    ResponseEntity<ProductDto> getOne(@PathVariable("id") Long id);
}
