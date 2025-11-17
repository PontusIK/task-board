package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TaskList {
    private String id;
    private String name;
    private List<Task> tasks;

    public TaskList setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    private static class Task {
        private String id;
        private String name;
        private String description;
    }
}
