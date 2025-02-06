package com.tit.day0405searchingreadingstringstype.binarysearch.sortedmatrix;

// Creating a class BinarySearch to demonstrate the binary search functionality
public class BinarySearch
{
    // Method to perform binary search to find a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        // Perform binary search
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            // Compare midValue with the target
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the element is not found, return false
        return false;
    }
}
