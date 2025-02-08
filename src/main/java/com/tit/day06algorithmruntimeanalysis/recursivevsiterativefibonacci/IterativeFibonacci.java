package com.tit.day06algorithmruntimeanalysis.recursivevsiterativefibonacci;

// Creating a class IterativeFibonacci to represent the iterative Fibonacci computation
class IterativeFibonacci {
    // Method for computing Fibonacci numbers iteratively
    public int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
