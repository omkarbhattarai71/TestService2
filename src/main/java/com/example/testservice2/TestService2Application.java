package com.example.testservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestService2Application {

    public static void main(String[] args) {
        SpringApplication.run(TestService2Application.class, args);
    }

}
