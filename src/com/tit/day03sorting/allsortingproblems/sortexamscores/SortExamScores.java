package com.tit.day03sorting.allsortingproblems.sortexamscores;

/*
5. Selection Sort - Sort Exam Scores
Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

// Creating a class SortExamScores to demonstrate the Selection Sort algorithm
class SortExamScores
{
    public static void main(String[] args) {
        // Array of exam scores
        int[] scores = {85, 96, 78, 65, 92, 88, 33,99,88,45,39,41,42,65,73};

        // Create an instance of SelectionSort
        SelectionSort sorter = new SelectionSort();

        System.out.println("Original Exam Scores:");
        sorter.printArray(scores);

        // Perform Selection Sort
        sorter.selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        sorter.printArray(scores);
    }
}
