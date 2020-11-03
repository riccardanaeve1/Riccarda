package com.example.demo.model;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TaskTest {

    @org.junit.jupiter.api.Test
    public void Task1(){
        UUID id = UUID.randomUUID();
        Task task = new Task("name", id);
        assertThat(task.getName()).isEqualTo("name");
    }

    public void Task2(){
        UUID id = UUID.randomUUID();
        Task task = new Task("name", id);
        assertThat(task.getId()).isEqualTo(id);
    }
}
