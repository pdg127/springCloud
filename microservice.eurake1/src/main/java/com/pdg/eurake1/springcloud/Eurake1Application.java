package com.pdg.eurake1.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurake1Application {
    public static void main(String[] args) {
        SpringApplication.run(Eurake1Application.class, args);
    }
}
