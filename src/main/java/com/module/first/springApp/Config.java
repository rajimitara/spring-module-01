package com.module.first.springApp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@ComponentScan(value = "com.module.first")
//@ComponentScan(basePackages = "com.module.first",
  //  includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*")
    //,excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = ".*(Spring)"))
@PropertySource(value = "application.properties")
@Configuration
public class Config {

    @Bean
    public ConversionService conversionService(){
        return new DefaultConversionService();
    }
}
