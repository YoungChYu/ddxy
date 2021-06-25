package com.ddxy.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@ServletComponentScan("com.ddxy")
public class DdxySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdxySystemApplication.class, args);
    }

}
