package com.ccnu.ssm_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ccnu.ssm_project.dao")
public class SsmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmProjectApplication.class, args);
    }

}
