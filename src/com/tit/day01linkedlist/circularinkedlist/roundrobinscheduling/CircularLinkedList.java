package com.tit.day01linkedlist.circularinkedlist.roundrobinscheduling;

// Creating a class CircularLinkedList to represent the circular linked list structure for process scheduling
class CircularLinkedList {
    static class Process {
        int processId;
        int burstTime;
        int priority;
        int remainingTime; // For tracking remaining burst time
        Process next;

        // Constructor to initialize process node
        Process(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.priority = priority;
            this.remainingTime = burstTime;
            this.next = null;
        }
    }

    Process head = null;
    Process tail = null;
    int timeQuantum;

    // Constructor to initialize circular linked list with a given time quantum
    public CircularLinkedList(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Method to add a process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    // Method to remove a process by Process ID
    public void removeProcessById(int processId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Process current = head;
        Process previous = tail;
        do {
            if (current.processId == processId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
        System.out.println("Process not found");
    }

    // Method to simulate round-robin scheduling
    public void simulateRoundRobin() {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        Process current = head;
        int currentTime = 0;
        int totalProcesses = getProcessCount();
        int[] waitingTimes = new int[totalProcesses];
        int[] turnAroundTimes = new int[totalProcesses];

        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                if (current.remainingTime <= timeQuantum) {
                    currentTime += current.remainingTime;
                    turnAroundTimes[current.processId - 1] = currentTime;
                    waitingTimes[current.processId - 1] = currentTime - current.burstTime;
                    current.remainingTime = 0;
                    totalProcesses--;
                } else {
                    current.remainingTime -= timeQuantum;
                    currentTime += timeQuantum;
                }
            }
            current = current.next;
        }

        displayProcessList();
        displayAverageTimes(waitingTimes, turnAroundTimes);
    }

    // Method to display the list of processes in the circular queue
    public void displayProcessList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Process current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority + ", Remaining Time: " + current.remainingTime);
            current = current.next;
        } while (current != head);
    }

    // Method to calculate and display the average waiting time and turn-around time
    public void displayAverageTimes(int[] waitingTimes, int[] turnAroundTimes) {
        double totalWaitingTime = 0;
        double totalTurnAroundTime = 0;
        for (int i = 0; i < waitingTimes.length; i++) {
            totalWaitingTime += waitingTimes[i];
            totalTurnAroundTime += turnAroundTimes[i];
        }
        System.out.println("Average Waiting Time: " + (totalWaitingTime / waitingTimes.length));
        System.out.println("Average Turn-Around Time: " + (totalTurnAroundTime / turnAroundTimes.length));
    }

    // Method to count the total number of processes in the circular list
    public int getProcessCount() {
        if (head == null) {
            return 0;
        }
        Process current = head;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
