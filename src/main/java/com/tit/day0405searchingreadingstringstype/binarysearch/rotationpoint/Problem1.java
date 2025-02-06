package com.tit.day0405searchingreadingstringstype.binarysearch.rotationpoint;

/*
Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
Problem:
You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
Approach:
- Initialize left as 0 and right as n - 1.
- Perform a binary search:
  - Find the middle element mid = (left + right) / 2.
  - If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
  - If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
- Continue until left equals right, and then return arr[left] (the rotation point).
*/


// Creating a class Problem1 to demonstrate the usage of BinarySearch class
public class Problem1
{
    public static void main(String[] args) {
        // Example rotated sorted array for testing
        int[] array = {6, 7, 9,13, 15, 19, 2, 3,4};

        // Find and print the index of the rotation point
        int rotationPointIndex = BinarySearch.findRotationPoint(array);
        System.out.println("The rotation point is at index: " + rotationPointIndex);
    }
}
