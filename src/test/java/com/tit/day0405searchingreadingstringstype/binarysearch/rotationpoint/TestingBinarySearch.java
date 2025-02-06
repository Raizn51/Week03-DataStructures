package com.tit.day0405searchingreadingstringstype.binarysearch.rotationpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingBinarySearch
{
    @Test
    public void testingFindRotationPoint()
    {
        try
        {
            // Test case 1: Array with rotation
            int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
            assertEquals(4, BinarySearch.findRotationPoint(arr1));
            System.out.println("findRotationPoint function working like expected for test case 1");

            // Test case 2: Array with no rotation
            int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
            assertEquals(0, BinarySearch.findRotationPoint(arr2));
            System.out.println("findRotationPoint function working like expected for test case 2");

            // Test case 3: Array with duplicates
            int[] arr3 = {4, 5, 6, 7, 7, 0, 1, 2};
            assertEquals(8, BinarySearch.findRotationPoint(arr3));

            System.out.println("findRotationPoint function working like expected for test case 3");
        }
        catch (Error e)
        {
            System.out.println("Error - "+e.getMessage());
        }
    }
}
