package com.tit.day03sorting.allsortingproblems.sortproductprices;

/*
4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/

// Creating a class SortProductPrices to demonstrate the Quick Sort algorithm
class SortProductPrices
{
    public static void main(String[] args) {
        // Array of product prices
        int[] prices = {90, 70, 50, 80, 60, 666,26,34,94,59,64,88,56,85, 40, 30};

        // Create an instance of QuickSort
        QuickSort qs = new QuickSort();

        System.out.println("Original Product Prices:");
        qs.printArray(prices);

        // Perform Quick Sort
        qs.sort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        qs.printArray(prices);
    }
}
