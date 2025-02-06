package com.tit.day0405searchingreadingstringstype.filereader.counttheoccurrenceofword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Creating a class CountWordOccurrences to represent the counting of specific word occurrences in a file
public class CountWordOccurrences
{
    // Method to count how many times a specific word appears in the file
    public int countWordOccurrences(String filePath, String targetWord)
    {
        int wordCount = 0;

        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            // Loop to read each line from the file
            while ((line = br.readLine()) != null)
            {
                // Split the line into words
                String[] words = line.split("\\s+");
                // Loop to check if the target word exists in the line
                for (String word : words)
                {
                    if (word.equalsIgnoreCase(targetWord))
                    {
                        wordCount++;
                    }
                }
            }
        }
        catch (IOException e)
        {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }

        return wordCount;
    }
}
