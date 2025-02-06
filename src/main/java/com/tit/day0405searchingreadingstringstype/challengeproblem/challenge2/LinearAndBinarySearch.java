package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge2;

import java.util.HashSet;

// Creating a class LinearAndBinarySearch to demonstrate the linear and binary search functionality
public class LinearAndBinarySearch
{
    // Method to find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        int i = 1;
        while (set.contains(i)) {
            i++;
        }
        return i;
    }

    // Method to perform binary search to find the index of a target value
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
