package com.example.technical_inspection_register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TechnicalInspectionRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalInspectionRegisterApplication.class, args);
    }

}
