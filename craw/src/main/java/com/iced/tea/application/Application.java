package com.iced.tea.application;

import com.iced.tea.controller.ViewController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.iced.tea"})
@EntityScan(basePackages = {"com.iced.tea.model"})
@EnableJpaRepositories(basePackages = {"com.iced.tea.repo"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
