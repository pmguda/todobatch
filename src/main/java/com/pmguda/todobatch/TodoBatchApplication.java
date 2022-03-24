package com.pmguda.todobatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class TodoBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoBatchApplication.class, args);
    }

}
