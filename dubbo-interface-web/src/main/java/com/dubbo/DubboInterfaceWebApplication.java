package com.dubbo;

import com.dubbo.config.ConsumerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DubboInterfaceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboInterfaceWebApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
    }

}
