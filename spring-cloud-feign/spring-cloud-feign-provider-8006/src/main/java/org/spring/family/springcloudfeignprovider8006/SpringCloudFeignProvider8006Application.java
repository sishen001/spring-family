package org.spring.family.springcloudfeignprovider8006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudFeignProvider8006Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignProvider8006Application.class, args);
    }

}
