package com.tit.day0405searchingreadingstringstype.binarysearch.peakelement;

// Creating a class BinarySearch to demonstrate the binary search functionality
public class BinarySearch
{
    // Method to perform binary search to find a peak element
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left < right) {
            int mid = (left + right) / 2;

            // If mid element is greater than its neighbors, it is a peak element
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }

            // If mid element is less than the previous element, search the left half
            if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // If mid element is less than the next element, search the right half
            else {
                left = mid + 1;
            }
        }

        // Return the index of the peak element
        return arr[left];
    }
}
