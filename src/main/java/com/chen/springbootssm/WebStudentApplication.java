package com.chen.springbootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chen.springbootssm.mapper")
public class WebStudentApplication {

    public static void main(String[] args) {
        System.out.println("启动springboot...");
        SpringApplication.run(WebStudentApplication.class, args);
    }
}
