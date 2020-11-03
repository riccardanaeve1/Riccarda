package com.example.demo.service;


import com.example.demo.dao.ProjectDAO;
import com.example.demo.model.Project;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProjectServiceTest {
//TODO EqualsMethodeüberschreiben
    @Test
    public void ProjectServiceTest(){
        List<Project> DB = new ArrayList<>();
        UUID id = UUID.randomUUID();
        Project project = new Project("Projectone", id);
        ProjectDAO projectDAO = new ProjectDAO() {
            @Override
            public int insertProject(Project project, UUID id) {
                DB.add(new Project(project.getName(), id));
                return 1;
            }

            @Override
            public List<Project> selectAllProjects() {
                return null;
            }
        };
        projectDAO.insertProject(project, id);
        projectDAO.selectAllProjects();
        ProjectService projectService = new ProjectService(projectDAO);

        projectService.addProject(project);
        assertThat(projectService.getAllProjects());

    }

}
