package com.lening;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lening.mapper")
public class Test_A_jiangweiApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.lening.Test_A_jiangweiApplication.class,args);
    }
}
