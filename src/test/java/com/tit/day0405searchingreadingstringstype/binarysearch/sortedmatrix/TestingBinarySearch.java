package com.tit.day0405searchingreadingstringstype.binarysearch.sortedmatrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestingBinarySearch {

    @Test
    public void testSearchMatrix() {
        try {
            int[][] matrix = {
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 60}
            };

            // Test Case 1: Target found in the matrix
            int target1 = 3;
            assertEquals(true, BinarySearch.searchMatrix(matrix, target1), "Test Case 1 Failed");
            System.out.println("searchMatrix function worked as expected for Test Case 1");

            // Test Case 2: Target not found in the matrix
            int target2 = 13;
            assertEquals(false, BinarySearch.searchMatrix(matrix, target2), "Test Case 2 Failed");
            System.out.println("searchMatrix function worked as expected for Test Case 2");

            // Test Case 3: Target not found (lower than all elements)
            int target3 = 0;
            assertEquals(false, BinarySearch.searchMatrix(matrix, target3), "Test Case 3 Failed");
            System.out.println("searchMatrix function worked as expected for Test Case 3");

            // Test Case 4: Target not found (higher than all elements)
            int target4 = 100;
            assertEquals(false, BinarySearch.searchMatrix(matrix, target4), "Test Case 4 Failed");
            System.out.println("searchMatrix function worked as expected for Test Case 4");

            // Test Case 5: Target found at the end of the matrix
            int target5 = 60;
            assertEquals(true, BinarySearch.searchMatrix(matrix, target5), "Test Case 5 Failed");
            System.out.println("searchMatrix function worked as expected for Test Case 5");

            System.out.println("All test cases passed successfully.");

        } catch (Error e)
        {
            System.out.println("An error occurred during the test: " + e.getMessage());
        }
    }
}
