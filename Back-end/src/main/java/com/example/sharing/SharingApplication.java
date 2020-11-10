package com.example.sharing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sharing.dao")
public class SharingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingApplication.class, args);
    }

}
