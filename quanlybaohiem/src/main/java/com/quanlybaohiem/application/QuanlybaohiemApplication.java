package com.quanlybaohiem.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.quanlybaohiem")
@EntityScan( basePackages = {"com.quanlybaohiem"} )
@EnableJpaRepositories(basePackages = {"com.quanlybaohiem"})
public class QuanlybaohiemApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuanlybaohiemApplication.class, args);
    }
}
