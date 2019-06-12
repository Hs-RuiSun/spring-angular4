package com.ruby.sun.service;

import com.ruby.sun.entity.Task;
import com.ruby.sun.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public Task getTaskById(int taskId) {
        return this.taskRepository.findById(taskId);
    }

    @Override
    public List<Task> getTaskByName(String name) {
        return taskRepository.findByName(name);
    }
}