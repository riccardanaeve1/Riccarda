package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

/**
 @author Riccarda Naeve
 general structure of project Model
 */
public class Project {
    //TODO id
    //TODO Projekt 0 bis n Task foreign key
    private final String name;
    private final UUID id;

    /**
     * Constructs and initializes project
     * @param name name of project
     * @param id uuid of the project

     */
    public Project(@JsonProperty("name") @NonNull String name, UUID id) {
        this.name= name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public UUID getId() { return id; }
    /*
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Project)) {
            return false;
        }

        Project converted = (Project) obj;

        return this.name.equals(converted.name);
    }
*/
    @Override
    public boolean equals(Object obj){
        Project project = (Project) obj;
        if(project.getName() != this.getName()){
            return false;
        }if( id != project.getId()){
            return false;
        }
        return true;
    }
}
