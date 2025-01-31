package com.tit.day03sorting.allsortingproblems.sortjobapplicants;

// Creating a class HeapSort to represent the Heap Sort algorithm for sorting salary demands
class HeapSort
{
    // Method to heapify a subtree rooted at node i
    public void heapify(int[] salaries, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;
            heapify(salaries, n, largest);
        }
    }

    // Method to perform Heap Sort on the array of salary demands
    public void sort(int[] salaries) {
        int n = salaries.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    // Method to print the array of salary demands
    public void printArray(int[] salaries) {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}
