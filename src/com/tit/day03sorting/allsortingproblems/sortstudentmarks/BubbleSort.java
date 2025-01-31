package com.tit.day03sorting.allsortingproblems.sortstudentmarks;

// Creating a class BubbleSort to represent the Bubble Sort algorithm for sorting student marks
class BubbleSort
{
    // Method to perform Bubble Sort on the array of student marks
    public void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if needed
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) break;
        }
    }

    // Method to print the array of student marks
    public void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
