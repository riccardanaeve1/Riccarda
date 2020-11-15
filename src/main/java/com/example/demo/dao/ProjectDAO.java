package com.example.demo.dao;

import com.example.demo.model.Project;

import java.util.List;
import java.util.UUID;

/**
 * @author Riccarda Naeve
 * Repository ProjectDAO
 */
public interface ProjectDAO {

    void insertProject(Project project, UUID id);

    List<Project> selectAllProjects();

}
