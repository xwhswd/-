package com.example.sciencemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.sciencemanager.mapper"})
public class SciencemanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SciencemanageApplication.class, args);
    }

}
