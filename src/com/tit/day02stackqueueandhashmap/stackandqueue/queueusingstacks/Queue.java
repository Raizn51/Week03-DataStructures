package com.tit.day02stackqueueandhashmap.stackandqueue.queueusingstacks;

import java.util.Stack;

// Creating a class Queue to represent a queue implemented using two stacks
class Queue
{
    // Stack to handle enqueue operations
    private Stack<Integer> enqueueStack;
    // Stack to handle dequeue operations
    private Stack<Integer> dequeueStack;

    // Constructor to initialize the stacks
    public Queue() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        enqueueStack.push(value);
    }

    // Method to remove and return the front element from the queue
    public Integer dequeue() {
        // If dequeue stack is empty, transfer elements from enqueue stack
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        // Return the top element from the dequeue stack
        return dequeueStack.isEmpty() ? null : dequeueStack.pop();
    }

    // Method to get the front element from the queue without removing it
    public Integer peek() {
        // If dequeue stack is empty, transfer elements from enqueue stack
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        // Return the top element from the dequeue stack
        return dequeueStack.isEmpty() ? null : dequeueStack.peek();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
}
