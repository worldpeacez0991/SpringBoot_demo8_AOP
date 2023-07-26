package com.example.springAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.springAOP")

// Find @Aspect and @Component
@EnableAspectJAutoProxy
public class BeanConfig {

}
