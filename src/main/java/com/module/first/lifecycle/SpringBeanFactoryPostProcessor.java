package com.module.first.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class SpringBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor::Start");
        Arrays.stream(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("BeanFactoryPostProcessor::End");
    }
}
