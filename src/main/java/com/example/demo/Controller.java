package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {
    private final ListService service;

    @Autowired
    public Controller(ListService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TaskList>> getAll() {
        List<TaskList> lists = service.findAll();
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }
}
