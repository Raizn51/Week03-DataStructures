package com.tit.day03sorting.allsortingproblems.sortstudentmarks;

/*
1. Bubble Sort - Sort Student Marks
Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
*/

// Creating a class SortStudentMarks to demonstrate the Bubble Sort algorithm
class SortStudentMarks
{
    public static void main(String[] args) {
        // Array of student marks
        int[] marks = {87, 76, 90, 65, 78, 92, 80, 64, 33, 46, 88 , 44};

        // Create an instance of BubbleSort
        BubbleSort sorter = new BubbleSort();

        System.out.println("Original Marks:");
        sorter.printArray(marks);

        // Perform Bubble Sort
        sorter.bubbleSort(marks);

        System.out.println("Sorted Marks:");
        sorter.printArray(marks);
    }
}
