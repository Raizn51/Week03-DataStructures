package com.tit.day06algorithmruntimeanalysis.datastructuresearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

// Class to test the performance of Array, HashSet, and TreeSet for searching elements
class TestingDataStructureSearchPerformance {

    @Test
    public void testingTimeSmall() {
        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();

        // Generate small dataset
        int size = 1000;
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

        // Assert that HashSet and TreeSet are faster than Array
        assertTrue(arraySearchTime > hashSetSearchTime);
        assertTrue(arraySearchTime > treeSetSearchTime);
        System.out.println("Testing Pass for Small Data");
    }

    @Test
    public void testingTimeMedium() {
        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();

        // Generate medium dataset
        int size = 100000;
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

        // Assert that HashSet and TreeSet are faster than Array
        assertTrue(arraySearchTime > hashSetSearchTime);
        assertTrue(arraySearchTime > treeSetSearchTime);
        System.out.println("Testing Pass for Medium Data");
    }

    @Test
    public void testingTimeLarge() {
        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();

        // Generate large dataset
        int size = 1000000;
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

        // Assert that HashSet and TreeSet are faster than Array
        assertTrue(arraySearchTime > hashSetSearchTime);
        assertTrue(arraySearchTime > treeSetSearchTime);
        System.out.println("Testing Pass for Large Data");
    }

    // Helper method to generate a random array of the given size
    private int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size); // Random data
        }
        return data;
    }
}
