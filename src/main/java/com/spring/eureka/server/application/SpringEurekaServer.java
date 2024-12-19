package com.spring.eureka.server.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaServer.class,args);
    }
}
