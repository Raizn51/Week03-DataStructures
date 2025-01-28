package com.tit.day01linkedlist.circularinkedlist.taskmanagement;

// Creating a class CircularLinkedList to represent the circular linked list structure for task scheduler
class CircularLinkedList {
    static class Task {
        int taskID;
        String taskName;
        int priority;
        String dueDate;
        Task next;

        // Constructor to initialize task node
        Task(int taskID, String taskName, int priority, String dueDate) {
            this.taskID = taskID;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    Task head = null;
    Task tail = null;
    Task current = null;

    // Method to add a task at the beginning of the list
    public void addTaskAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
        if (current == null) {
            current = head;
        }
    }

    // Method to add a task at the end of the list
    public void addTaskAtEnd(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
        if (current == null) {
            current = head;
        }
    }

    // Method to add a task at a specific position in the list
    public void addTaskAtPosition(int position, int taskID, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (position == 1) {
            addTaskAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("Position out of bounds");
        } else {
            newTask.next = temp.next;
            temp.next = newTask;
            if (newTask.next == head) {
                tail = newTask;
            }
        }
    }

    // Method to remove a task by Task ID
    public void removeTaskByID(int taskID) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Task temp = head;
        Task prev = null;
        do {
            if (temp.taskID == taskID) {
                if (prev == null) { // Removing head
                    head = head.next;
                    tail.next = head;
                    if (head == temp) { // If only one element
                        head = tail = null;
                    }
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                if (current == temp) {
                    current = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found");
    }

    // Method to view the current task and move to the next task
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available");
        } else {
            System.out.println("Current Task - ID: " + current.taskID + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        }
    }

    // Method to display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskID + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Method to search for a task by Priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskID + ", Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }
}
