package com.example.demo.api;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Riccarda Naeve
 * TaskController for Project with Post and Get Request for the Path "api/v1/project/task"
 */
@RequestMapping("api/v1/project/task")
@RestController
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }
    @GetMapping
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }
}
