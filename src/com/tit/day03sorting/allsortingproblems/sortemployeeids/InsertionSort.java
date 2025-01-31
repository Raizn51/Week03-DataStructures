package com.tit.day03sorting.allsortingproblems.sortemployeeids;

// Creating a class InsertionSort to represent the Insertion Sort algorithm for sorting employee IDs
class InsertionSort
{
    // Method to perform Insertion Sort on the array of employee IDs
    public void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            // Move elements of ids[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }

    // Method to print the array of employee IDs
    public void printArray(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
