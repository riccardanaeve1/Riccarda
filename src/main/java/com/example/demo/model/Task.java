package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Task {

    private final String name;
    private final UUID id;
    private final boolean status;


    public Task(@JsonProperty("name") @NonNull String name, UUID id, boolean status) {
        this.name= name;
        this.id = id;
        this.status=status;
    }


    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

}
