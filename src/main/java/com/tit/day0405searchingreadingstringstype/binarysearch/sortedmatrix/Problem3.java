package com.tit.day0405searchingreadingstringstype.binarysearch.sortedmatrix;


/*
Binary Search Problem 3: Search for a Target Value in a 2D Sorted Matrix
Problem:
You are given a 2D matrix where each row is sorted in ascending order, and the first element of each row is greater than the last element of the previous row. Write a program that performs Binary Search to find a target value in the matrix. If the value is found, return true. Otherwise, return false.
Approach:
- Treat the matrix as a 1D array (flattened version).
- Initialize left as 0 and right as rows * columns - 1.
- Perform binary search:
  - Find the middle element index mid = (left + right) / 2.
  - Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
  - Compare the middle element with the target:
    - If it matches, return true.
    - If the target is smaller, search the left half by updating right = mid - 1.
    - If the target is larger, search the right half by updating left = mid + 1.
- If the element is not found, return false.
*/

// Creating a class Problem3 to demonstrate the usage of BinarySearch class
public class Problem3
{
    public static void main(String[] args) {
        // Example 2D matrix for testing
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Target value to search for
        int target = 3;

        // Find and print whether the target value is found in the matrix
        boolean isFound = BinarySearch.searchMatrix(matrix, target);
        System.out.println("Is the target value " + target + " found in the matrix? " + isFound);
    }
}
