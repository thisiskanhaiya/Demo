package com.projectmanagment;

import java.util.Scanner;

import com.projectmanagment.controller.ProjectController;

public class Main {
    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Project Management System");
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Create a new project");
            System.out.println("2. Create a new task");
            System.out.println("3. Create a new user");
            System.out.println("4. Assign a task to a user");
            System.out.println("5. Update a task's status");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {        
                case 1:
                    projectController.createProject();
                    break;
                case 2:
                    projectController.createTask();
                    break;
                case 3:
                    projectController.createUser();
                    break;
                case 4:
                    projectController.assignTaskToUser();
                    break;
                case 5:
                    projectController.updateTaskStatus();
                    break;
                case 6: 
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }           
        }

    }
}
