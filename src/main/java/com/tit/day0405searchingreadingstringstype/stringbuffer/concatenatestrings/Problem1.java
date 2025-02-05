package com.tit.day0405searchingreadingstringstype.stringbuffer.concatenatestrings;
/*
StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
Problem:
You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
Approach:
- Create a new StringBuffer object.
- Iterate through each string in the array and append it to the StringBuffer.
- Return the concatenated string after the loop finishes.
- Using StringBuffer ensures efficient string concatenation due to its mutable nature.
*/

import java.util.Arrays;
import java.util.Scanner;

// Creating a class Problem1 to demonstrate the ConcatenateStrings functionality
class Problem1
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create an array of strings to concatenate
        String[] input = {"Hello1 ", "Hello2 ", "Hello3 ", "Hello4 ", "Hello5 ", "Hello6 ", "Hello7"};

        // Concatenate the strings using the ConcatenateStrings class
        String output = ConcatenateStrings.concatenateStringUsingStringBuffer(input);

        // Display the original string array and the concatenated string
        System.out.println("String Array Before Concatenation: " + Arrays.toString(input));
        System.out.println("String Array After Concatenation: " + output);

        // Close the Scanner object
        sc.close();
    }
}
