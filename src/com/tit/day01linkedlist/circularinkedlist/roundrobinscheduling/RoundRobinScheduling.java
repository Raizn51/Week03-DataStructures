package com.tit.day01linkedlist.circularinkedlist.roundrobinscheduling;
/*
6. Circular Linked List: Round Robin Scheduling Algorithm
Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
Add a new process at the end of the circular list.
Remove a process by Process ID after its execution.
Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
Display the list of processes in the circular queue after each round.
Calculate and display the average waiting time and turn-around time for all processes.
Hint:
Use a circular linked list to represent a queue of processes.
Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
Maintain the current node as the process being executed, and after each round, update the list to simulate execution.
*/

// Creating a class RoundRobinScheduling to demonstrate the functionalities of CircularLinkedList
class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList(4); // Setting time quantum to 4

        // Adding some processes to the circular list
        list.addProcess(1, 10, 1);
        list.addProcess(2, 5, 2);
        list.addProcess(3, 8, 1);
        list.addProcess(4, 6, 3);

        // Simulating round-robin scheduling
        System.out.println("Simulating Round Robin Scheduling:");
        list.simulateRoundRobin();

        // Removing a process by Process ID after execution
        System.out.println("\nRemoving Process with ID 2:");
        list.removeProcessById(2);
        list.displayProcessList();
    }
}
