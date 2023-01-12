package com.tnc.order.service.feignClient;

import com.tnc.order.controller.dto.ClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client.microservice", url = "http://localhost:8902")
public interface FeignClientProxy {
    @GetMapping(value = "/client/getOne/{id}")
    ResponseEntity<ClientDto> getOne(@PathVariable("id") Long id);
}
