package com.tit.day03sorting.allsortingproblems.sortstudentages;

/*
7. Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/


// Creating a class SortStudentAges to demonstrate the Counting Sort algorithm
class SortStudentAges
{
    public static void main(String[] args) {
        // Array of student ages
        int[] ages = {12, 14, 13, 10, 15, 16, 17, 18, 11};

        // Create an instance of CountingSort
        CountingSort sorter = new CountingSort();

        System.out.println("Original Student Ages:");
        sorter.printArray(ages);

        // Perform Counting Sort
        sorter.countingSort(ages);

        System.out.println("Sorted Student Ages:");
        sorter.printArray(ages);
    }
}
