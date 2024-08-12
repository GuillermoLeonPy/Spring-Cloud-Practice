package com.springboot.springcloud.practice.payment.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.springcloud.practice.payment.api")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
