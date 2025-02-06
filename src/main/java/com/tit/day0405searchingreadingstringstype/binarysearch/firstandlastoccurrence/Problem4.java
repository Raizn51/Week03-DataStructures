package com.tit.day0405searchingreadingstringstype.binarysearch.firstandlastoccurrence;


/*
Binary Search Problem 4: Find the First and Last Occurrence of an Element in a Sorted Array
Problem:
Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.
Approach:
- Use binary search to find the first occurrence:
  - Perform a regular binary search, but if the target is found, continue searching on the left side (right = mid - 1) to find the first occurrence.
- Use binary search to find the last occurrence:
  - Similar to finding the first occurrence, but once the target is found, continue searching on the right side (left = mid + 1) to find the last occurrence.
- Return the indices of the first and last occurrence. If not found, return -1.
*/

// Creating a class Problem4 to demonstrate the usage of BinarySearch class
public class Problem4
{
    public static void main(String[] args) {
        // Example sorted array for testing
        int[] array = {2, 4, 10, 10, 10, 18, 20};

        // Target value to search for
        int target = 10;

        // Find and print the first and last occurrence of the target value
        int firstOccurrence = BinarySearch.findFirstOccurrence(array, target);
        int lastOccurrence = BinarySearch.findLastOccurrence(array, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}
