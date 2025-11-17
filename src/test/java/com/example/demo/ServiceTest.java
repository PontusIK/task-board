package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceTest {
    Repo repo;
    ListService service;

    @BeforeEach
    void setup() {
        repo = mock(Repo.class);
        service = new ListService(repo);
    }

    @Test
    void findAllHappy() {
        when(repo.findAll()).thenReturn(List.of(new TaskList()));
        List<TaskList> result = service.findAll();
        assertEquals(1, result.size());
    }
}
