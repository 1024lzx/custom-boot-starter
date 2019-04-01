package com.lzx.examplespringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigurer {
    @Autowired
    private UserProperties userProperties;

    @Bean
    @ConditionalOnMissingBean
    public User userConfig(){
        return new User(userProperties.getName(),userProperties.getAge());
    }
}
