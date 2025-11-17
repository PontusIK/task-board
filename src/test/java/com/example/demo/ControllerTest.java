package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatusCode;

class ControllerTest {
    Repo repo;
    Controller controller;

    @BeforeEach
    void setup() {
        repo = mock(Repo.class);
        ListService service = new ListService(repo);
        controller = new Controller(service);
    }

    @Test
    void findAll() {
        when(repo.findAll()).thenReturn(List.of(new TaskList()));
        var result = controller.getAll();
        assertEquals(HttpStatusCode.valueOf(200), result.getStatusCode());
        assertEquals(1, result.getBody().size());
    }

    @Test
    void createListSucess() {
        when(repo.save(any(TaskList.class))).thenAnswer(invocation -> {
            TaskList list = invocation.getArgument(0);
            return list.setId("1");
        });

        var result = controller.createList(new TaskList());
        assertEquals(HttpStatusCode.valueOf(200), result.getStatusCode());
        assertEquals("1", result.getBody().getId());
    }
}
