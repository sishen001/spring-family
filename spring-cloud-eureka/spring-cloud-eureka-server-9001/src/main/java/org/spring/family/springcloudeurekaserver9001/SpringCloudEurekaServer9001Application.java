package org.spring.family.springcloudeurekaserver9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer9001Application.class, args);
    }

}
