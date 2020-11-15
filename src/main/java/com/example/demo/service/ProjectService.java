package com.example.demo.service;

import com.example.demo.dao.ProjectDAO;
import com.example.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Riccarda Naeve
 * Service Class to add and get Projects from the Repository
 */
@Service
public class ProjectService {

    private final ProjectDAO projectDAO;

    @Autowired
    public ProjectService(@Qualifier("fakeDAO") ProjectDAO projectDAO){
        this.projectDAO = projectDAO;
    }
    public void addProject(Project project){
        //TODO Validierung(Duplizierung) überprüfen
     projectDAO.insertProject(project, project.getId());
    }
    public List<Project> getAllProjects(){ return projectDAO.selectAllProjects();}

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }



}
