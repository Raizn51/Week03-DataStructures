package com.tit.day06algorithmruntimeanalysis.recursivevsiterativefibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Class to test the performance of Recursive and Iterative Fibonacci methods
class TestingFibonacciPerformance {

    @Test
    public void testingTimeSmall() {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();

        // Small Fibonacci number
        int n = 10;

        // Measure time for Recursive Fibonacci computation
        long startTime = System.nanoTime();
        recursiveFibonacci.fibonacciRecursive(n);
        long endTime = System.nanoTime();
        double recursiveTime = (endTime - startTime) / 1000000.0;

        // Measure time for Iterative Fibonacci computation
        startTime = System.nanoTime();
        iterativeFibonacci.fibonacciIterative(n);
        endTime = System.nanoTime();
        double iterativeTime = (endTime - startTime) / 1000000.0;

        // Assert that Iterative is faster than Recursive
        assertTrue(recursiveTime > iterativeTime);
        System.out.println("Testing Pass for Small Fibonacci Number");
    }

    @Test
    public void testingTimeMedium() {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();

        // Medium Fibonacci number
        int n = 30;

        // Measure time for Recursive Fibonacci computation
        long startTime = System.nanoTime();
        recursiveFibonacci.fibonacciRecursive(n);
        long endTime = System.nanoTime();
        double recursiveTime = (endTime - startTime) / 1000000.0;

        // Measure time for Iterative Fibonacci computation
        startTime = System.nanoTime();
        iterativeFibonacci.fibonacciIterative(n);
        endTime = System.nanoTime();
        double iterativeTime = (endTime - startTime) / 1000000.0;

        // Assert that Iterative is faster than Recursive
        assertTrue(recursiveTime > iterativeTime);
        System.out.println("Testing Pass for Medium Fibonacci Number");
    }

    @Test
    public void testingTimeLarge() {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();

        // Large Fibonacci number
        int n = 50;

        // Measure time for Recursive Fibonacci computation
        long startTime = System.nanoTime();
        recursiveFibonacci.fibonacciRecursive(n);
        long endTime = System.nanoTime();
        double recursiveTime = (endTime - startTime) / 1000000.0;

        // Measure time for Iterative Fibonacci computation
        startTime = System.nanoTime();
        iterativeFibonacci.fibonacciIterative(n);
        endTime = System.nanoTime();
        double iterativeTime = (endTime - startTime) / 1000000.0;

        // Assert that Iterative is faster than Recursive
        assertTrue(recursiveTime > iterativeTime);
        System.out.println("Testing Pass for Large Fibonacci Number");
    }
}
