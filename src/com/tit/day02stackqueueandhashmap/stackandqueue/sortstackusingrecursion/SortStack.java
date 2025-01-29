package com.tit.day02stackqueueandhashmap.stackandqueue.sortstackusingrecursion;

import java.util.Stack;
// Creating a class SortStack to represent a stack that can be sorted using recursion
class SortStack
{
    // Method to insert an element into a sorted stack
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // If stack is empty or the element is greater than the top of the stack, push the element
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            // Pop the top element and call sortedInsert recursively
            int temp = stack.pop();
            sortedInsert(stack, element);
            // Push the popped element back to the stack
            stack.push(temp);
        }
    }

    // Method to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // If stack is not empty, pop the top element
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            // Call sortStack recursively to sort the remaining stack
            sortStack(stack);
            // Insert the popped element back into the sorted stack
            sortedInsert(stack, temp);
        }
    }
}

