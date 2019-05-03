package org.spring.family.springcloudhystrixconsumer8007;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.spring.family.springcloudhystrixconsumer8007.api")
@EnableCircuitBreaker
public class SpringCloudHystrixConsumer8007Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixConsumer8007Application.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);  //系统启动时加载顺序
        //访问地址 http://localhost:8007/hystrix.stream
        registrationBean.addUrlMappings("/hystrix.stream");//路径
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
