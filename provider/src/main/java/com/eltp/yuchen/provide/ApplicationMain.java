package com.eltp.yuchen.provide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@MapperScan("com.eltp.yuchen.provide.dao")
@ImportResource(value = {"dubbo/dubbo-demo-provider.xml"})
public class ApplicationMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo/dubbo-demo-provider.xml"});
//        context.start();
        SpringApplication.run(ApplicationMain.class, args);
    }
}
