package com.example.demo;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;

class ServiceTest {
    Repo repo;
    Service service;

    @BeforeEach
    void setup() {
        repo = mock(Repo.class);
        service = new Service(repo);
    }
}
