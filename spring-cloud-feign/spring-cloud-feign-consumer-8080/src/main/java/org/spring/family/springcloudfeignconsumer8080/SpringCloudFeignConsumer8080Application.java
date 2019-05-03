package org.spring.family.springcloudfeignconsumer8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "order.spring.family.springcloudfeignapi.api")
public class SpringCloudFeignConsumer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignConsumer8080Application.class, args);
    }

}
