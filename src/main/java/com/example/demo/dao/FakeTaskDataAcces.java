package com.example.demo.dao;

import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakedao")
public class FakeTaskDataAcces implements  TaskDAO{

    private static List<Task> DB = new ArrayList<>();
    @Override
    public int insertTask(UUID id, Task task) {
        DB.add(new Task(task.getName() ,id));
        return 1;
    }

    @Override
    public int addTask(Task task) {
        return 0;
    }

    @Override
    public List<Task> selectAllTask() {
        return DB;
    }

}
