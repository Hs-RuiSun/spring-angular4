package com.ruby.sun.repository;

import com.ruby.sun.*;
import com.ruby.sun.entity.Task;
import org.springframework.cache.annotation.*;
import org.springframework.data.repository.Repository;
import java.util.*;

public interface TaskRepository extends Repository<Task, Integer> {
    List<Task> findAll();
    @Cacheable(CacheRegionKeys.TASK)
    Task findById(int taskId);
    List<Task> findByName(String name);
    Task save(Task task);
}
