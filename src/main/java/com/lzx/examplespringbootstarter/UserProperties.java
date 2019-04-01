package com.lzx.examplespringbootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties("lzx.config")
public class UserProperties {
    private String name;
    private Integer age;
}
