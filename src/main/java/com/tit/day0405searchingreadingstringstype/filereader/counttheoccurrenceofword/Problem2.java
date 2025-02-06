package com.tit.day0405searchingreadingstringstype.filereader.counttheoccurrenceofword;

/*
FileReader Problem 2: Count Specific Word Occurrences in a File Using FileReader
Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
- Create a FileReader to read from the file and wrap it in a BufferedReader.
- Initialize a counter variable to keep track of word occurrences.
- For each line in the file, split it into words and check if the target word exists.
- Increment the counter each time the word is found.
- Print the final count.
*/

import java.util.Scanner;

// Creating a class Problem2 to demonstrate the CountWordOccurrences functionality
public class Problem2
{
    public static void main(String[] args)
    {
        // Create an instance of CountWordOccurrences
        CountWordOccurrences counter = new CountWordOccurrences();

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Specify the file path
        String filePath = "src/main/java/com/tit/day0405searchingreadingstringstype/filereader/counttheoccurrenceofword/large_text_file.txt";

        // Prompt the user to enter the target word
        System.out.print("Please Enter the Word to Count: ");
        String targetWord = sc.nextLine();

        // Count the occurrences of the target word in the file
        int count = counter.countWordOccurrences(filePath, targetWord);

        // Print the final count
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");

        // Close the Scanner object
        sc.close();
    }
}
