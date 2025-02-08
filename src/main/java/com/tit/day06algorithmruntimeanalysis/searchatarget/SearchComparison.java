package com.tit.day06algorithmruntimeanalysis.searchatarget;

/*
Problem Statement: Search a Target in a Large Dataset
Description: Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes:
1. Define methods for Linear Search and Binary Search.
2. Generate random datasets of varying sizes.
3. Measure and compare the search times for each algorithm.
Use encapsulation to secure data details and ensure efficient searching.
Goal: Understand the performance differences between Linear Search and Binary Search on large datasets.
*/

import java.util.Arrays;
import java.util.Random;

// Creating a class SearchComparison to demonstrate the functionalities of search algorithms
class SearchComparison
{
    public static void main(String[] args) {
        // Dataset sizes to test
        int[] datasetSizes = {1000, 10000, 1000000};

        // Creating objects of LinearSearchAlgorithm and BinarySearchAlgorithm classes
        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        // Generate random data for each dataset size and measure search times
        for (int size : datasetSizes)
        {
            int[] data = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(10000); // Random data
            }

            // Select a random target value from the dataset
            int target = rand.nextInt(10000);

            // Perform Linear Search
            long startTime = System.nanoTime();
            linear.linearSearch(data, target);
            long endTime = System.nanoTime();
            long linearSearchTime = endTime - startTime;

            // Sort data for Binary Search
            Arrays.sort(data);

            // Perform Binary Search
            startTime = System.nanoTime();
            binary.binarySearch(data, target);
            endTime = System.nanoTime();
            long binarySearchTime = endTime - startTime;

            // Displaying results
            System.out.println("Dataset Size: " + size);
            System.out.println("Target Value: " + target);
            System.out.println("Linear Search Time: " + linearSearchTime / 1000000.0 + " ms");
            System.out.println("Binary Search Time: " + binarySearchTime / 1000000.0 + " ms");
            System.out.println();
        }
    }
}
