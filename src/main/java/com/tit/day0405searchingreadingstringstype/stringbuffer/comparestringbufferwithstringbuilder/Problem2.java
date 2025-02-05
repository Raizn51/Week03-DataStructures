package com.tit.day0405searchingreadingstringstype.stringbuffer.comparestringbufferwithstringbuilder;
/*
StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
Problem:
Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
Approach:
- Initialize two StringBuffer and StringBuilder objects.
- Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
- Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
- Output the time taken by both classes for comparison.
*/


// Creating a class Problem2 to demonstrate the comparison of StringBuffer and StringBuilder
public class Problem2
{
    public static void main(String[] args)
    {
        // Create an instance of CompareStringBufferAndStringBuilder
        CompareStringBufferAndStringBuilder compare = new CompareStringBufferAndStringBuilder();

        // Measure the time taken to concatenate strings using StringBuilder
        long durationStringBuilder = compare.concatenationStringByStringBuilder();

        // Measure the time taken to concatenate strings using StringBuffer
        long durationStringBuffer = compare.concatenationStringByStringBuffer();

        // Output the time taken by both classes for comparison
        System.out.println("Time Taken to concatenate string 1000000 times is as follows:");
        System.out.println("StringBuffer: " + durationStringBuffer + " nanoseconds");
        System.out.println("StringBuilder: " + durationStringBuilder + " nanoseconds");
    }
}
