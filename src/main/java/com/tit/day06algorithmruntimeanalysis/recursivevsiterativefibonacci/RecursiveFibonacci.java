package com.tit.day06algorithmruntimeanalysis.recursivevsiterativefibonacci;

// Creating a class RecursiveFibonacci to represent the recursive Fibonacci computation
class RecursiveFibonacci {
    // Method for computing Fibonacci numbers recursively
    public int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
