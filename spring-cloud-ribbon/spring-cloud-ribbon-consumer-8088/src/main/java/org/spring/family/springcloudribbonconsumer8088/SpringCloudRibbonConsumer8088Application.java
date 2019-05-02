package org.spring.family.springcloudribbonconsumer8088;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudRibbonConsumer8088Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbonConsumer8088Application.class, args);
    }

}
