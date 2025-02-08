package com.tit.day06algorithmruntimeanalysis.sortinglargedataset;

// Creating a class QuickSort to represent the quick sort algorithm
class QuickSort {
    // Method for Quick Sort
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Helper method to perform Quick Sort using a recursive approach
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Helper method to partition the array around a pivot element
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
