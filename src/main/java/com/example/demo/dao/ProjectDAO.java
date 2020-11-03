package com.example.demo.dao;

import com.example.demo.model.Project;

import java.util.List;
import java.util.UUID;

/**
 * @author Riccarda Naeve
 * Repository ProjectDAO
 */
public interface ProjectDAO {

    int insertProject(Project project, UUID id);
    default int addProject(Project project){
        UUID id = UUID.randomUUID();
        return insertProject(project, id);
    }
    List<Project> selectAllProjects();

}
