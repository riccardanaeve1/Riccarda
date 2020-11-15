package com.example.demo.dao;

import com.example.demo.model.Project;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * @author Riccarda Naeve
 * Implementation of Repository ProjectDAO
 *
 */
@Repository("fakeDAO")
public class FakeProjectDataAccess implements ProjectDAO {


    private List<Project> db = new ArrayList<>();

    @Override
    public void insertProject(Project project, UUID id) {
        db.add(new Project(project.getName(), id));

    }

    @Override
    public List<Project> selectAllProjects() {
        return db;
    }

}
