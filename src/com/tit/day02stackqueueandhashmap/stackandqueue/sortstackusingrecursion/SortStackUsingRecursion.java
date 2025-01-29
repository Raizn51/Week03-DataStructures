package com.tit.day02stackqueueandhashmap.stackandqueue.sortstackusingrecursion;

import java.util.Stack;

// Creating a class SortStack to demonstrate the stack sorting
class SortStackUsingRecursion {
    public static void main(String[] args) {
        // Create an instance of Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        // Sort the stack using SortStack
        SortStack.sortStack(stack);

        // Print the sorted stack
        System.out.println(stack);  // Output: [3, 23, 31, 34, 92, 98]
    }
}