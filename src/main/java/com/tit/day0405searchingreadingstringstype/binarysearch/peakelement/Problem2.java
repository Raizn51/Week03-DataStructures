package com.tit.day0405searchingreadingstringstype.binarysearch.peakelement;

/*
Binary Search Problem 2: Find the Peak Element in an Array
Problem:
A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.
Approach:
- Initialize left as 0 and right as n - 1.
- Perform a binary search:
  - Find the middle element mid = (left + right) / 2.
  - If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
  - If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
  - If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
- Continue until a peak element is found.
*/

// Creating a class Problem2 to demonstrate the usage of BinarySearch class
public class Problem2
{
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 0, 10, 8, 6,21, 7, 13, 12, 9, 5, 11};

        // Find and print the index of the peak element
        int peakElement = BinarySearch.findPeakElement(array);
        System.out.println("The peak element is : " + peakElement);
    }
}
