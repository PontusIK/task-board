package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService {
    private final Repo repo;
    
    @Autowired
    public ListService(Repo repo) {
        this.repo = repo;
    }

    public List<TaskList> findAll() {
        return repo.findAll();
    }

    public TaskList createList(TaskList taskList) {
        taskList = taskList.setId(null);
        return repo.save(taskList);
    }
}
