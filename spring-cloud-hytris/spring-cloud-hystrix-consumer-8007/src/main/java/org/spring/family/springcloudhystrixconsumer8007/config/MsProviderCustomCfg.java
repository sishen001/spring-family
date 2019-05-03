package org.spring.family.springcloudhystrixconsumer8007.config;

import feign.Contract;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class MsProviderCustomCfg {

    @Bean

    public Contract feignContract() {
        //这将SpringMvc Contract 替换为feign.Contract.Default
        return new Contract.Default();
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