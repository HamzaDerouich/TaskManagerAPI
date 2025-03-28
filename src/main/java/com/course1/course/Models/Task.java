package com.course1.course.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import  jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task 
{
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "completed")
    private int completed;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public Task() 
    {
        // Default constructor
    }

    public Task(int id, int completed, String title, String description)
    {
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.description = description;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }       

    public int getCompleted() 
    {
        return completed;
    }

    public void setCompleted(int completed) 
    {
        this.completed = completed;
    }

    @Override
    public String toString() 
    {
        return "Task [id=" + id + ", completed=" + completed + ", title=" + title + ", description=" + description + "]";
    }

}
