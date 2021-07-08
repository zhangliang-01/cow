package com.luck.cow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luck.cow.*")
public class CowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CowApplication.class, args);
    }

}
