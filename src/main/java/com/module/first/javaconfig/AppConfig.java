package com.module.first.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Create beans with different scope using Java config
@Configuration
public class AppConfig {

    @Bean
    public SpringBean1 createSpringBean1(){
        return new SpringBean1();
    }

    @Bean
    @Scope(value = "prototype")
    public SpringBean2 createSpringBean2(){
        return new SpringBean2();
    }
}
