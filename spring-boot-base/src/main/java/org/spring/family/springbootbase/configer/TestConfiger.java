package org.spring.family.springbootbase.configer;

import org.spring.family.springbootbase.filter.TestFilter;
import org.spring.family.springbootbase.intercepter.TestIntercepter;
import org.spring.family.springbootbase.servlet.TestServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class TestConfiger extends WebMvcConfigurerAdapter {

    @Autowired
    public TestIntercepter testIntercepter;

    /**
     * 注册过滤器
     */
    @Bean
    public FilterRegistrationBean testFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new TestFilter());
        bean.addUrlPatterns("/bbb");
        return bean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(testIntercepter).addUrlPatterns("/**").excludePathPatterns("/index.html","/");
        registry.addInterceptor(testIntercepter).addPathPatterns("/**");
    }

    @Bean
    public ServletRegistrationBean testServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new TestServlet());
        bean.addUrlMappings("/aaa");
        return bean;
    }

}
