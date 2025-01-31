package com.tit.day03sorting.allsortingproblems.sortproductprices;

// Creating a class QuickSort to represent the Quick Sort algorithm for sorting product prices
class QuickSort {
    // Method to partition the array
    public int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Method to perform Quick Sort on the array
    public void sort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            sort(prices, low, pi - 1);
            sort(prices, pi + 1, high);
        }
    }

    // Method to print the array of product prices
    public void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}

