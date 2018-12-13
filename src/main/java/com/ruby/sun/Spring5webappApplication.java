package com.ruby.sun;

import com.ruby.sun.entity.Task;
import com.ruby.sun.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Spring5webappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5webappApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1, "create spring boot application", LocalDate.now(), false));
            taskService.save(new Task(2, "create all the packages", LocalDate.now().plus(1, ChronoUnit.DAYS), true));
            taskService.save(new Task(3, "implement entity, service, controller, repository", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskService.save(new Task(4, "create configuration properties", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskService.save(new Task(5, "run spring boot application", LocalDate.now().plus(4, ChronoUnit.DAYS), false));
            taskService.save(new Task(6, "config h2 console", LocalDate.now().plus(6, ChronoUnit.DAYS), false));
        };
    }
}
