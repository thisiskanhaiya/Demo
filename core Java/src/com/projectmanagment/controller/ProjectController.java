package com.projectmanagment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.projectmanagment.model.Project;
import com.projectmanagment.model.Task;
import com.projectmanagment.model.User;
import com.projectmanagment.service.ProjectService;

public class ProjectController {
    private ProjectService projectService = new ProjectService();

    private List<Project> projects;
    private List<Task> tasks;
    private List<User> users;

    private Scanner scanner;

    public ProjectController() {    
    this.projects = new ArrayList<>();
    this.tasks = new ArrayList<>();
    this.users = new ArrayList<>();
    this.scanner = new Scanner(System.in);
    }

    public void createProject() {
        System.out.println("Enter project name:");
        String projectName = scanner.nextLine();
        System.out.println("Enter project description:");
        String projectDescription = scanner.nextLine();
        Project project = new Project(projectName, projectDescription);
        projects.add(project);
        System.out.println("Project created successfully!");
   
    }
}
