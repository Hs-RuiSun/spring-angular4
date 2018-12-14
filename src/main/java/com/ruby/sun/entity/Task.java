package com.ruby.sun.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-mm-dd@HH:MM:ss")
    private LocalDate dueDate;
    private boolean isCompleted;
    public Task(){}

}