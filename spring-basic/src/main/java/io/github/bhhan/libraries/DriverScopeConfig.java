package io.github.bhhan.libraries;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverScopeConfig {
    @Bean
    public BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new DriverScopePostProcessor();
    }
}
