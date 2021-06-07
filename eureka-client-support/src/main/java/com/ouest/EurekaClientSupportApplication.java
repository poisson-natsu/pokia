package com.ouest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientSupportApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSupportApplication.class,args);
    }
}
