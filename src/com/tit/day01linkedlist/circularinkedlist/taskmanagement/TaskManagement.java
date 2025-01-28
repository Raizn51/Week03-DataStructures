package com.tit.day01linkedlist.circularinkedlist.taskmanagement;

/*
Problem Statement: Task Scheduler using Circular Linked List
Description: Implement a task scheduler using a circular linked list. Each node will represent a task and
contain Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
1. Add a task at the beginning, end, or at a specific position.
2. Remove a task by Task ID.
3. View the current task and move to the next task.
4. Display all tasks starting from the head node.
5. Search for a task by Priority.
*/

// Creating a class TaskManagement to demonstrate the functionalities of CircularLinkedList
class TaskManagement {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adding some tasks using different methods
        list.addTaskAtEnd(1, "Complete Project", 2, "2025-02-10");
        list.addTaskAtBeginning(2, "Prepare Presentation", 1, "2025-02-01");
        list.addTaskAtEnd(3, "Attend Meeting", 3, "2025-02-05");
        list.addTaskAtPosition(2, 4, "Submit Report", 1, "2025-01-31");
        list.addTaskAtEnd(5, "Plan Workshop", 2, "2025-02-15");
        list.addTaskAtBeginning(6, "Review Budget", 3, "2025-02-08");
        list.addTaskAtPosition(3, 7, "Analyze Data", 2, "2025-02-02");

        // Displaying all task records
        System.out.println("All task records:");
        list.displayAllTasks();

        // Viewing current task and moving to the next task
        System.out.println("\nViewing current task:");
        list.viewCurrentTask();

        // Searching for tasks by Priority
        System.out.println("\nSearching for tasks with priority 2:");
        list.searchTaskByPriority(2);

        // Removing a task by ID
        System.out.println("\nRemoving task with ID 4:");
        list.removeTaskByID(4);
        list.displayAllTasks();
    }
}
