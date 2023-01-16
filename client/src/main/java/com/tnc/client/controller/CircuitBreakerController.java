package com.tnc.client.controller;

import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/circuit")
    @Retry(name = "client", fallbackMethod = "fallbackResponse")
    public String circuitBreaker(){
        logger.info("retrying logging");
        ResponseEntity<String> falseEntity =  new RestTemplate().getForEntity("http://locatlhost:8081/nimic", String.class);
//        return "Circuit breaker work";
        return falseEntity.getBody();
    }

    public String fallbackResponse(Exception e){
        return "fallback response";
    }
}
