package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge2;


/*
Challenge Problem: Linear Search for the First Missing Positive Integer and Binary Search for the Target Index
Problem:
You are given a list of integers. Write a program that uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.
Approach:
Linear Search for the first missing positive integer:
- Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
- Traverse the array again to find the first positive integer that is not marked.
Binary Search for the target index:
- After sorting the array, perform binary search to find the index of the given target number.
- Return the index if found, otherwise return -1.
*/

import java.util.Arrays;

// Creating a class ChallengeProblem1 to demonstrate the usage of Challenge class
public class ChallengeProblem2
{
    public static void main(String[] args) {
        // Example list of integers for testing
        int[] array = {3, 4, -1, 1, 5, 7, 10, 8, 6, 15, 2, 9, 11, 12, 0, 14, 13, 18, 17, 19, 16};

        // Find and print the first missing positive integer
        int firstMissingPositive = LinearAndBinarySearch.findFirstMissingPositive(array);
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Sort the array for binary search
        Arrays.sort(array);

        // Target value to search for
        int target = 4;

        // Find and print the index of the target value using binary search
        int targetIndex = LinearAndBinarySearch.binarySearch(array, target);
        System.out.println("Index of the target value " + target + ": " + targetIndex);
    }
}
