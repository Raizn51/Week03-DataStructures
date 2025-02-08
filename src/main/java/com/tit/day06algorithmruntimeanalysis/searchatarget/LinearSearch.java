package com.tit.day06algorithmruntimeanalysis.searchatarget;

// Creating a class LinearSearch to represent the linear search algorithm
class LinearSearch {
    // Method for Linear Search
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }
}
