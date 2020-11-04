package com.example.demo.dao;

import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * @author Riccarda Naeve
 * Implementation of Repository TaskDAO
 *
 */
@Repository("fakedao")
public class FakeTaskDataAcces implements  TaskDAO{

    private static List<Task> DB = new ArrayList<>();
    @Override
    public int insertTask(Task task, UUID id, boolean status) {
        DB.add(new Task(task.getName() ,id, false));
        return 1;
    }

    @Override
    public int addTask(Task task) {
        return 0;
    }

    @Override
    public List<Task> selectAllTask() {
        DB.add(new Task("Task1", UUID.randomUUID(), false));
        DB.add(new Task("Task2", UUID.randomUUID(), true));
        return DB;
    }

}
