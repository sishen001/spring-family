package org.spring.family.springcloudhystrixconsumer8007.config;

import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MsConsumerCustomCfg {

    /**
     * 如果不写默认是Hystrix.Builder 是支持回调的，写了就不支持
     * 也就是说如果Feign 使用时加了这个配置，那么就不支持fallback
     * @return
     */
    @Scope("prototype")
    @Bean
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }





    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }



    @Bean
    public RequestInterceptor tulingInterceptor() {
        return null;
    }
}