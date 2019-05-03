package org.spring.family.springcloudhystrixconsumer8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class SpringCloudHystrixConsumer8007Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixConsumer8007Application.class, args);
    }

}
