package com.tit.day02stackqueueandhashmap.stackandqueue.stockspan;

/**
 * Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
 *
 * Approach:
 * 1. Use a stack to keep track of indices of prices in descending order.
 * 2. For each price, pop the stack until the current price is less than the price at the stack's top index.
 * 3. Calculate the span using the stack's top index.
 */

// Creating a class StockSpan to calculate the stock span
class StockSpan
{
    // Main method to demonstrate the stock span calculation
    public static void main(String[] args) {
        // Example stock prices
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        // Calculate the span for the stock prices
        int[] span = Span.calculateSpan(prices);

        // Print the calculated span
        for (int s : span) {
            System.out.print(s + " ");  // Output: [1, 1, 1, 2, 1, 4, 6]
        }
    }
}
