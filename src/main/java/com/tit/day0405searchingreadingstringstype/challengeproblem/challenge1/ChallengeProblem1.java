package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge1;

/*
ComparePerformance: Compare the performance of StringBuilder, StringBuffer, FileReader, and InputStreamReader
Problem:
Write a program that:
1. Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
2. Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
Approach:
1. StringBuilder and StringBuffer:
   - Create a list of strings (e.g., "hello").
   - Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
   - Measure and compare the time taken for each.
2. FileReader and InputStreamReader:
   - Read a large text file (100MB) using FileReader and InputStreamReader.
   - Count the number of words by splitting the text on whitespace characters.
   - Print the word count and compare the time taken for reading the file.
*/


// Create a class ChallengeProblem1 to demonstrate the ComparePerformance functionality
public class ChallengeProblem1
{
    public static void main(String[] args) {
        // Specify the file path (update this path to your local file)
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringstype/challengeproblem/challenge1/100MBFile.txt";

        // Measure and print the time for StringBuilder
        long durationStringBuilder = ComparePerformance.measureStringBuilder();
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " nanoseconds");

        // Measure and print the time for StringBuffer
        long durationStringBuffer = ComparePerformance.measureStringBuffer();
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " nanoseconds");

        // Measure and print the time for FileReader
        long durationFileReader = ComparePerformance.measureFileReader(filePath);
        System.out.println("Time taken by FileReader: " + durationFileReader + " nanoseconds");

        // Measure and print the time for InputStreamReader
        long durationInputStreamReader = ComparePerformance.measureInputStreamReader(filePath);
        System.out.println("Time taken by InputStreamReader: " + durationInputStreamReader + " nanoseconds");
    }
}
