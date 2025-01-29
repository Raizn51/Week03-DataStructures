package com.tit.day02stackqueueandhashmap.stackandqueue.queueusingstacks;

/**
 * Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
 *
 * Approach:
 * 1. Use one stack for enqueue operations and another stack for dequeue operations.
 * 2. To enqueue an element, simply push it onto the enqueue stack.
 * 3. To dequeue an element, if the dequeue stack is empty, transfer all elements from the enqueue stack to the dequeue stack (inverting their order in the process) and then pop from the dequeue stack. If the dequeue stack is not empty, simply pop from it.
 */


// Creating a class QueueUsingStacks to demonstrate the queue operations
class QueueUsingStacks
{
    public static void main(String[] args) {
        // Create an instance of Queue
        Queue queue = new Queue();

        // Enqueue 5 elements into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Dequeue 3 elements from the queue
        System.out.println("Dequeue: " + queue.dequeue());  // Output: 1
        System.out.println("Dequeue: " + queue.dequeue());  // Output: 2
        System.out.println("Dequeue: " + queue.dequeue());  // Output: 3

        // Peek the front element of the queue
        System.out.println("Peek: " + queue.peek());  // Output: 4
    }
}
