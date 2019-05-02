package org.spring.family.springbootbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBaseApplication {

    //SpringBootServletInitializer 打war包 丢到tomcat pom需要配置 排出tomcat内置
    public static void main(String[] args) {
        SpringApplication.run(SpringBootBaseApplication.class, args);
    }

}
