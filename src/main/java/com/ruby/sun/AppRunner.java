package com.ruby.sun;

import com.ruby.sun.entity.*;
import com.ruby.sun.service.*;
import org.slf4j.*;
import org.slf4j.Logger;
import org.springframework.boot.*;
import org.springframework.stereotype.*;

import java.time.*;
import java.time.temporal.*;
@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private TaskService taskService;

    public AppRunner(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... args) throws Exception {
        taskService.save(new Task(1, "create spring boot application", LocalDate.now(), false));
        taskService.save(new Task(2, "create all the packages", LocalDate.now().plus(1, ChronoUnit.DAYS), true));
        taskService.save(new Task(3, "implement entity, service, controller, repository", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
        taskService.save(new Task(4, "create configuration properties", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
        taskService.save(new Task(5, "run spring boot application", LocalDate.now().plus(4, ChronoUnit.DAYS), false));
        taskService.save(new Task(6, "config h2 console", LocalDate.now().plus(6, ChronoUnit.DAYS), false));
        taskService.save(new Task(7, "config h2 console", LocalDate.now().plus(6, ChronoUnit.DAYS), false));


        logger.info("-----------fetching tasks-------------");
        logger.info("fetch task 6: {}", taskService.getTaskById(6));
        logger.info("fetch task 2: {}", taskService.getTaskById(2));
        logger.info("fetch task 2: {}", taskService.getTaskById(2));
        logger.info("fetch task 6: {}", taskService.getTaskById(6));
        logger.info("fetch task 6: {}", taskService.getTaskById(6));
        logger.info("fetch task 2: {}", taskService.getTaskById(2));
        logger.info("fetch task 2: {}", taskService.getTaskById(2));
        logger.info("fetch task 2: {}", taskService.getTaskById(2));
        logger.info("fetch task 6: {}", taskService.getTaskById(6));
    }
}
