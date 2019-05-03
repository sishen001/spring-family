package org.spring.family.springcloudhystrixturbine9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SpringCloudHystrixTurbine9002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixTurbine9002Application.class, args);
    }

}
