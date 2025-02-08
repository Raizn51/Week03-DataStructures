package com.tit.day06algorithmruntimeanalysis.datastructuresearch;

/*
Problem Statement: Comparing Different Data Structures for Searching
Description: Compare the performance of Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
1. Define methods for searching elements in Array, HashSet, and TreeSet.
2. Measure the time taken to search for elements in each data structure.
3. Compare the performance results.
Goal: Understand the performance differences between Array, HashSet, and TreeSet for searching elements.
*/

import java.util.*;

// Creating a class DataStructureSearchComparison to compare the performance of search methods
class DataStructureSearchComparison {
    public static void main(String[] args) {
        // Dataset sizes to test
        int[] sizes = {1000, 100000, 1000000};

        // Creating objects of ArraySearch, HashSetSearch, and TreeSetSearch classes
        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();

        // Measure and display performance for each dataset size
        for (int size : sizes) {
            // Generate dataset
            int[] data = generateRandomArray(size);
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int num : data) {
                hashSet.add(num);
                treeSet.add(num);
            }

            // Select random target value
            Random rand = new Random();
            int target = rand.nextInt(size);

            // Measure time for Array search
            long startTime = System.nanoTime();
            arraySearch.searchInArray(data, target);
            long endTime = System.nanoTime();
            double arraySearchTime = (endTime - startTime) / 1000000.0;

            // Measure time for HashSet search
            startTime = System.nanoTime();
            hashSetSearch.searchInHashSet(hashSet, target);
            endTime = System.nanoTime();
            double hashSetSearchTime = (endTime - startTime) / 1000000.0;

            // Measure time for TreeSet search
            startTime = System.nanoTime();
            treeSetSearch.searchInTreeSet(treeSet, target);
            endTime = System.nanoTime();
            double treeSetSearchTime = (endTime - startTime) / 1000000.0;

            // Displaying results
            System.out.println("Dataset Size: " + size);
            System.out.println("Target: "+target);
            System.out.println("Array Search Time: " + arraySearchTime + " ms");
            System.out.println("HashSet Search Time: " + hashSetSearchTime + " ms");
            System.out.println("TreeSet Search Time: " + treeSetSearchTime + " ms");
            System.out.println();
        }
    }

    // Helper method to generate a random array of the given size
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size); // Random data
        }
        return data;
    }
}
