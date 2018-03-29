package com.eureka.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer-ribbon")
    public String consumer(){
       return restTemplate.getForObject("http://eureka-producer/producer",String.class);
    }
}
