package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TaskList {
    private String id;
    private String name;
    private List<Task> tasks;

    private static class Task {
        private String id;
        private String name;
        private String description;
    }
}
