package com.ruby.sun.controller;

import com.ruby.sun.entity.Task;
import com.ruby.sun.service.TaskService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(this.taskService.list());
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<?> getTaksById(@PathVariable int taskId){
        Task task = this.taskService.getTaskById(taskId);
        if(task == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }

    @GetMapping(value = "", params = {"name"})
    public ResponseEntity<?> getTaskByName(@RequestParam String name){
        List<Task> list = taskService.getTaskByName(name);
        if(list==null || list.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping( value = "/save")
    public Task save(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
