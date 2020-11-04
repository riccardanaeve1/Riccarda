package com.example.demo.service;

import com.example.demo.dao.ProjectDAO;
import com.example.demo.dao.TaskDAO;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Riccarda Naeve
 * Service Class to add and get Task from the Repository
 */
@Service
public class TaskService {

    private final TaskDAO taskDAO;

    @Autowired
    public TaskService(@Qualifier("fakedao") TaskDAO taskDAO){
        this.taskDAO = taskDAO;
    }
    public int addTask(Task task){
        return taskDAO.insertTask(task, task.getId(), task.isStatus());
    }
    public List<Task> getAllTask() {
        return taskDAO.selectAllTask();
    }

}
