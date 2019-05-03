package org.spring.family.springcloudhystrisdashboard9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudHystrisDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrisDashboard9001Application.class, args);
    }

}
