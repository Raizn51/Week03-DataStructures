package com.tit.day03sorting.allsortingproblems.sortjobapplicants;

/*
6. Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Re-heapify the remaining elements and repeat until sorted.
*/


// Creating a class SortJobApplicants to demonstrate the Heap Sort algorithm
class SortJobApplicants
{
    public static void main(String[] args)
    {
        // Array of salary demands
        int[] salaries = {50000,44666,64469,46413,446485,44977,13553,36464, 70000, 40000, 60000, 80000, 30000};

        // Create an instance of HeapSort
        HeapSort sorter = new HeapSort();

        System.out.println("Original Salary Demands:");
        sorter.printArray(salaries);

        // Perform Heap Sort
        sorter.sort(salaries);

        System.out.println("Sorted Salary Demands:");
        sorter.printArray(salaries);
    }
}