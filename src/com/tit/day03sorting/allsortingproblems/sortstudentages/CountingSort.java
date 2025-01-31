package com.tit.day03sorting.allsortingproblems.sortstudentages;

// Creating a class CountingSort to represent the Counting Sort algorithm for sorting student ages
class CountingSort
{
    // Method to perform Counting Sort on the array of student ages
    public void countingSort(int[] ages)
    {
        int n = ages.length;

        // The range of ages is 10 to 18
        int k = 18 - 10 + 1;
        int[] count = new int[k];
        int[] output = new int[n];

        // Initialize count array with all zeros
        for (int i = 0; i < k; i++) {
            count[i] = 0;
        }

        // Store the count of each age
        for (int i = 0; i < n; i++) {
            count[ages[i] - 10]++;
        }

        // Change count[i] to contain the cumulative count
        for (int i = 1; i < k; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - 10] - 1] = ages[i];
            count[ages[i] - 10]--;
        }

        // Copy the sorted elements into the original array
        System.arraycopy(output, 0, ages, 0, n);
    }

    // Method to print the array of student ages
    public void printArray(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}
