package org.spring.family.springcloudribbonserver9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudRibbonServer9000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbonServer9000Application.class, args);
    }

}
