package com.ruby.sun.controller;

import com.ruby.sun.entity.Task;
import com.ruby.sun.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = "/list")
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @GetMapping(value = "/{taskId}")
    public Task getTaksById(@PathVariable int taskId){ return this.taskService.getTaskById(taskId); }

    @PostMapping( value = "/save")
    public Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
