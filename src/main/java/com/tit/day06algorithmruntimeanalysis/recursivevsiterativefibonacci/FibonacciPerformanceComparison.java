package com.tit.day06algorithmruntimeanalysis.recursivevsiterativefibonacci;

/*
Problem Statement: Recursive vs Iterative Fibonacci Computation
Description: Compare the performance of Recursive (O(2ⁿ)) and Iterative (O(N)) Fibonacci solutions.
1. Define methods for computing Fibonacci numbers using recursive and iterative approaches.
2. Measure the time taken to compute Fibonacci numbers for each method.
3. Compare the performance results.
Goal: Understand the performance differences between Recursive and Iterative Fibonacci solutions.
*/

// Creating a class FibonacciPerformanceComparison to compare the performance of Fibonacci methods
class FibonacciPerformanceComparison {
    public static void main(String[] args) {
        // Fibonacci numbers to test
        int[] fibonacciNumbers = {10, 30, 50};

        // Creating objects of RecursiveFibonacci and IterativeFibonacci classes
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();

        // Measure and display performance for each Fibonacci number
        for (int n : fibonacciNumbers) {
            // Recursive Fibonacci computation
            long startTime = System.nanoTime();
            recursiveFibonacci.fibonacciRecursive(n);
            long endTime = System.nanoTime();
            double recursiveTime = (endTime - startTime) / 1000000.0;

            // Iterative Fibonacci computation
            startTime = System.nanoTime();
            iterativeFibonacci.fibonacciIterative(n);
            endTime = System.nanoTime();
            double iterativeTime = (endTime - startTime) / 1000000.0;

            // Displaying results
            System.out.println("Fibonacci Number: " + n);
            System.out.println("Recursive Time: " + recursiveTime + " ms");
            System.out.println("Iterative Time: " + iterativeTime + " ms");
            System.out.println();
        }
    }
}
