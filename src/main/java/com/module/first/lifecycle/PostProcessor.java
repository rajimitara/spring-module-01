package com.module.first.lifecycle;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Configuration
public class PostProcessor {

 @Bean
    public static BeanFactoryPostProcessor getBeanFactoryPostProcessor(){
        return new SpringBeanFactoryPostProcessor();
    }
    @Bean
    public BeanPostProcessor getBeanPostProcessor(){
        return new SpringBeanPostProcessor();
    }
}
