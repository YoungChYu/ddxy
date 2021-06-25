package com.ddxyc.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DdxycSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdxycSystemApplication.class, args);
    }

}