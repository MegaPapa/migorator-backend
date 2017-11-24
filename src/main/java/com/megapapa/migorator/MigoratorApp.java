package com.megapapa.migorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.megapapa.migorator.*")
public class MigoratorApp {

    public static void main(String[] args) {
        SpringApplication.run(MigoratorApp.class, args);
    }
}
