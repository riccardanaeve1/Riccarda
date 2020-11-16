package com.example.demo.model;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class modelTest {


    @Test
    public void projectHasNameAndTask(){
        UUID id = UUID.randomUUID();
        Project project = new Project(("Hans"), id);
        assertThat(project.getName()).isEqualTo("Hans");

    }
}
