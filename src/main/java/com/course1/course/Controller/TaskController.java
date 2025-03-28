package com.course1.course.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course1.course.Models.Task;
import com.course1.course.Services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Put task
    @PutMapping("/put")
    public ResponseEntity<Void> putTask(@RequestBody Task task) {
        Optional<Task> updatedTask = taskService.putTask(task);
        if (updatedTask.isPresent()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    // Delete task by id
    @RequestMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable("id") int id) {
        boolean isDeleted = taskService.deleteTaskById(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Post task
    @PostMapping("/post")
    public ResponseEntity<Task> postTask(@RequestBody Task task) {
        Task savedTask = taskService.postTask(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    // Get all tasks
    @RequestMapping("/getAll")
    public Iterable<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Get task by id
    @RequestMapping("/get/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") int id) {
        Optional<Task> task = taskService.getTaskById(id);
        if (task.isPresent()) {
            return ResponseEntity.ok(task.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
