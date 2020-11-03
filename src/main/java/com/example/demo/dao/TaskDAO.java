package com.example.demo.dao;

import com.example.demo.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskDAO {

    int  insertTask(UUID id, Task Task);

    default int addTask(Task task){
        UUID id = UUID.randomUUID();
        return insertTask(id, task);
    }
    List<Task> selectAllTask();

}
