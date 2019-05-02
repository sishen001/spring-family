package org.spring.family.springcloudribbonconsumer8088.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    /**
     * 针对restTemplate 做负载均衡
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    /**
     * 更改负载算法
     * 默认轮询
     * @return
     */
    @Bean
    public IRule  myRule(){
        return  new RoundRobinRule();
    }
}
