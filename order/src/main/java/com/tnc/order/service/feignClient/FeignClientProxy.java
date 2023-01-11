package com.tnc.order.service.feignClient;

import com.tnc.order.controller.dto.ClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client.microservice")
public interface FeignClientProxy {
    @GetMapping("/client/getOne/{id}")
    ClientDto getOne();
}
