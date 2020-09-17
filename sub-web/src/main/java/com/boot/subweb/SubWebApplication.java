package com.boot.subweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan("com.boot.*")
@MapperScan("com.boot.subdao.dao")
@EnableAsync
public class SubWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubWebApplication.class, args);
    }

}
