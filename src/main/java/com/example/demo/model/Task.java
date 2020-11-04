package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;
/**
 @author Riccarda Naeve
 general structure of Task Model
 */
public class Task {

    private final String name;
    private final UUID id;
    private final boolean status;
    /**
     * Constructs and initializes project
     * @param name name of project
     * @param id uuid of the project
     * @param status status of the project

     */

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
