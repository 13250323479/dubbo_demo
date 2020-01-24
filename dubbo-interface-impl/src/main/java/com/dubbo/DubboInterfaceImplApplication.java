package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.dubbo.config.DubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@DubboComponentScan("com.dubbo.movie.service.impl")
public class DubboInterfaceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboInterfaceImplApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
    }

}
