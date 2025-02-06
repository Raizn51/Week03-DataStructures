package com.tit.day0405searchingreadingstringstype.binarysearch.peakelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingBinarySearch
{

        @Test
        public void testFindPeakElementMiddlePeak()
        {
            // Test case 1: Array with a peak element in the middle
            int[] arr1 = {1, 3, 20, 4, 1, 0};
            assertEquals(20, BinarySearch.findPeakElement(arr1));
            System.out.println("findPeakElement function working like expected for test case 1");

            // Test case 2: Array with a peak element at the end
            int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
            assertEquals(20, BinarySearch.findPeakElement(arr2));
            System.out.println("findPeakElement function working like expected for test case 2");

            // Test case 3: Array with a peak element at the beginning
            int[] arr3 = {80, 70, 60, 50, 40, 30, 20, 10};
            assertEquals(80, BinarySearch.findPeakElement(arr3));
            System.out.println("findPeakElement function working like expected for test case 3");
        }

}

