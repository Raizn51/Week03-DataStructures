package com.tit.day0405searchingreadingstringstype.binarysearch.rotationpoint;

// Creating a class BinarySearch to demonstrate the binary search functionality
public class BinarySearch
{
    // Method to perform binary search to find the rotation point
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left < right)
        {
            int mid = (left + right) / 2;

            // If the middle element is greater than the right element, the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // If the middle element is less than the right element, the smallest element is in the left half
            else {
                right = mid;
            }
        }
        // Return the index of the smallest element (rotation point)
        return left;
    }
}
