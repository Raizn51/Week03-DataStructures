package com.tit.day02stackqueueandhashmap.stackandqueue.stockspan;

import java.util.Stack;

class Span
{
    // Method to calculate the span for stock prices
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initial span value for the first price
        span[0] = 1;
        // Push the index of the first price onto the stack
        stack.push(0);

        // Loop through the prices starting from the second price
        for (int i = 1; i < n; i++) {
            // Pop the stack while the current price is greater than the price at the stack's top index
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            // Calculate the span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }
}