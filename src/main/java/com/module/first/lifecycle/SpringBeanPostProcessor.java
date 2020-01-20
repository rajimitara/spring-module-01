package com.module.first.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SpringBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor::Before"+getClass().getSimpleName() +"::"+bean.getClass().getSimpleName());
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor::After"+getClass().getSimpleName() +"::"+bean.getClass().getSimpleName());
        return null;
    }
}
