package com.course1.course.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.course1.course.Models.Task;
import com.course1.course.Repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Put task 
    public Optional<Task> putTask(Task task) {
        Optional<Task> existingTask = taskRepository.findById(task.getId());
        if (existingTask.isPresent()) {
            Task updatedTask = existingTask.get();
            updatedTask.setTitle(task.getTitle());
            updatedTask.setDescription(task.getDescription());
            updatedTask.setCompleted(task.getCompleted());
            taskRepository.save(updatedTask);
            return Optional.of(updatedTask);
        } else {
            return Optional.empty();
        }
    }

    // Delete task by id
    public boolean deleteTaskById(int id) {
        return taskRepository.findById(id)
                .map(task -> {
                    taskRepository.deleteById(id);
                    return true;
                })
                .orElse(false);
    }

    // Post task
    public Task postTask(Task task) {
        return taskRepository.save(task);
    }

    // Get all tasks
    public Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by id
    public Optional<Task> getTaskById(int id) {
        return taskRepository.findById(id);
    }
}
