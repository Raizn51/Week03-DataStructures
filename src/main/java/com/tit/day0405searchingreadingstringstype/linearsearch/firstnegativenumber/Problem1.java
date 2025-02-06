package com.tit.day0405searchingreadingstringstype.linearsearch.firstnegativenumber;

/*
Linear Search Problem 1: Search for the First Negative Number
Problem:
You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array. If a negative number is found, return its index. If no negative number is found, return -1.
Approach:
- Iterate through the array from the start.
- Check if the current element is negative.
- If a negative number is found, return its index.
- If the loop completes without finding a negative number, return -1.
*/

// Creating a class Problem1 to demonstrate the usage of LinearSearch class
public class Problem1
{
    public static void main(String[] args) {
        // Creating an array
        int[] array = {3, 5, 7, -2, 8, -6, 4};

        // Find and print the index of the first negative number
        int index = LinearSearch.findFirstNegative(array);
        if (index != -1) {
            System.out.println("The first negative number is at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
