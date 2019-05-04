package org.spring.family.springcloudzuul9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuul9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuul9001Application.class, args);
    }

}
