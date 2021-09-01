package com.game_of_thrones.ironbank2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class IronBank2021Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IronBank2021Application.class, args);
        System.out.println();
    }

}
