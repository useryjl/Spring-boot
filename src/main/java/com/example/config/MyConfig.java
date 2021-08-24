package com.example.config;

import com.example.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//此类为配置类、向容器中添加组件、组件id为其方法名

@Configuration
public class MyConfig {
    @Bean
    public HelloService helloworld(){
        System.out.println("此类为配置类、向容器中添加组件");
        return new HelloService();
    }
}
