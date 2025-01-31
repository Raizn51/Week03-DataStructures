package com.tit.day03sorting.allsortingproblems.sortexamscores;

// Creating a class SelectionSort to represent the Selection Sort algorithm for sorting exam scores
class SelectionSort
{
    // Method to perform Selection Sort on the array of exam scores
    public void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Method to print the array of exam scores
    public void printArray(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
