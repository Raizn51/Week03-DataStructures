package com.tit.day03sorting.allsortingproblems.sortbookprices;

// Creating a class MergeSort to represent the Merge Sort algorithm for sorting book prices
class MergeSort
{
    // Method to merge two halves of the array
    public void merge(int[] prices, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(prices, l, L, 0, n1);
        System.arraycopy(prices, m + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    // Method to perform Merge Sort on the array
    public void sort(int[] prices, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(prices, l, m);
            sort(prices, m + 1, r);
            merge(prices, l, m, r);
        }
    }

    // Method to print the array of book prices
    public void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
