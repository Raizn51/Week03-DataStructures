package com.tit.day06algorithmruntimeanalysis.searchatarget;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Arrays;

// Class to test the performance of Linear Search and Binary Search
class TestingLinearAndBinarySearch
{

    @Test

    public void testingTimeSmall(){
        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        // Generate small dataset
        int[] data = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Select random target value
        int target = rand.nextInt(10000);

        // Measure time for Linear Search
        long startTime = System.nanoTime();
        linear.linearSearch(data, target);
        long endTime = System.nanoTime();
        double linearTime = (endTime - startTime) / 1000000.0;

        // Sort data for Binary Search
        Arrays.sort(data);

        // Measure time for Binary Search
        startTime = System.nanoTime();
        binary.binarySearch(data, target);
        endTime = System.nanoTime();
        double binaryTime = (endTime - startTime) / 1000000.0;

        // Assert that binary search is faster
        boolean check = linearTime > binaryTime;
        assertEquals(true, check);
        System.out.println("Testing Pass for Small Data");
    }

    @Test
    public void testingTimeMedium(){
        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        // Generate medium dataset
        int[] data = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Select random target value
        int target = rand.nextInt(10000);

        // Measure time for Linear Search
        long startTime = System.nanoTime();
        linear.linearSearch(data, target);
        long endTime = System.nanoTime();
        double linearTime = (endTime - startTime) / 1000000.0;

        // Sort data for Binary Search
        Arrays.sort(data);

        // Measure time for Binary Search
        startTime = System.nanoTime();
        binary.binarySearch(data, target);
        endTime = System.nanoTime();
        double binaryTime = (endTime - startTime) / 1000000.0;

        // Assert that binary search is faster
        boolean check = linearTime > binaryTime;
        assertEquals(true, check);
        System.out.println("Testing Pass for Medium Data");
    }

    @Test
    public void testingTimeLarge(){
        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        // Generate large dataset
        int[] data = new int[1000000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Select random target value
        int target = rand.nextInt(10000);

        // Measure time for Linear Search
        long startTime = System.nanoTime();
        linear.linearSearch(data, target);
        long endTime = System.nanoTime();
        double linearTime = (endTime - startTime) / 1000000.0;

        // Sort data for Binary Search
        Arrays.sort(data);

        // Measure time for Binary Search
        startTime = System.nanoTime();
        binary.binarySearch(data, target);
        endTime = System.nanoTime();
        double binaryTime = (endTime - startTime) / 1000000.0;

        // Assert that binary search is faster
        boolean check = linearTime > binaryTime;
        assertEquals(true, check);
        System.out.println("Testing Pass for Large Data");
    }
}
