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


    private static List<Project> DB = new ArrayList<>();

    @Override
    public int insertProject(Project project, UUID id) {
        DB.add(new Project(project.getName(), id));
        return 1;
    }

    @Override
    public List<Project> selectAllProjects() {
        UUID id = UUID.randomUUID();
        DB.add(new Project("Project1", id));
        DB.add(new Project("Project2", id));
        return DB;
    }

}
