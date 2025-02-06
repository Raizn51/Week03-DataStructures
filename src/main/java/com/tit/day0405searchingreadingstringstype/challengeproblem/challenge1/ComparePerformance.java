package com.tit.day0405searchingreadingstringstype.challengeproblem.challenge1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Creating a class ComparePerformance to represent comparing performance of StringBuilder, StringBuffer, FileReader, and InputStreamReader
public class ComparePerformance
{
    // Constant to specify the number of concatenations
    public static final int NUM_CONCATENATIONS = 1000000;

    // Method to measure the time taken by StringBuilder
    public static long measureStringBuilder()
    {
        // String to be concatenated
        String str = "hello";

        // Start time measurement
        long startTime = System.nanoTime();

        // Create a StringBuilder instance and concatenate strings
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NUM_CONCATENATIONS; i++) {
            sb.append(str);
        }

        // End time measurement
        long endTime = System.nanoTime();

        // Return the time taken for concatenation
        return endTime - startTime;
    }

    // Method to measure the time taken by StringBuffer
    public static long measureStringBuffer() {
        // String to be concatenated
        String str = "hello";

        // Start time measurement
        long startTime = System.nanoTime();

        // Create a StringBuffer instance and concatenate strings
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < NUM_CONCATENATIONS; i++) {
            sbf.append(str);
        }

        // End time measurement
        long endTime = System.nanoTime();

        // Return the time taken for concatenation
        return endTime - startTime;
    }

    // Method to measure the time taken by FileReader
    public static long measureFileReader(String filePath) {
        // Start time measurement
        long startTime = System.nanoTime();

        // Count words using FileReader
        int wordCount = countWordsUsingFileReader(filePath);

        // End time measurement
        long endTime = System.nanoTime();

        // Print word count
        System.out.println("Word count using FileReader: " + wordCount);

        // Return the time taken for reading the file
        return endTime - startTime;
    }

    // Method to measure the time taken by InputStreamReader
    public static long measureInputStreamReader(String filePath) {
        // Start time measurement
        long startTime = System.nanoTime();

        // Count words using InputStreamReader
        int wordCount = countWordsUsingInputStreamReader(filePath);

        // End time measurement
        long endTime = System.nanoTime();

        // Print word count
        System.out.println("Word count using InputStreamReader: " + wordCount);

        // Return the time taken for reading the file
        return endTime - startTime;
    }

    // Helper method to count words using FileReader
    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;

        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Loop to read lines and count words
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }

        // Return the word count
        return wordCount;
    }

    // Helper method to count words using InputStreamReader
    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;

        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            // Loop to read lines and count words
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }

        // Return the word count
        return wordCount;
    }
}
