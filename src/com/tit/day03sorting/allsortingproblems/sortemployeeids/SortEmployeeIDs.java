package com.tit.day03sorting.allsortingproblems.sortemployeeids;

/*
2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/

// Creating a class SortEmployeeIDs to demonstrate the Insertion Sort algorithm
class SortEmployeeIDs
{
    public static void main(String[] args) {
        // Array of employee IDs
        int[] ids = {102, 54, 89, 32, 76, 100, 55,10,88,61,64,11,44,96,45};

        // Create an instance of InsertionSort
        InsertionSort sorter = new InsertionSort();

        System.out.println("Original Employee IDs:");
        sorter.printArray(ids);

        // Perform Insertion Sort
        sorter.insertionSort(ids);

        System.out.println("Sorted Employee IDs:");
        sorter.printArray(ids);
    }
}
