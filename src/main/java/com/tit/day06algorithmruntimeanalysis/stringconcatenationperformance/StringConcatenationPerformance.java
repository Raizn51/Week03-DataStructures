package com.tit.day06algorithmruntimeanalysis.stringconcatenationperformance;

/*
Problem Statement: String Concatenation Performance
Description: Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
1. Define methods for concatenating strings using String, StringBuilder, and StringBuffer.
2. Measure the time taken to concatenate strings for each method.
3. Compare the performance results.
Goal: Understand the performance differences between String, StringBuilder, and StringBuffer for string concatenation.
*/

// Creating a class StringConcatenationPerformance to compare the performance of string concatenation methods
class StringConcatenationPerformance {
    public static void main(String[] args) {
        // Dataset sizes to test
        int[] sizes = {1000, 10000, 1000000};

        // Creating objects of StringConcatenation, StringBuilderConcatenation, and StringBufferConcatenation classes
        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        // Measure and display performance for each dataset size
        for (int size : sizes) {
            // String concatenation
            long startTime = System.nanoTime();
            stringConcat.concatenateWithString(size);
            long endTime = System.nanoTime();
            long stringTime = endTime - startTime;

            // StringBuilder concatenation
            startTime = System.nanoTime();
            stringBuilderConcat.concatenateWithStringBuilder(size);
            endTime = System.nanoTime();
            long stringBuilderTime = endTime - startTime;

            // StringBuffer concatenation
            startTime = System.nanoTime();
            stringBufferConcat.concatenateWithStringBuffer(size);
            endTime = System.nanoTime();
            long stringBufferTime = endTime - startTime;

            // Displaying results
            System.out.println("Dataset Size: " + size);
            System.out.println("String Time: " + stringTime / 1000000.0 + " ms");
            System.out.println("StringBuilder Time: " + stringBuilderTime / 1000000.0 + " ms");
            System.out.println("StringBuffer Time: " + stringBufferTime / 1000000.0 + " ms");
            System.out.println();
        }
    }
}
