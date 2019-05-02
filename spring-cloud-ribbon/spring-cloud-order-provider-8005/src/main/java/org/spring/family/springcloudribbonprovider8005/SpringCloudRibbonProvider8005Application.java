package org.spring.family.springcloudribbonprovider8005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudRibbonProvider8005Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbonProvider8005Application.class, args);
    }

}
