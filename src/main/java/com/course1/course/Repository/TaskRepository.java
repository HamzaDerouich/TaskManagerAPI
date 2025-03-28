package com.course1.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course1.course.Models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>
{
        
}
