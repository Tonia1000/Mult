package com.tads.ifms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BhaskaraApplication {

    public static void main(String[] args) {
        SpringApplication.run(BhaskaraApplication.class, args);
    }

}
