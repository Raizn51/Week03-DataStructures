package com.tit.day06algorithmruntimeanalysis.sortinglargedataset;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Arrays;

// Class to test the performance of Bubble Sort, Merge Sort, and Quick Sort
class SortingPerformanceTest {

    @Test
    public void testingTimeSmall() {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        // Generate small dataset
        int[] data = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Measure time for Bubble Sort
        int[] dataCopy = Arrays.copyOf(data, data.length);
        long startTime = System.nanoTime();
        bubble.bubbleSort(dataCopy);
        long endTime = System.nanoTime();
        double bubbleSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Bubble Sort did not sort the array correctly");

        // Measure time for Merge Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        merge.mergeSort(dataCopy);
        endTime = System.nanoTime();
        double mergeSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Merge Sort did not sort the array correctly");

        // Measure time for Quick Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        quick.quickSort(dataCopy);
        endTime = System.nanoTime();
        double quickSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Quick Sort did not sort the array correctly");

        // Displaying results
        System.out.println("Testing Small Dataset:");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
        System.out.println("Quick Sort Time: " + quickSortTime + " ms");

        // Ensure Quick Sort is faster than Bubble Sort
        assertTrue(quickSortTime < bubbleSortTime, "Quick Sort should be faster than Bubble Sort");
        System.out.println("Testing Pass for Small Data");
    }

    @Test
    public void testingTimeMedium() {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        // Generate medium dataset
        int[] data = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Measure time for Bubble Sort
        int[] dataCopy = Arrays.copyOf(data, data.length);
        long startTime = System.nanoTime();
        bubble.bubbleSort(dataCopy);
        long endTime = System.nanoTime();
        double bubbleSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Bubble Sort did not sort the array correctly");

        // Measure time for Merge Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        merge.mergeSort(dataCopy);
        endTime = System.nanoTime();
        double mergeSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Merge Sort did not sort the array correctly");

        // Measure time for Quick Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        quick.quickSort(dataCopy);
        endTime = System.nanoTime();
        double quickSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Quick Sort did not sort the array correctly");

        // Displaying results
        System.out.println("Testing Medium Dataset:");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
        System.out.println("Quick Sort Time: " + quickSortTime + " ms");

        // Ensure Quick Sort is faster than Bubble Sort
        assertTrue(quickSortTime < bubbleSortTime, "Quick Sort should be faster than Bubble Sort");
        System.out.println("Testing Pass for Medium Data");
    }

    @Test
    public void testingTimeLarge() {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        // Generate large dataset
        int[] data = new int[1000000];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        // Measure time for Bubble Sort
        int[] dataCopy = Arrays.copyOf(data, data.length);
        long startTime = System.nanoTime();
        bubble.bubbleSort(dataCopy);
        long endTime = System.nanoTime();
        double bubbleSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Bubble Sort did not sort the array correctly");

        // Measure time for Merge Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        merge.mergeSort(dataCopy);
        endTime = System.nanoTime();
        double mergeSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Merge Sort did not sort the array correctly");

        // Measure time for Quick Sort
        dataCopy = Arrays.copyOf(data, data.length);
        startTime = System.nanoTime();
        quick.quickSort(dataCopy);
        endTime = System.nanoTime();
        double quickSortTime = (endTime - startTime) / 1000000.0;

        // Verify the array is sorted
        assertTrue(isSorted(dataCopy), "Quick Sort did not sort the array correctly");

        // Displaying results
        System.out.println("Testing Large Dataset:");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
        System.out.println("Quick Sort Time: " + quickSortTime + " ms");

        // Ensure Quick Sort is faster than Bubble Sort
        assertTrue(quickSortTime < bubbleSortTime, "Quick Sort should be faster than Bubble Sort");
        System.out.println("Testing Pass for Large Data");
    }

    // Helper method to check if the array is sorted
    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}


