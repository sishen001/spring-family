package order.spring.family.springcloudfeignapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class SpringCloudFeignApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApiApplication.class, args);
    }

}
