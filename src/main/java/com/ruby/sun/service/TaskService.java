package com.ruby.sun.service;

import com.ruby.sun.entity.Task;

import java.util.*;

public interface TaskService {
    List<Task> list();
    Task save(Task task);
    Task getTaskById(int taskId);
    List<Task> getTaskByName(String name);
}
