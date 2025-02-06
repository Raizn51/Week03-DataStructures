package com.tit.day0405searchingreadingstringstype.linearsearch.firstnegativenumber;


// Creating a class LinearSearch to demonstrate the linear search functionality
public class LinearSearch
{
    // Method to perform linear search to find the first negative number
    public static int findFirstNegative(int[] arr) {
        // Iterate through the array from the start
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                // If a negative number is found, return its index
                return i;
            }
        }
        // If no negative number is found, return -1
        return -1;
    }
}
