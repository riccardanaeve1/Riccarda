package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Task {

    private final String name;
    private final UUID id;

    public Task(@JsonProperty("name") @NonNull String name, UUID id) {
        this.name= name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

}
