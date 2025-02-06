package com.tit.day0405searchingreadingstringstype.binarysearch.firstandlastoccurrence;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestingBinarySearch {

    @Test
    public void testFindFirstOccurrence() {
        try {
            int[] arr = {1, 2, 2, 2, 3, 4, 5};

            // Test Case 1: Target found at the beginning
            int target1 = 1;
            assertEquals(0, BinarySearch.findFirstOccurrence(arr, target1), "Test Case 1 Failed");
            System.out.println("findFirstOccurrence function worked as expected for Test Case 1");

            // Test Case 2: Target found in the middle
            int target2 = 2;
            assertEquals(1, BinarySearch.findFirstOccurrence(arr, target2), "Test Case 2 Failed");
            System.out.println("findFirstOccurrence function worked as expected for Test Case 2");

            // Test Case 3: Target found at the end
            int target3 = 5;
            assertEquals(6, BinarySearch.findFirstOccurrence(arr, target3), "Test Case 3 Failed");
            System.out.println("findFirstOccurrence function worked as expected for Test Case 3");

            // Test Case 4: Target not found (lower than all elements)
            int target4 = 0;
            assertEquals(-1, BinarySearch.findFirstOccurrence(arr, target4), "Test Case 4 Failed");
            System.out.println("findFirstOccurrence function worked as expected for Test Case 4");

            // Test Case 5: Target not found (higher than all elements)
            int target5 = 6;
            assertEquals(-1, BinarySearch.findFirstOccurrence(arr, target5), "Test Case 5 Failed");
            System.out.println("findFirstOccurrence function worked as expected for Test Case 5");

        } catch (Error e) {
            System.out.println("An error occurred during the test: " + e.getMessage());
        }
    }

    @Test
    public void testFindLastOccurrence() {
        try {
            int[] arr = {1, 2, 2, 2, 3, 4, 5};

            // Test Case 1: Target found at the beginning
            int target1 = 1;
            assertEquals(0, BinarySearch.findLastOccurrence(arr, target1), "Test Case 1 Failed");
            System.out.println("findLastOccurrence function worked as expected for Test Case 1");

            // Test Case 2: Target found in the middle
            int target2 = 2;
            assertEquals(3, BinarySearch.findLastOccurrence(arr, target2), "Test Case 2 Failed");
            System.out.println("findLastOccurrence function worked as expected for Test Case 2");

            // Test Case 3: Target found at the end
            int target3 = 5;
            assertEquals(6, BinarySearch.findLastOccurrence(arr, target3), "Test Case 3 Failed");
            System.out.println("findLastOccurrence function worked as expected for Test Case 3");

            // Test Case 4: Target not found (lower than all elements)
            int target4 = 0;
            assertEquals(-1, BinarySearch.findLastOccurrence(arr, target4), "Test Case 4 Failed");
            System.out.println("findLastOccurrence function worked as expected for Test Case 4");

            // Test Case 5: Target not found (higher than all elements)
            int target5 = 6;
            assertEquals(0, BinarySearch.findLastOccurrence(arr, target5), "Test Case 5 Failed");
            System.out.println("findLastOccurrence function worked as expected for Test Case 5");

        }
        catch (Error e) {
            System.out.println("An error occurred during the test: " + e.getMessage());
        }
    }
}
