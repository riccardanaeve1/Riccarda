package com.example.demo.dao;

import com.example.demo.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskDAO {

    int  insertTask(Task Task, UUID id, boolean status);

    default int addTask(Task task){
        UUID id = UUID.randomUUID();
        return insertTask(task, id, false);
    }
    List<Task> selectAllTask();

}
