package com.example.deploytester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeploytesterApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DeploytesterApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(DeploytesterApplication.class);
    }
}
