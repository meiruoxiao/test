package com.mrx.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * .
 *
 * @author Mei Ruoxiao
 * @since 2020/05/22
 */
@SpringBootApplication(scanBasePackages = "com")
@EnableScheduling
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}