package com.springboot.springcloud.practice.config.server.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "Props query controller")
@RequestMapping(name = "Props query controller root path", path = "/reader")
public class PropertiesReaderController {

    @Value("${insurnace.provider.url}")
    private String insuranceProviderUrl;

    @GetMapping(path = "/insuranceProviderUrl")
    public String getInsuranceProviderUrl(){
        return insuranceProviderUrl;
    }
}
