package com.example.demo.service;

import com.example.demo.dao.ProjectDAO;
import com.example.demo.dao.TaskDAO;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskDAO taskDAO;

    @Autowired
    public TaskService(@Qualifier("fakedao") TaskDAO taskDAO){
        this.taskDAO = taskDAO;
    }
    public int addTask(Task task){
        return taskDAO.addTask(task);
    }
    public List<Task> getAllTask() {
        return taskDAO.selectAllTask();
    }

}
