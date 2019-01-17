package com.ruby.sun.service;

import com.ruby.sun.entity.Task;

public interface TaskService {
    Iterable<Task> list();
    Task save(Task task);
    Task getTaskById(int taskId);
}
