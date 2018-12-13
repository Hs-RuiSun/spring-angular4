package com.ruby.sun.controller;

import com.ruby.sun.entity.Task;
import com.ruby.sun.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = "/api/task")
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @PostMapping( value = "save")
    public Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
