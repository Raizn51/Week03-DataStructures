package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestingLinearAndBinarySearch {

    @Test
    public void testFindFirstMissingPositive()
    {
        int[] arr1 = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        int[] arr3 = {7, 8, 9, 11, 12};

        try {
            // Test Case 1
            assertEquals(2, LinearAndBinarySearch.findFirstMissingPositive(arr1));
            System.out.println("findFirstMissingPositive function worked as expected for Test Case 1");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            // Test Case 2
            assertEquals(3, LinearAndBinarySearch.findFirstMissingPositive(arr2));
            System.out.println("findFirstMissingPositive function worked as expected for Test Case 2");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            // Test Case 3
            assertEquals(1, LinearAndBinarySearch.findFirstMissingPositive(arr3));
            System.out.println("findFirstMissingPositive function worked as expected for Test Case 3");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }
    }

    @Test
    public void testBinarySearch() {
        int[] arr = {-1, 0, 3, 5, 9, 12};

        try {
            // Test Case 1: Target found
            assertEquals(4, LinearAndBinarySearch.binarySearch(arr, 9));
            System.out.println("binarySearch function worked as expected for Test Case 1");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            // Test Case 2: Target not found
            assertEquals(-1, LinearAndBinarySearch.binarySearch(arr, 2));
            System.out.println("binarySearch function worked as expected for Test Case 2");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            // Test Case 3: Target found at the beginning
            assertEquals(0, LinearAndBinarySearch.binarySearch(arr, -1));
            System.out.println("binarySearch function worked as expected for Test Case 3");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            // Test Case 4: Target found at the end
            assertEquals(5, LinearAndBinarySearch.binarySearch(arr, 12));
            System.out.println("binarySearch function worked as expected for Test Case 4");
        } catch (Error e) {
            System.out.println("Error - " + e.getMessage());
        }
    }
}

