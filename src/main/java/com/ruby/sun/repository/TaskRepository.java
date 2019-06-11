package com.ruby.sun.repository;

import com.ruby.sun.entity.Task;
import org.springframework.data.repository.Repository;
import java.util.*;

public interface TaskRepository extends Repository<Task, Integer> {
    List<Task> findAll();
    Task findById(int taskId);
    List<Task> findByName(String name);
    Task save(Task task);
}
