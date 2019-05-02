package org.spring.family.springcloudeurekaserver9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer9002Application.class, args);
    }

}
