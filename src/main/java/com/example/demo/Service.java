package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
    private final Repo repo;
    
    @Autowired
    public Service(Repo repo) {
        this.repo = repo;
    }

    public List<TaskList> findAll() {
        return repo.findAll();
    }
}
